package Model;

import utils.Validator;

import java.util.ArrayList;
import java.util.List;

public class Producer extends ArrayList<Product> {
    private List<Product> list;
    public Producer(){
        this.list = new ArrayList<>();
    }
    public void listAllBook() {
        int total = list.size();

        if (total <= 0) {
            System.err.println("Sorry. Nothing to print.");

            return;
        }


        System.out.println("List all Product");
        System.out.println("--------------------------------");
        System.out.printf("%-15s%-25s%-8s%-5s\n", "ProductID", "ProductName", "UnitPrice", "Quantity", "Version","ProductManufacturingDate");

        for (Product product : list) {
            System.out.println(product);
        }

        System.out.println("--------------------------------");
        System.out.println("Total: " + total + " Book.");
    }
    public void addNewProduct() {
        System.out.println("Add new product");
        System.out.println("--------------------------------");

        String productID = null;
        String productName = null;
        String unitPrice = null;
        String quantity = null;
        String version = null;
        String productManufacturingDate = null;

        while (true) {
            productID = Validator.getString("Enter ID (st. ID DE000000): ", "[dD][eE][\\d]{6}").toUpperCase();

            if (!this.isProductIDDuplicated(productID)) {
                break;
            }
        }
        productID = Validator.getString("Enter ID: ");
        productName = Validator.getString("Enter name: ");
        unitPrice = Validator.getString("Enter Price");
        quantity = Validator.getString("Enter Quantity");
        version = Validator.getString("Enter Version");
        productManufacturingDate = Validator.getString("Enter Date");
        this.list.add(new Product(productID, productName, unitPrice, quantity,version,productManufacturingDate));
    }
    public List<Product> search() {
        List<Product>
                newList = new ArrayList<>();
        return newList;
    }
    private Product search(String ID) {
        for (Product p : this.list) {
            if (p.getProductID().equalsIgnoreCase(ID)) {
                return p;
            }
        }

        return null;
    }
    private boolean isProductIDDuplicated(String ID) {
        ID = ID.trim();

        for (Product product : this.list) {
            if (product.getProductID().equalsIgnoreCase(ID)) {
                return true;
            }
        }

        return false;
    }
}
