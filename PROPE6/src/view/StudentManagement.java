package view;

import java.util.Comparator;
import model.*;
import model.comparator.*;
import utils.Validation;

public class StudentManagement extends Menu<String> {

    private static String[] options = {
            "List all students",
            "Add new student",
            "Search student",
            "Sort list students",
            "Edit information",
            "Exit"
    };

    private StudentList studentList;

    public StudentManagement() {
    }

    public StudentManagement(String title, String[] options, StudentList studentList) {
        super(title, options);

        this.studentList = studentList;
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                this.studentList.listAllStudents();
                break;

            case 2:
                this.studentList.addNewStudent();
                break;

            case 3:
                this.search();
                break;

            case 4:
                this.sort();
                break;

            case 5:
                this.studentList.editInfo();
                break;

            default:
                this.stop();
                break;
        }
    }


    private void search() {
        String[] searchOptions = {
                "Search by ID",
                "Search by old",
                "Search by GPA",
                "Return"
        };

        Menu<String> menu = new Menu<String>("Student Searching", searchOptions) {
            @Override
            public void execute(int choice) {
                String ID = null;
                int old = 0;
                float GPA = 0.f;

                Comparator<Student> comparator = null;

                switch (choice) {
                    case 1:
                        ID = Validation.getString("Enter ID (st. ID DE000000): ", "[dD][eE][\\d]{6}");
                        comparator = new StudentComparatorByID();
                        break;

                    case 2:
                        old = Validation.getInt("Enter old: ", 6, Integer.MAX_VALUE);
                        comparator = new StudentComparatorByOld();
                        break;

                    case 3:
                        GPA = Validation.getFloat("Enter GPA: ", 0.f, 10.f);
                        comparator = new StudentComparatorByGPA();
                        break;

                    default:
                        stop();
                        break;
                }

                if (comparator != null) {
                    studentList.listAllStudents(studentList.search(comparator, new Student(ID, null, old, GPA)));
                }
            }
        };

        menu.run();
    }


    private void sort() {
        String[] sortOptions = {
                "Sort by ID",
                "Sort by old",
                "Sort by GPA",
                "Return"
        };

        Menu<String> menu = new Menu<String>("Student Sorting", sortOptions) {
            @Override
            public void execute(int choice) {
                Comparator<Student> comparator = null;

                switch (choice) {
                    case 1:
                        comparator = new StudentComparatorByID();
                        break;

                    case 2:
                        comparator = new StudentComparatorByOld();
                        break;

                    case 3:
                        comparator = new StudentComparatorByGPA();
                        break;

                    default:
                        stop();
                        break;
                }

                if (comparator != null) {
                    studentList.listAllStudents(comparator);
                }
            }
        };

        menu.run();
    }


    public static void main(String[] args) {
        new StudentManagement("Student Management", options, new StudentList()).run();
    }
}
