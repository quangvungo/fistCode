package bt1;

import java.util.Scanner;

public class Person {
    protected String name;
    protected String sex;
    protected String address;
    protected String ngaysinh;
    public void intputPerson(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Ten :");
        this.name = scanner.nextLine();
        System.out.println("Nhap gioi tinh");
        this.sex = scanner.nextLine();
        System.out.println("Nhap dia chi");
        this.address = scanner.nextLine();
        System.out.println("Nhap ngay sinh");
        this.ngaysinh = scanner.nextLine();
    }
    public void showPerson(){
        System.out.println("Ho Ten : " +this.name + " Gioi Tinh : " +this.sex +" Dia chi : " +this.address +" Ngay sinh : " +this.ngaysinh);
    }
}
