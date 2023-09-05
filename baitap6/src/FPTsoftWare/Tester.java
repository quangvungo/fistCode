package FPTsoftWare;

import java.util.Scanner;

public class Tester extends NhanVienFPT {
    protected int soLoi;
    protected int luongCoBan;
    protected long LUONG_TESTER = 50000;
    Scanner scanner = new Scanner(System.in);

    public Tester() {
    }

    public Tester(int soLoi, int luongCoBan, Scanner scanner) {
        this.soLoi = soLoi;
        this.luongCoBan = luongCoBan;
        this.scanner = scanner;
    }

    public int getSoLoi() {
        return soLoi;
    }

    public void setSoLoi(int soLoi) {
        this.soLoi = soLoi;
    }

    public int getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(int luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
    public void nhapThongTin() {
        System.out.println("nhap so loi ma ban da phat hien");
        soLoi = scanner.nextInt();
        System.out.println("nhap luong co ban cua ban");
        luongCoBan = scanner.nextInt();
    }
    public void tinhLuong(){
        long luongNhanVien = this.luongCoBan + this.soLoi * LUONG_TESTER;
    }

    @Override
    public String toString() {
        return "Tester{" + "soLoi=" + soLoi + ", luongCoBan=" + luongCoBan + ", LUONG_TESTER=" + LUONG_TESTER + ", scanner=" + scanner + '}';
    }
}
