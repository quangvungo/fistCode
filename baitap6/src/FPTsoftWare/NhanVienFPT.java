package FPTsoftWare;

import java.util.Scanner;

public class NhanVienFPT {
    private String maNhanVien;
    private String HoTen;
    private int Tuoi;
    private int SDT;
    private String email;
    Scanner scanner = new Scanner(System.in);
    public NhanVienFPT() {
    }

    public NhanVienFPT(String maNhanVien, String hoTen, int tuoi, int SDT, String email) {
        this.maNhanVien = maNhanVien;
        HoTen = hoTen;
        Tuoi = tuoi;
        this.SDT = SDT;
        this.email = email;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int tuoi) {
        Tuoi = tuoi;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void nhapThongTin() {
        System.out.println("nhap ma nhan vien");
        maNhanVien = scanner.nextLine();
        System.out.println("Nhap ho ten cua ban");
        HoTen = scanner.nextLine();
        System.out.println("nhap tuoi cua ban");
        Tuoi = scanner.nextInt();
        System.out.println("nhap so dien thoai");
        SDT = scanner.nextInt();
        System.out.println("nhap email cua ban");
        email = scanner.nextLine();
    }
    public void tinhLuong(){
    }


    @Override
    public String toString() {
        return "NhanVienFPT{" + "maNhanVien='" + maNhanVien + '\'' + ", HoTen='" + HoTen + '\'' + ", Tuoi=" + Tuoi + ", SDT=" + SDT + ", email='" + email + '\'' + ", scanner=" + scanner + '}';
    }
}
