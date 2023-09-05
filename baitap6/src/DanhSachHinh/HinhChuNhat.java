package DanhSachHinh;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc {
    private int chieuDai, chieuRong;
    Scanner scanner;
    public HinhChuNhat() {
    }

    public HinhChuNhat(int chieuDai, int chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }
    @Override
    public void tinhDienTich() {
        double dienTich = this.chieuDai * this.chieuRong;
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" + "chieuDai=" + chieuDai + ", chieuRong=" + chieuRong + '}';
    }
}
