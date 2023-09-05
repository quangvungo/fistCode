package NguyenTO;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ATom> nt = new ArrayList<>();

        System.out.println("nhap so luong nguyen tu ban muon tao");
        int num = scanner.nextInt();
        for (int i = 0 ; i < num; i++) {
            System.out.println("nguyen tu thu " + (i+1));
            
            System.out.println("nhap so nguyen tu");
            int number = scanner.nextInt();
            System.out.println("nhap so ki tu nguyen tu");
            String symbol =  scanner.nextLine();
            System.out.println("nhap ten nguyen tu");
            String name = scanner.nextLine();
            System.out.println("nhap trong luong cua nguyen tu");
            Float weight = scanner.nextFloat();
            ATom aTom = new ATom(number,symbol,name,weight);
            nt.add(aTom);

        }
    }
}
