/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class Customer {
    private String id;
    private String name;
    private String phone;
    private Date Dateofbirth;

    public Customer() {
    }

    public Customer(String id, String name, String phone, Date Dateofbirth) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.Dateofbirth = Dateofbirth;
    }











//    @Override
//    public String toString() {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//        return "Customer{" + "id= " + getId() + ", name= " + getName() + ", phone=" + getPhone() + ", Dateofbirth= " + dateFormat.format(getDateofbirth())+ '}';
//    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDateofbirth() {
        return Dateofbirth;
    }

    public void setDateofbirth(Date Dateofbirth) {
        this.Dateofbirth = Dateofbirth;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return "Customer{" + "id=" + id + ", name= " + name + ", phone=" + phone + ", Dateofbirth=" + dateFormat.format(Dateofbirth) + '}';
    }





}
