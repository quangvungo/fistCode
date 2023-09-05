package VatNuoi;

import java.util.ArrayList;
import java.util.Scanner;

public class ColorManager {
  ArrayList<String> colorList  = new ArrayList<>();
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so mau can them");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n;i++){
            System.out.println("nhap mau: ");
            String color = scanner.nextLine();
            colorList.add(color);
        }
    }
    public void hienThi(){
        for (String color : colorList) {
            System.out.println("color : " + color);
        }
    }
    public ArrayList<String> getColorList() {
        return colorList;
    }
}
