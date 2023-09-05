/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class ValidDatation {

    public ValidDatation() {
    }



    public Date validDate(String dateString) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);

        try {
            Date parsedDate = dateFormat.parse(dateString);
            if (!checkDayInYear(parsedDate)) {
                throw new ParseException("Invalid date", 0);
            }
            return parsedDate;
        } catch (ParseException e) {
            return null;
        }
    }
    //        if(dob!=null)
//            checkDayInYear(dob);
//        return dob;
//    }
    private boolean checkDayInYear(Date dob) {
        Calendar cal=Calendar.getInstance();
        cal.setLenient(false);
        cal.setTime(dob);

        int year;
        int month;
        int day;

        try {
            year = cal.get(Calendar.YEAR);
            month = cal.get(Calendar.MONTH) + 1;
            day = cal.get(Calendar.DAY_OF_MONTH);
        } catch (Exception e) {
            return false;
        }
        int maxDay = isValidDay(month,year);
        if (day < 1 || day > maxDay) {
            return false;
        }

        return true;
    }

    public int isValidDay(int month, int year) {


        if(month>0&&month<13) {
            switch (month) {
                case 2:
                    if(isLeapYear(year))
                        return  29;
                    else
                        return 28;

                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;

                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                default:
                    return 0;
            }
        }
        else {
            System.out.println("Error");
            return 0;
        }
    }
    private boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }

    public  String checkPhone(String phone) {
        if(phone.length() == 10 && phone.startsWith("09") && phone.matches("[0-9]+$"))
            return phone;
        return null;
    }
    public  String checkID(String id) {
        if (id.matches("^KH\\d{4}$"))
            return id;
        return null;
    }



}
