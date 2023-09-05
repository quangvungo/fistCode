/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viewer;

import Controller.Company;
import Model.Customer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public abstract class CompanyManagement<T> extends Menu {
    static ArrayList<Customer> cuslist=new ArrayList<>();
    private static Scanner sc;
    private final  Company comp;
    ValidDatation val=new ValidDatation();


    public CompanyManagement() {
        comp=new Company();
        sc=new Scanner(System.in);
    }
    public void cusMenu() {
        String menu[]={"Exit","Display all customers", "Add new customer",
                "Customer Search", "Write data to File",
                "Delete a customer by ID", "Update Phone and Date of Birth","Sort Customer"};

        Menu m;
        m = new Menu("Company Management System",menu) {
            @Override
            public void excute(int n) {
                switch (n) {
                    case 1: {
                        System.out.println("List of Customer");
//                        try {
//                            comp.readFile();
//                        } catch (FileNotFoundException ex) {
//                            Logger.getLogger(CompanyManagement.class.getName()).log(Level.SEVERE, null, ex);
//                        }
                        try {

                            comp.displayAllCustomer();
                        } catch (FileNotFoundException | ParseException ex) {
                            Logger.getLogger(CompanyManagement.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        break;
                    }
                    case 2: {
                        try {
                            addNewCus();
                        }
                        catch(ParseException ex) {
                            Logger.getLogger(CompanyManagement.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        break;
                    }

                    case 3 : {
                        customerSearching();
                        break;
                    }
                    case 4 : {

                        writeData();
                        break;
                    }
                    case 5 : {
                        removeByID();
                        break;
                    }
                    case 6 : {
                        cusUpdate();
                        break;
                    }
                    case 7: {
                        System.out.println("Sort Customer: ");
                        System.out.println("------------------");
                        try {
                            comp.SortCus();
                        } catch (FileNotFoundException | ParseException ex) {
                            Logger.getLogger(CompanyManagement.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        break;
                    }
                    case 0 : {
                        System.out.println("Thank you for using our services.");
                        System.exit(0);
                        break;
                    }
                }                }

        };
        m.run();

    }
    private void cusUpdate() {
        String[] mupdate={"Back to main menu","Update phone", "Update date of birth"};
        Menu m;
        m= new Menu("Customer updating",mupdate) {
            @Override
            public void excute(int n) {
                switch (n) {
                    case 1:  {
                        updatePhoneByID();
                        break;
                    }
                    case 2:  {
                        updateDateByID();
                        break;
                    }
                    case 0: cusMenu();
                        break;
                }            }
        };
        m.run();
    }
    private void customerSearching() {
        String[] mSearch = {"Back to main menu","Find by CustomerID", "Find by name",
                "Find by phone", "Find by Date"};
        Menu m;
        m = new Menu("Customer Searching", mSearch) {
            ArrayList<Customer> rc = new ArrayList<>();

            @Override
            public void excute(int n) {
                switch (n) {
                    case 1:  {
//                        AtomicReference<String> id=new AtomicReference<>(sc.nextLine());
//                        while(val.checkID(id.get())==null) {
//                            System.out.println("Enter id");
//                            id.set(sc.nextLine());
//                        }
                        String id=getValue("Enter ID: ");
                        //String id="KH0123";

                        rc = comp.search(c -> c.getId().equalsIgnoreCase(id));
                        break;
                    }
                    case 2:  {
                        String name = getValue("Enter name: ");
                        rc = comp.search(c -> c.getName().contains(name));
                        break;
                    }
                    case 3:  {
                        String phone = val.checkPhone(getValue("Enter phone number: "));
                        rc = comp.search(c -> c.getPhone().contains(phone));
                        break;
                    }
                    case 4:  {
                        System.out.print("Enter Date of Birth (dd/MM/yyyy): ");
                        String dobString = sc.nextLine().trim();
                        Date dob = val.validDate(dobString);
                        if (dob == null) {
                            System.out.println("Invalid Date of Birth. Date of Birth must be in the format 'dd/MM/yyyy'.");
                            return;
                        }
                        ArrayList<Customer> results = comp.search(p -> p.getDateofbirth().equals(dob));
                        comp.displayCus(results);
                        break;
                    }
                    case 0: {
                        cusMenu();
                        break;
                    }
                    default: System.out.println("Out of function!");
                }
                if (!rc.isEmpty())
                    comp.displayCus(rc);
                else
                    System.out.println("Not found any customers.");
            }
        };
        m.run();

    }
    private String getValue(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }



    public void addNewCus() throws ParseException {
        String id = null, name = null, phone = null;
        Date dob = null;
        while (id == null)
            id = val.checkID(getValue("Enter ID: "));
        name = getValue("Enter name: ");
        while (phone == null)
            phone = val.checkPhone(getValue("Enter phone number: "));
        while (dob == null)
            dob = val.validDate(getValue("Enter date of birth: "));
        comp.AddNewCus(new Customer(id, name, phone, dob));

    }


    public void updateDateByID() {
        String id = val.checkID(getValue("Enter ID: "));
        ArrayList<Customer> list = comp.search(c -> c.getId().equalsIgnoreCase(id));
        if (!list.isEmpty()) {
            Date newDate = val.validDate(getValue("Enter date of birth: "));
            if (newDate != null)
                comp.updateDate(list, newDate);
            else
                System.out.println("Updating is not success");
        }
        else
            System.out.println("Not found any customers.");

    }
    public void updatePhoneByID() {
        String id=val.checkID(getValue("Enter ID: "));
        ArrayList<Customer> clist=comp.search(c->c.getId().equalsIgnoreCase(id));
        if(!clist.isEmpty()) {
            String newnum=val.checkPhone(getValue("Enter new phone number: "));
            if(newnum!=null)
                comp.updatePhone(clist, newnum);
            else System.out.println("Update is not success");
        }
        else System.out.println("not found customer");
    }
    private void removeByID() {
        String id = val.checkID(getValue("Enter ID: "));
        comp.deleteIDcus(id);

    }
    private void writeData() {
        if(comp.writefile("C:\\Users\\quang\\IdeaProjects\\lab6part2\\src\\Customer1.txt"))
            System.out.println("Success");
        else System.out.println("Error");
    }


}


