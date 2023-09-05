import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Menu {
    private Check check;
    private List<Doctor> doctorList;
    private Doctor doctorToUpdate;

    public Menu() {
    }

    public Menu(Check check, List<Doctor> doctorLis) {
        this.check = check;
        this.doctorList = new ArrayList<>();
    }
    public void displayMenu(){
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 5) {
            menu();

            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addDoctor();
                    break;
                case 2:
                    updateDoctor();
                    break;
                case 3:
                    deleteDoctor(); // Xóa bác sĩ
                    break;
                case 4:
                    searchNameDoctor();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
    public void addDoctor(){
        String code = check.inputString("Enter Code: ");
        String name =check.inputString("Enter Name: ");
        String specialization = check.inputString("Enter Specialization: ");
        int availability = check.inputInt("Enter Availability: ");
        Doctor doctor =new Doctor(code,name,specialization,availability);
        doctorList.add(doctor);
    }
    public void menu(){
        System.out.println("==============Doctor Management==============");
        System.out.println("1. Add Doctor: ");
        System.out.println("2. Update Doctor: ");
        System.out.println("3. Delete Doctor:");
        System.out.println("4. Search Doctor: ");
        System.out.println("5. Exit");
    }
    public void updateDoctor() {
        System.out.println("---------- Update Doctor --------");
        String code = check.inputString("Enter Code: ");

        Optional<Doctor> doctorOptional = doctorList.stream()
                .filter(doctor -> doctor.getCode().equals(code))
                .findFirst();

        if (doctorOptional.isPresent()) {
            Doctor doctor = doctorOptional.get();
            String newName = check.inputString("Enter Name: ");
            String newSpecialization = check.inputString("Enter Specialization: ");
            int newAvailability = check.inputInt("Enter Availability: ");

            doctor.setName(newName);
            doctor.setSpecialization(newSpecialization);
            doctor.setAvailability(newAvailability);

            System.out.println("Update success.");
        } else {
            System.out.println("Doctor with code " + code + " does not exist.");
        }
    }
    public void deleteDoctor() {
        System.out.println("---------- Delete Doctor --------");
        String code = check.inputString("Enter Code: ");

        Optional<Doctor> doctorOptional = doctorList.stream()
                .filter(doctor -> doctor.getCode().equals(code))
                .findFirst();

        if (doctorOptional.isPresent()) {
            doctorList.remove(doctorOptional.get());
            System.out.println("Delete success.");
        } else {
            System.out.println("Doctor with code " + code + " does not exist.");
        }
    }
    public void searchNameDoctor() {
        System.out.println("---------- Search Doctor --------");
        String name = check.inputString("Enter name Doctor: ");
        System.out.println("--------- Result ------------");
        boolean found = false;
        for (Doctor doctor : doctorList) {
            if (doctor.getName().equalsIgnoreCase(name)) {
                System.out.println(doctor);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No doctor found with name: " + name);
        }
    }

}
