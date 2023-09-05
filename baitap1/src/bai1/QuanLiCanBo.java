package bai1;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.stream.Collectors;

public class QuanLiCanBo {
    public Scanner sc = new Scanner(System.in);
    private ArrayList<CanBo> ds;

    public QuanLiCanBo() {
        ds = new ArrayList<>();
    }

    public void nhapThongTin() {
        CanBo cb;
        System.out.print("Nhập số lượng can bo: ");
        int soLuong = sc.nextInt();
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhập thông tin can bo thứ " + (i + 1));
            System.out.print("Chọn kiểu tài liệu (1-cong nhan / 2-ky su / 3-nhan vien): ");
            int kieu = sc.nextInt();
            switch (kieu) {
                case 1: {
                    cb = new CongNhan();
                    cb.nhapThongTin();
                    ds.add(cb);
                }
                case 2: {
                    cb = new KySu();
                    cb.nhapThongTin();
                    ds.add(cb);
                }
                case 3: {
                    cb = new NhanVien();
                    cb.nhapThongTin();
                    ds.add(cb);
                }
                default:
                    System.out.println("Nhập sai kiểu, mời nhập lại (1-3)!");
            }
        }
        public void inThongTin() {
            for (CanBo canBo : ds) {
                System.out.println(cb.toString());
            }
        }
    }
}
