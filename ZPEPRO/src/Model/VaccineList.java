package Model;

import View.Validation;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class VaccineList extends ArrayList<Vaccines> {
    private ArrayList<Vaccines> vaccinesArrayList;
    Validation validation = new Validation();
    public VaccineList(){
        super();
    }
    public void addVaccines() {
        if (this.size() >= 100) {
            System.out.println("The list can only hold 100 doctors and is full.");
        }
        System.out.println("Add new Vaccines");
        System.out.println("--------------------------------");

        String newVaccineName = null;
        String newVaccineCode = null;
        int newquantity = 0;
        Date newexpirationDate = null;
        int newPrice = 0;
        Date newlastjectedDate = null;

        while (true) {
            newVaccineName= Validation.getString("Enter Vaccine code (st.01): ", "[dD][\\d]{2}");
            if (!this.isVaccineIDDuplicated(newVaccineCode)) {
                break;
            }
        }
        newVaccineCode=validation.getString("Enter Vaccine Code");
        newVaccineName = validation.getString("Enter Vaccine name: ");
        newquantity = validation.getInt("Enter Vaccine specialization: ");
        newexpirationDate = validation.validDate("Enter Vaccine availability: ");
        newPrice =validation.getInt("Enter Vaccine Price");

        this.add(new Vaccines(newVaccineCode,newVaccineName,newquantity,newexpirationDate,newPrice,newlastjectedDate));
    }
    private boolean isVaccineIDDuplicated(String code) {
        code = code.trim().toUpperCase();

        for (Vaccines vaccines : this) {
            if (vaccines.getCode().equalsIgnoreCase(code)) {
                return true;
            }
        }
        return false;
    }
    public int searchID(String code) {
        for (Vaccines vaccines : this) {
            if (vaccines.getCode().equals(code)) {
                return this.indexOf(vaccines);
            }
        }
        return -1;
    }
    public void deleteVaccines() {
        System.out.println("------REMOVE Vaccines------");
        if (this.isEmpty()) {
            System.out.println("No Vaccines");
            return;
        }
        String code = Validation.getString("Enter Vaccines code (st. ID D00): ", "[dD][\\d]{2}");
        int index = searchID(code);
        for (Vaccines vaccines : this) {
            if (vaccines.getCode().equals(code)) {
                this.indexOf(vaccines);
            }
        }
        if (index == -1) {
            System.out.println("Code not found");
            return;
        }
        this.remove(index);
        System.out.println("Remove succesfully");
    }
    public void SortCus() throws FileNotFoundException, ParseException {
        if(vaccinesArrayList.isEmpty()) {
            readFile("src\\folder\\Customer.txt");
            vaccinesArrayList.sort((vaccines1, vaccines2) -> vaccines2.getName().compareTo(vaccines1.getName()));
            for (Vaccines vaccines : vaccinesArrayList) {
                System.out.println(vaccines.getName());
            }
        }
        else {
            vaccinesArrayList.sort((vaccines1, vaccines2) -> vaccines2.getName().compareTo(vaccines1.getName()));
            for (Vaccines vaccines : vaccinesArrayList) {
                System.out.println(vaccines.getName());
            }
        }
    }
    public void readFile(String p) throws FileNotFoundException, ParseException {

        File file = new File(p);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            String[] tokens = line.split(",");

            String name = tokens[0];
            String code=tokens[1];
            int quantity=validation.getInt(tokens[2]);
            Date expriationdDate=validation.validDate(tokens[3]);
            int price = validation.getInt(tokens[2]);
            Date lastInjectDate = validation.validDate(tokens[5]);

            Vaccines v = new Vaccines(name,code,quantity,expriationdDate,price,lastInjectDate);
            vaccinesArrayList.add(v);

        }
    }
       public void displayVaccine() throws FileNotFoundException, ParseException {
        if(vaccinesArrayList.isEmpty()) {
            readFile("C:\\Users\\quang\\IdeaProjects\\LAB6part3\\src\\folder\\Customer.txt");
        }
        System.out.println("-------------------");
        if(!vaccinesArrayList.isEmpty()&&vaccinesArrayList!=null) {
            vaccinesArrayList.forEach(c->System.out.println(c));
            System.out.println("--------------------");
            System.out.println("Total: "+vaccinesArrayList.size()+" Vaccines");
        }
        else {

            System.out.println("Total: "+vaccinesArrayList.size()+"Vaccines");       }
    }
}
