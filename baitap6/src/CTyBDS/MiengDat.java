package CTyBDS;

import java.util.Scanner;

public class MiengDat {
    private int MaSo;
    private int dienTich;
    private int donGia;
    Scanner scanner = new Scanner(System.in);

    public MiengDat() {
    }

    public MiengDat(int maSo, int dienTich, int donGia) {
        MaSo = maSo;
        this.dienTich = dienTich;
        this.donGia = donGia;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getMaSo() {
        return MaSo;
    }

    public void setMaSo(int maSo) {
        MaSo = maSo;
    }

    public void nhapThongTin(){
        System.out.println("nhap Ma so Dat");
        MaSo = scanner.nextInt();
        System.out.println("nha[ don gia mot m2");
        donGia = scanner.nextInt();

    }
    public void tinhDienTich(){
    }

    @Override
    public String toString() {
        return "MiengDat{" + "MaSo=" + MaSo + ", dienTich=" + dienTich + ", donGia=" + donGia + '}';
    }
}
