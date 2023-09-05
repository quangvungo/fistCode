package VietCombank;

import java.util.Scanner;

public class Account {
    private long number;
    private String name;
    private long tienThemVao;
    private double AmountAcc;
    
    double LAI_SUAT = 0.035;
    long TIEN_MAT_DINH = 50;
    Scanner scanner = new Scanner(System.in);
    public Account() {
    }


    public Account(long number, String name, long tienThemVao, double amountAcc) {
        this.number = number;
        this.name = name;
        this.tienThemVao = tienThemVao;
        AmountAcc = amountAcc;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmountAcc() {
        return AmountAcc;
    }

    public void setAmountAcc(double amountAcc) {
        AmountAcc = amountAcc;
    }
    public void nopTienVaoTK(){
        long TienThem = (TIEN_MAT_DINH + tienThemVao);
    }
    public void rutTien(){
        long TienRut = (TIEN_MAT_DINH -tienThemVao);
    }
    public void daoHan(){
        double tienDaoHan = (TIEN_MAT_DINH + TIEN_MAT_DINH * LAI_SUAT);
    }
    public void nhapThongTin() {
        System.out.println("nhap so tai khoan ngan hang:");
        number = scanner.nextLong();
        System.out.println("nhap ten tai khoan ngan hang:");
        name = scanner.nextLine();
        System.out.println("nhap so tien trong tai khoan");
        AmountAcc = scanner.nextDouble();
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", AmountAcc=" + AmountAcc +
                '}';
    }
}
