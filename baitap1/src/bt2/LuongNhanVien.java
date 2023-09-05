package bt2;

import java.util.ArrayList;
import java.util.Scanner;

public class LuongNhanVien {

    public static void main(String[] args) {
        ArrayList<NhanVien> nhanViens = new ArrayList<>();
        int soNhanVienFullTime, soNhanVienPassTime;
        Scanner scanner = new Scanner(System.in);
        NhanVien nhanVien;
        ArrayList<NhanVien> arrNhanVien = new ArrayList<>();
        System.out.println("Nhap so nhan vien toan thoi gian: ");
        soNhanVienFullTime = scanner.nextInt();
        System.out.println("NHAP NHAN VIEN TOAN THOI GIAN");
        for (int i = 0; i < soNhanVienFullTime; i++) {
            System.out.println("Nhap thong tin nhan vien toan thoi gian thu" + (i + 1) + ":");
            nhanVien = new FullTime();
            nhanVien.nhap();
            arrNhanVien.add(nhanVien);
        }
        System.out.println("Nhap so nhan vien thoi vu: ");
        soNhanVienPassTime = scanner.nextInt();
        System.out.println("NHAP THONG TIN NHAN VIEN THOI VU");
        for (int i = 0; i < soNhanVienPassTime; i++) {
            System.out.println("Nhap thong tin nhan vien thoi vu thu" + (i + 1) + ":");
            nhanVien = new PartTime();
            nhanVien.nhap();
            arrNhanVien.add(nhanVien);
        }
        System.out.println("Thong Tin nhan vien");
        for (NhanVien nv : arrNhanVien) {
            nv.tinhLuong();
            System.out.println(nv.toString());
        }
    }
}
