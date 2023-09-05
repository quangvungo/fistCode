package bt2;

import java.util.Scanner;

public class FullTime extends NhanVien{
    protected int ngayLamThem,choose;
    protected String loaiNhanVien ;
    private static long LUONG_NHAN_VIEN_LA_SEP = 20000000;
    private static long LUONG_NHAN_VIEN_BINH_THUONG = 10000000;
    private static long LUONG_LAM_THEM = 800000;

    public FullTime() {
        super();
    }

    public FullTime(int ngayLamThem, String loaiNhanVien) {
        super();
        this.ngayLamThem = ngayLamThem;
        this.loaiNhanVien = loaiNhanVien;
    }

    public int getNgayLamThem() {
        return ngayLamThem;
    }

    public void setNgayLamThem(int ngayLamThem) {
        this.ngayLamThem = ngayLamThem;
    }

    public String getLoaiNhanVien() {
        return loaiNhanVien;
    }

    public void setLoaiNhanVien(String loaiNhanVien) {
        this.loaiNhanVien = loaiNhanVien;
    }

    public void nhap(){
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so ngay lam them: ");
        ngayLamThem = scanner.nextInt();
        choose = scanner.nextInt();
        switch (choose) {
            case 1:
                loaiNhanVien = "Nhan vien binh thuong";
                break;
            case 2:
                loaiNhanVien = "sep";
                break;
            default:
                System.out.println("nhap loai nhan vien khong dung");
                break;
        }

    }
    public void tinhLuong(){
        if(loaiNhanVien.equals("Nhan vien binh thuong")) {
            loaiNhanVien = String.valueOf(LUONG_NHAN_VIEN_BINH_THUONG + this.ngayLamThem * LUONG_LAM_THEM);
        } else if (loaiNhanVien.equals("sep")) {
            loaiNhanVien = String.valueOf(LUONG_NHAN_VIEN_LA_SEP + this.ngayLamThem * LUONG_LAM_THEM);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "FullTime{" + "ngayLamThem=" + ngayLamThem + ", loaiNhanVien='" + loaiNhanVien + '\'' + '}';
    }

}
