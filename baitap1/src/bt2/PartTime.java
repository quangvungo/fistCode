package bt2;

import com.sun.xml.internal.ws.wsdl.writer.document.Part;

import java.util.Scanner;
import java.lang.Math;

public class PartTime extends NhanVien{
    protected int soGioLamThem;
    private final long LUONG_NHANVIEN_THOIVU = 100000;

    public PartTime() {
        super();
    }

    public PartTime(int soGioLamThem) {
        super();
        this.soGioLamThem = soGioLamThem;
    }
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
    }
    public void tinhLuong(){
        luong = String.valueOf(((LUONG_NHANVIEN_THOIVU * this.soGioLamThem)));
    }

    @Override
    public String toString() {
        return super.toString() + "PartTime{" +
                "soGioLamThem=" + soGioLamThem + '}';
    }
}
