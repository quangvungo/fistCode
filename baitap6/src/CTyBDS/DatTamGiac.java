package CTyBDS;

public class DatTamGiac extends MiengDat{
    protected int day, chieuCao;

    public DatTamGiac() {
    }

    public DatTamGiac(int day, int chieuCao) {
        this.day = day;
        this.chieuCao = chieuCao;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(int chieuCao) {
        this.chieuCao = chieuCao;
    }
    public void nhapThongTin(){
        System.out.println("nhap canh day");
        day = scanner.nextInt();
        System.out.println("nhap chieu cao");
        chieuCao = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "DatTamGiac{" + "day=" + day + ", chieuCao=" + chieuCao + '}';
    }
}
