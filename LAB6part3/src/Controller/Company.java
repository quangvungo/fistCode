/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Customer;
import View.ValidDatation;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import java.util.function.Predicate;

/**
 *
 * @author DELL
 */
public final class Company  {
    private  ArrayList<Customer> cuslist;
    ValidDatation val=new ValidDatation();
    public Company() {
        readfile("C:\\Users\\quang\\IdeaProjects\\LAB6part3\\src\\folder\\Customer.txt");
    }


    public void SortCus() throws FileNotFoundException, ParseException {
        if(cuslist.isEmpty()) {
            readFile("C:\\Users\\quang\\IdeaProjects\\LAB6part3\\src\\folder\\Customer.txt");
            cuslist.sort((customer1, customer2) -> customer2.getName().compareTo(customer1.getName()));
            for (Customer customer : cuslist) {
                System.out.println(customer.getName());
            }
        }
        else {
            cuslist.sort((customer1, customer2) -> customer2.getName().compareTo(customer1.getName()));
            for (Customer customer : cuslist) {
                System.out.println(customer.getName());
            }   
        }
    }
    public ArrayList<Customer> readfile(String p) {
        // ArrayList<Customer> cuslist;

        cuslist = new ArrayList<>();

        try {
            FileInputStream fis=new FileInputStream(p);
            InputStreamReader isr=new InputStreamReader(fis,StandardCharsets.UTF_8);
            BufferedReader br=new BufferedReader(isr);
            String line=br.readLine();
            while(line!=null) {
                String arr[];
                arr = line.split(";");
                if(arr.length==4) {
                    arr[0]=val.checkID(arr[0]);
                    arr[2]=val.checkPhone(arr[2]);
                    Date dob=val.validDate(arr[3]);
                    if(dob!=null)
                        if(arr[0]!=null&&arr[2]!=null)
                            cuslist.add(new Customer(arr[0],arr[1],arr[2],dob));

                }
                line=br.readLine();
            }
            br.close();
            isr.close();
            fis.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        return cuslist;
    }
    public void AddNewCus(Customer c) {
        cuslist.add(c);
    }

    public ArrayList<Customer> search(Predicate<Customer> p) {
        ArrayList<Customer> cuslistfind=new ArrayList<>();
        for(Customer cus:cuslist) {
            if(p.test(cus)) //cuslist.add(cus);
                cuslistfind.add(cus);
        }
        return cuslistfind;
    }
    public boolean writefile(String path) {
        try {

            BufferedWriter bw=new BufferedWriter(new FileWriter(path));
            for(Customer t:cuslist) {
                String line=t.getId()+";"+t.getName()+";"+t.getPhone()+";"+getDateFormat(t.getDateofbirth());
                bw.write(line);
                bw.newLine();
            }
            bw.close();

            return true;
//        } catch (FileNotFoundException e) {
//            System.out.println("Không tìm thấy file hoặc không có quyền truy cập đọc file.");
//            e.printStackTrace();
//            return false;
        } catch (IOException ex) {
            System.out.println("Xảy ra sự cố khi đọc file. Có thể file đang được mở hoặc bị hỏng.");
            ex.printStackTrace();
            return false;
        }
    }
    private String getDateFormat(Date date) {
        SimpleDateFormat df=new SimpleDateFormat("dd/mm/yyyy");
        return df.format(date);
    }
    public void updateDate(ArrayList<Customer> p, Date dob) {
        p.forEach(c->c.setDateofbirth(dob));
        displayCus(p);
    }

    public void updatePhone(ArrayList<Customer> p, String phone) {
        p.forEach(c->c.setPhone(phone));
        displayCus(p);
    }
    public void displayAllCustomer() throws FileNotFoundException, ParseException {
        if(cuslist.isEmpty()) {
            readFile("C:\\Users\\quang\\IdeaProjects\\LAB6part3\\src\\folder\\Customer.txt");
        }
        System.out.println("-------------------");
        if(!cuslist.isEmpty()&&cuslist!=null) {
            cuslist.forEach(c->System.out.println(c));
            System.out.println("--------------------");
            System.out.println("Total: "+cuslist.size()+" Customers");
        }
        else {

            System.out.println("Total: "+cuslist.size()+"Customers");       }
        // cuslist.clear();
    }
    public void displayCus(ArrayList<Customer> rc) {
        System.out.println("List of Customer");
        System.out.println("----------------");
        if(rc.isEmpty()) System.out.println("List is empty");
        else {
//            rc.forEach(c->System.out.println(c));
            for(Customer c:rc) {
                System.out.println(c.toString());
            }
            System.out.println("--------------");
            System.out.println("Total: "+ rc.size());
        }
    }
    public void deleteIDcus(String customerId) {
        Iterator<Customer> iterator = cuslist.iterator();
        boolean found = false;
        while (iterator.hasNext()) {
            Customer cus = iterator.next();
            if (cus.getId().equals(customerId)) {
                iterator.remove();
                System.out.println("Khách hàng có mã số " + customerId + " đã được xóa.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy khách hàng có mã số " + customerId);
        }
    }
    public void readFile(String p) throws FileNotFoundException, ParseException {

        File file = new File(p);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            String[] tokens = line.split(",");

            String id = val.checkID(tokens[0]);
            String name=tokens[1];
            String phone=val.checkPhone(tokens[2]);
            Date dob=val.validDate(tokens[3]);

            Customer c = new Customer(id,name,phone,dob);
            cuslist.add(c);

        }
    }


}



//Note: File customer.txt and customer1.txt placed in the
//project folder equal to
//the scr folder of application

