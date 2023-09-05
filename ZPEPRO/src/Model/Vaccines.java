package Model;

import java.util.Date;

public class Vaccines {
    private String Name;
    private String Code;
    private int Quality;
    private Date expiration;
    private double price;
    private Date lastInjectedDate;

    public Vaccines() {
    }

    public Vaccines(String name, String code, int quality, Date expiration, double price, Date lastInjectedDate) {
        Name = name;
        Code = code;
        Quality = quality;
        this.expiration = expiration;
        this.price = price;
        this.lastInjectedDate = lastInjectedDate;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public int getQuality() {
        return Quality;
    }

    public void setQuality(int quality) {
        Quality = quality;
    }

    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getLastInjectedDate() {
        return lastInjectedDate;
    }

    public void setLastInjectedDate(Date lastInjectedDate) {
        this.lastInjectedDate = lastInjectedDate;
    }

    @Override
    public String toString() {
        return "Vaccines{" +
                "Name='" + Name + '\'' +
                ", Code='" + Code + '\'' +
                ", Quality=" + Quality +
                ", expiration=" + expiration +
                ", price=" + price +
                ", lastInjectedDate=" + lastInjectedDate +
                '}';
    }
}
