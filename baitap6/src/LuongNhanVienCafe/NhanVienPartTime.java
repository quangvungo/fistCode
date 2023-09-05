package LuongNhanVienCafe;

public class NhanVienPartTime extends NhanVien{
    private int gioLamViec;
    private static long LUONG_NHAN_VIEN_THOI_VU_MOT_GIO = 100000;

    public NhanVienPartTime() {
        super();
    }
    public NhanVienPartTime(int gioLamViec) {
        super();
        this.gioLamViec = gioLamViec;
    }
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.print("Nhập số giờ làm việc: ");
        gioLamViec = scanner.nextInt();
    }
    public void tinhLuong() {
        luongNhanVien = LUONG_NHAN_VIEN_THOI_VU_MOT_GIO * this.gioLamViec;
    }
    @Override
    public String toString() {
        return super.toString() + ", giờ làm việc: " + this.gioLamViec;
    }
}
