package CTyBDS;

import com.sun.org.apache.xerces.internal.impl.xs.util.XSObjectListImpl;

import java.util.Scanner;

public class DatHCN extends MiengDat{
    private int dai, rong;
    Scanner scanner = new Scanner(System.in);

    public DatHCN() {
    }

    public DatHCN(int maSo, int dienTich, int donGia, int dai, int rong) {
        super(maSo, dienTich, donGia);
        this.dai = dai;
        this.rong = rong;
    }

    public int getDai() {
        return dai;
    }

    public void setDai(int dai) {
        this.dai = dai;
    }

    public int getRong() {
        return rong;
    }

    public void setRong(int rong) {
        this.rong = rong;
    }
 public void nhapThongTin(){
     System.out.println("nhap chieu dai mieng dat");
     dai = scanner.nextInt();
     System.out.println("Nhap chieu rong mieng dat");
     rong = scanner.nextInt();
 }
public void tinhDienTich(){
        int dienTich = dai * rong;
}

    @Override
    public String toString() {
        return "DatHCN{" + "dai=" + dai + ", rong=" + rong + ", scanner=" + scanner + '}';
    }
}
