package FPTsoftWare;

import LuongNhanVienCafe.NhanVienPartTime;

import java.util.ArrayList;
import java.util.Scanner;

public class ThanhToanLuong {
    public static void main(String[] args) {
        int luongTrungBinh = 0, tongLuong = 0;
        int choose;
        int soNhanVien;
        Scanner scanner = new Scanner(System.in);
        NhanVienFPT nhanVienFPT = new NhanVienFPT();
        ArrayList<NhanVienFPT> arrNhanVien = new ArrayList<>();

        System.out.print("Nhập số luong nhân viên FPT: ");
        soNhanVien = scanner.nextInt();
        System.out.println("NHẬP THÔNG TIN NHÂN VIÊN TAI FPT");
        for (int i = 0; i < soNhanVien; i++) {
            System.out.println("Nhập thông tin Nhan vien FPT thứ " + (i + 1) + ": ");
            System.out.println("chon loai nhan vien(1-Developer,2-Tester)");
            choose = scanner.nextInt();
          if (choose == 1){
              nhanVienFPT = new Developer();
          }
          else if (choose == 2) {
              nhanVienFPT = new Tester();
          }
          nhanVienFPT.nhapThongTin();
          nhanVienFPT.tinhLuong();
        }

        System.out.println("THÔNG TIN NHÂN VIÊN");
        for (int i = 0;i <soNhanVien; i++) {
            System.out.println(nhanVienFPT.toString());
        }
    }
}

