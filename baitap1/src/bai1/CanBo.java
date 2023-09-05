package bai1;

import java.util.Scanner;

public class CanBo {
    protected String name;
    protected int tuoi;
    protected String gioitinh;
    protected String diaChi;
Scanner scanner = new Scanner(System.in);
    public CanBo() {
        super();
    }

    public CanBo(String name, int tuoi, String gioitinh, String diaChi) {
        this.name = name;
        this.tuoi = tuoi;
        this.gioitinh = gioitinh;
        this.diaChi = diaChi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public void nhapThongTin(){
        System.out.println("nhap ho va ten");
        name = scanner.nextLine();
        System.out.println("nhap tuoi cua ban");
        tuoi = scanner.nextInt();
        System.out.println("nhap gioi tinh");
        gioitinh = scanner.nextLine();
        scanner.nextLine();
    }

    @Override
    public String toString() {
        return "CanBo{" +
                "name='" + name + '\'' +
                ", tuoi=" + tuoi +
                ", gioitinh='" + gioitinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", scanner=" + scanner +
                '}';
    }
}
