package bai1;

import java.util.Scanner;

public class CongNhan extends CanBo{
    private int bacCongNhan;

    public CongNhan() {
        super();
    }

    public CongNhan(String name, int tuoi, String gioitinh, String diaChi, int bacCongNhan) {
        super(name, tuoi, gioitinh, diaChi);
        this.bacCongNhan = bacCongNhan;
    }

    public CongNhan(int bacCongNhan) {
        bacCongNhan = bacCongNhan;
    }

    public int getBacCongNhan() {
        return bacCongNhan;
    }

    public void setBacCongNhan(int bacCongNhan) {
        bacCongNhan = bacCongNhan;
    }
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin();
        System.out.println("nhap cap bac cong nhan: ");
        bacCongNhan = scanner.nextInt();
    }



    @Override
    public String toString() {
        return "CongNhan{" +
                "name='" + name + '\'' +
                ", tuoi=" + tuoi +
                ", gioitinh='" + gioitinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                "bacCongNhan=" + bacCongNhan +
                '}';
    }
}
