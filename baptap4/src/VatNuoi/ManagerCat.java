package VatNuoi;

import java.util.*;

public class ManagerCat {
    ArrayList<CatDetail> catDetails = new ArrayList<>();
    ColorManager colorManager = new ColorManager();
    Scanner scanner = new Scanner(System.in);

    public ColorManager getColorManager() {
        return colorManager;
    }
    public void nhap(){
        System.out.println("nhap so meo can them: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ;i++){
            CatDetail catDetail = new CatDetail(colorManager);
            catDetail.nhap();
            catDetails.add(catDetail);
        }
    }
    public void hienThi(){
        for (CatDetail catDetail : catDetails){
            catDetail.hienThi();
        }
    }
    public void sortByColor(){
        Collections.sort(catDetails, new Comparator<CatDetail>() {
            @Override
            public int compare(CatDetail o1, CatDetail o2) {
                return o1.getMau().compareTo(o2.getMau());
            }
        });
    }
    public void searchByLoai(){
        System.out.println("nhap loi can tim: ");
        String loai = scanner.nextLine();
        for (CatDetail catDetail: catDetails) {
            if(catDetail.getLoai().contentEquals(loai)){
                catDetail.hienThi();
            }
        }
    }
    public void sortByColorManager(){
        Collections.sort(catDetails, new Comparator<CatDetail>() {
            @Override
            public int compare(CatDetail o1, CatDetail o2) {
                return (o1.getColorIndex() > o2.getColorIndex())?1:-1;
            }
        });
    }
}
