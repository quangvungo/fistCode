package View;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Validation {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getInt() {
        return getInt(null, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static int getInt(int minRange, int maxRange) {
        return getInt(null, minRange, maxRange);
    }

    public static int getInt(String msg) {
        return getInt(msg, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static int getInt(String msg, int minRange, int maxRange) {
        if (minRange > maxRange) {
            int temp = minRange;
            minRange = maxRange;
            maxRange = temp;
        }

        int value = Integer.MIN_VALUE;

        do {
            try {
                if (msg != null) {
                    System.out.print(msg);
                }

                value = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Please enter again...");
            }
        } while (value < minRange || value > maxRange);

        return value;
    }

    public static String getString(String msg, String pattern) {
        String value = null;

        do {
            value = getString(msg);
        } while (!value.matches(pattern));

        return value;
    }

    public static String getString(String msg) {
        String value = null;

        while (true) {
            if (msg != null) {
                System.out.print(msg);
            }

            value = scanner.nextLine().replaceAll("\\s+", " ").trim();

            if (!value.isEmpty() && !value.isEmpty()) {
                break;
            }

            System.err.println("Please enter again...");
        }

        return value;
    }

    public static String inputString() {
        while (true) {
            String input = scanner.nextLine();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.println("Please enter a non-empty string.");
        }
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
    public static boolean inputYN() {
        while (true) {
            System.out.println("Enter y/Y or n/N.");
            String input = Validation.inputString();
            if (input.equalsIgnoreCase("Y")) {
                return true;
            }
            else if (input.equalsIgnoreCase("N")) {
                return false;
            }
            else System.out.println("Invalid input. Try again.");
        }
    }
}
