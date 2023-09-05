package CTyBDS;

import com.sun.org.apache.xalan.internal.xsltc.trax.XSLTCSource;
import sun.plugin2.message.JavaScriptCallMessage;

import javax.rmi.CORBA.Tie;
import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class TienDat {
    public static void main(String[] args) {
        ArrayList<MiengDat> arrMiengDat = new ArrayList<>();
         int choose, soMiengDat;
         long tongDat = 0, TienDat;
         MiengDat miengDat = new MiengDat();
         Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so luong mieng dat ban muon mua: ");
        soMiengDat = scanner.nextInt();
        for (int i = 0; i < soMiengDat; i++) {
            System.out.println("Nhap loai hinh dang dat ban muon mua: (1- dat hinh chu nhat,2-dat hinh thang,3-dat hinh tam giac)" );
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    miengDat = new DatHCN();
                    miengDat.nhapThongTin();
                    arrMiengDat.add(miengDat);
                    break;
                case 2:
                    miengDat = new DatHinhThang();
                    miengDat.nhapThongTin();
                    arrMiengDat.add(miengDat);
                    break;
                case 3:
                    miengDat = new DatTamGiac();
                    miengDat.nhapThongTin();
                    arrMiengDat.add(miengDat);
                    break;
                default:
                    System.out.println("Chon lai");
                    break;
            }
        }
        System.out.println("Hien thi danh sach mieng dat: ");
        for (MiengDat md : arrMiengDat ) {
            System.out.println(md.toString());
        }
        for (MiengDat md : arrMiengDat){
            TienDat = md.getDonGia();
            tongDat += TienDat;
        }
        System.out.println("tong tien dat phai tra" +tongDat);
    }
}
