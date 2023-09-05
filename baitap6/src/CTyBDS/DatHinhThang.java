package CTyBDS;

public class DatHinhThang extends MiengDat{
    private int dayLon, dayNho, chieuCao;

    public DatHinhThang() {
    }

    public DatHinhThang(int dayLon, int dayNho, int chieuCao) {
        this.dayLon = dayLon;
        this.dayNho = dayNho;
        this.chieuCao = chieuCao;
    }

    public int getDayLon() {
        return dayLon;
    }

    public void setDayLon(int dayLon) {
        this.dayLon = dayLon;
    }

    public int getDayNho() {
        return dayNho;
    }

    public void setDayNho(int dayNho) {
        this.dayNho = dayNho;
    }

    public int getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(int chieuCao) {
        this.chieuCao = chieuCao;
    }
    public void nhapThongTin(){
        System.out.println("nhap canh day lon");
        dayLon = scanner.nextInt();
        System.out.println("nHap canh day nho");
        dayNho = scanner.nextInt();
        System.out.println("nhap chieu cao mieng dat");
        chieuCao = scanner.nextInt();
    }
    public void tinhDienTich(){
        int dienTich = ((dayLon + dayNho)*chieuCao/2);
    }

    @Override
    public String toString() {
        return "DatHinhThang{" + "dayLon=" + dayLon + ", dayNho=" + dayNho + ", chieuCao=" + chieuCao + '}';
    }
}
