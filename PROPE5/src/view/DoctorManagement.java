package view;


import model.DoctorList;
import utils.Validator;

public final class DoctorManagement extends Menu<String>{
    private static String[] options = {
            "Add new doctor",
            "Update ",
            "Delete ",
            "Search doctor",
            "Sort list all doctor",
            "Exit"
    };
    private DoctorList doctorList;
    public DoctorManagement(){
    }

    public DoctorManagement(String title, String[] options, DoctorList doctorList) {
        super(title, options);
        this.doctorList = doctorList;
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                try {
                    this.doctorList.addNewDoctor();
                } catch (Exception ex) {
                    System.err.println("A problem occured: " + ex);
                }
                break;
            case 2:
                doctorList.updateDoctor();
                break;
            case 3:
                doctorList.deleteDoctor();
                break;
            case 4:
                this.search();
                break;
            case 5:
                this.doctorList.listAllDoctor();
                break;
            case 6:
                this.stop();
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
    private void search() {
        String[] searchOptions = {
                "Find by code",
                "Find by name",
                "Find by spec",
                "Find by avai",
                "Return"
        };
        Menu<String> menu = new Menu<String>("Doctor Searching", searchOptions) {
            @Override
            public void execute(int choice) {
                switch (choice) {
                    case 1:
                        String code = Validator.getString("Enter doctor code (st. ID B0000): ", "[docDOC][\\d]{4}");
                        doctorList.listAllDoctor(doctorList.searchDoctor(p -> p.getCode().equalsIgnoreCase(code)));
                        break;

                    case 2:
                        String name = Validator.getString("Enter Book Title: ");
                        doctorList.listAllDoctor(doctorList.searchDoctor(p -> p.getName().equalsIgnoreCase(name)));
                        break;

                    case 3:
                        String spec = Validator.getString("Enter Author: ");
                        doctorList.listAllDoctor(doctorList.searchDoctor(p -> p.getSpecialization().equalsIgnoreCase(spec)));
                        break;

                    case 4:
                        int avai = Validator.getInt("Enter avai: ", 1900, Integer.MAX_VALUE);
                        doctorList.listAllDoctor(doctorList.searchDoctor(p -> p.getAvailability() == avai));
                        break;

                    default:
                        stop();
                        break;
                }
            }
        };
        menu.run();
    }

    public static void main(String[] args) {
        new DoctorManagement("Doctor Management", options, new DoctorList()).run();
    }
}
