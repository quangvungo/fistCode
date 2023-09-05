package FPTsoftWare;

import java.util.Scanner;

public class Developer extends NhanVienFPT {
    protected int soGioOverTime;
    protected int luongCoBan;
    protected long LUONG_DEVELOPER = 200000;
    Scanner scanner = new Scanner(System.in);

    public Developer() {
    }

    public Developer(int soGioOverTime, int luongCoBan) {
        this.soGioOverTime = soGioOverTime;
        this.luongCoBan = luongCoBan;
    }

    public int getSoGioOverTime() {
        return soGioOverTime;
    }

    public void setSoGioOverTime(int soGioOverTime) {
        this.soGioOverTime = soGioOverTime;
    }

    public int getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(int luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public void nhapThongTin(){
        System.out.println("nhap so gio oveetime");
        soGioOverTime = scanner.nextInt();
        System.out.println("nhap luong co ban cua ban");
        luongCoBan = scanner.nextInt();
    }
    public void tinhLuong(){
        long luongNhanVien = this.luongCoBan + this.soGioOverTime * LUONG_DEVELOPER;
    }

    @Override
    public String toString() {
        return "Developer{" + "soGioOverTime=" + soGioOverTime + ", luongCoBan=" + luongCoBan + ", LUONG_DEVELOPER=" + LUONG_DEVELOPER + ", scanner=" + scanner + '}';
    }
}
