package VatNuoi;

import java.util.ArrayList;
import java.util.Scanner;

public class CatDetail implements ICat{
     String loai;
     String mau;
     String noisong;
     int colorIndex;
     ColorManager colorManager;
    Scanner scanner = new Scanner(System.in);
    public CatDetail() {
        super();
    }

    public CatDetail(ColorManager colorManager) {
        this.colorManager = colorManager;
    }

    public CatDetail(String loai, String mau, String noisong) {
        this.loai = loai;
        this.mau = mau;
        this.noisong = noisong;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getNoisong() {
        return noisong;
    }

    public void setNoisong(String noisong) {
        this.noisong = noisong;
    }

    public int getColorIndex() {
        return colorIndex;
    }

    public void setColorIndex(int colorIndex) {
        this.colorIndex = colorIndex;
    }

    public void nhap(){
        System.out.println("nhap loai meo");
        loai = scanner.nextLine();
       colorManager.hienThi();
        System.out.println("nhap mau : ");
        while (true) {
            mau = scanner.nextLine();
            ArrayList<String> colorList = colorManager.getColorList();
            boolean inFind = false;
            for (int i = 0;i <colorList.size();i++){
                if (colorList.get(i).equalsIgnoreCase(mau)){
                    colorIndex = i;
                    inFind = true;
                    break;
                }
            }
            if (!inFind) {
                System.out.println("nha sai vui long nhap lai");
            }else {
                break;
            }
        }
        System.out.println("nhap noi song");
        noisong = scanner.nextLine();
    }

    @Override
    public void hienThi() {
        System.out.println("");
        System.out.printf("loai: %s, mau : %s, noi song: %s \n", loai, mau, noisong);

    }

}
