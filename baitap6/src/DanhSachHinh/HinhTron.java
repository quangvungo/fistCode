package DanhSachHinh;

import java.util.Scanner;

public class HinhTron  extends HinhHoc{
    private int banKinh;
    Scanner scanner;
    public HinhTron() {
    }

    public HinhTron(int banKinh) {
        this.banKinh = banKinh;
    }

    public void nhapThongTin(){
        System.out.println("nhap ban kinh cua hinh tron");
        banKinh = scanner.nextInt();
    }
    @Override
    public void tinhDienTich() {
     double  dienTich = this.banKinh * this.banKinh * 3.14;
    }

    @Override
    public String toString() {
        return "HinhTron{" + "banKinh=" + banKinh + '}';
    }
}
