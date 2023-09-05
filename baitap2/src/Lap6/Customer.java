package Lap6;

import javax.sound.midi.Soundbank;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Date;
import java.util.Scanner;

public class Customer {
    private int ID;
    private String Name;
    private int Phone ;
    private Date dateOfBirth;
    Scanner scanner = new Scanner(System.in);

    public Customer() {
    }

    public Customer(int ID, String name, int phone, Date dateOfBirth) {
        this.ID = ID;
        Name = name;
        Phone = phone;
        this.dateOfBirth = dateOfBirth;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }



    @Override
    public String toString() {
        return "Customer{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Phone=" + Phone +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", scanner=" + scanner +
                '}';
    }
}
