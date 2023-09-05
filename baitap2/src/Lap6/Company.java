package Lap6;


import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Customer> customerList = new ArrayList<>();
    public Company() {
    }
    public List<Customer> getCustomerList() {
        return customerList;
    }
    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }
    public void printCustomerList() {
        System.out.println("----- CUSTOMER LIST -----");
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

}
