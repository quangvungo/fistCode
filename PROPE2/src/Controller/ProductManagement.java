package Controller;

import Model.Producer;
import View.Menu;

public class ProductManagement extends Menu<String> {

    private static String[] options = {
            "List all products",
            "Search products ",
            "Add new product ",
            "Exit"
    };
    private Producer producer;

    public ProductManagement(String productManagement, String[] options, Producer products) {
        super(productManagement,options);
        this.producer = products;
    }

    public void execute(int choice) {
        switch (choice) {
            case 1:
                producer.listAllBook();
                break;
            case 2:
                this.search();
                break;
            case 3:
                producer.addNewProduct();
                break;
            case 4:
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
    private void search(){
        String[] searchOptions = {
                "Find by ProductID",
                "Find by ProductName",
                "Find by ProductManufacturingDate",
                "Exit"
        };
        Menu<String> menu = new Menu<String>("Product Searching", searchOptions) {

            @Override
            public void execute(int choice) {
                switch (choice) {
                    case 1:
                        System.out.println("Enter ProductID");
                        producer.search();
                        break;

                    case 2:
                        System.out.println("Enter ProName");
                        break;

                    case 3:
                        System.out.println("Enter ProductManufacturingDate");
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
        new ProductManagement("Product Management", options, new Producer()).run();
    }
}
