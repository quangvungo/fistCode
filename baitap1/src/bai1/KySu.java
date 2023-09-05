package bai1;

public class KySu extends CanBo{
    private String NganhDaoTao;

    public KySu() {
        super();
    }

    public KySu(String name, int tuoi, String gioitinh, String diaChi, String nganhDaoTao) {
        super(name, tuoi, gioitinh, diaChi);
        NganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return NganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        NganhDaoTao = nganhDaoTao;
    }
    public void nhapThongTin(){
        super.nhapThongTin();
        System.out.println("nhap nganh dao tao cua ban");
        NganhDaoTao = scanner.nextLine();
    }

    @Override
    public String toString() {
        return super.toString()+ "KySu{" +
                "NganhDaoTao='" + NganhDaoTao + '\'' +
                '}';
    }
}
