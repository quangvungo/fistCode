package bai1;

public class NhanVien extends CanBo{
    private String CongViec;

    public NhanVien() {
        super();
    }

    public NhanVien(String congViec) {
        CongViec = congViec;
    }

    public String getCongViec() {
        return CongViec;
    }

    public void setCongViec(String congViec) {
        CongViec = congViec;
    }
    public void nhapThongTin(){
        super.nhapThongTin();
        System.out.println("nhap cong viec cua ban");
        CongViec = scanner.nextLine();
    }
    @Override
    public String toString() {
        return super.toString() + "NhanVien{" +
                "CongViec='" + CongViec + '\'' +
                '}';
    }
}
