package bt2;

import java.util.Scanner;

public class NhanVien {
    protected String name;
    protected String luong;

    public NhanVien() {
    }

    public NhanVien(String name, String luong) {
        this.name = name;
        this.luong = luong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLuong() {
        return luong;
    }

    public void setLuong(String luong) {
        this.luong = luong;
    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ten nhan vien");
        this.name = scanner.nextLine();
        System.out.println("nhap luong nhan vien");
        this.luong = scanner.nextLine();
    }
 public void tinhLuong(){

 }
    @Override
    public String toString() {
        return "NhanVien{" + "name='" + name + '\'' + ", luong='" + luong + '\'' +  '}';
    }
}
