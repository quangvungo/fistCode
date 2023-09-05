package Controller;

import Model.VaccineList;
import View.Menu;

import java.io.FileNotFoundException;
import java.text.ParseException;

public class VaccineManager extends Menu<String> {
    private static String[] options = {
            "Display All Vaccines From File",
            "Add a Vaccine ",
            "Delete a Vaccine by code ",
            "Sort Vaccine by name",
            "Save to File",
            "Exit"
    };
    private static VaccineList vaccineList;
    public VaccineManager(){
    }
    public VaccineManager(String title, String[] options, VaccineList vaccineList) {
        super(title, options);
        this.vaccineList = vaccineList;
    }
    public void execute(int choice) throws FileNotFoundException, ParseException {
        switch (choice) {
            case 1:
                vaccineList.displayVaccine();
                break;
            case 2:
                try {
                    this.vaccineList.addVaccines();
                } catch (Exception ex) {
                    System.err.println("A problem occured: " + ex);
                }
                break;
            case 3:
                vaccineList.deleteVaccines();
                break;
            case 4:
                vaccineList.SortCus();
                break;
            case 5:
                break;
            case 6:
                this.stop();
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        new VaccineManager("Vaccine Management", options, new VaccineList()).run();
    }
}
