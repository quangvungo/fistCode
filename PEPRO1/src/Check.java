
import java.util.List;
import java.util.Scanner;

public class Check {
    private final static Scanner scaner =new Scanner(System.in);
    public String inputString( String msg){
        System.out.println(msg);
        while (true){
            String rs = scaner.next();
            if(rs.length() == 0 || rs == null){
                System.out.println("Not allowed empty! please enter again ");
                continue;
            }
            return rs;
        }
    }

    public String inputCode(List<Doctor> doctorList){

        while (true){
            String code = inputString("Enter Code:  ");
            Doctor dt =searchBook(code,doctorList);
            if(code == null){
                return code;
            }
            System.out.println("ID existed ! please enter again");
            continue;
        }
    }
    public int inputInt(String msg) {
        System.out.println(msg);
        while (true) {
            String input = scaner.next();
            try {
                int result = Integer.parseInt(input);
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập một số nguyên hợp lệ!");
            }
        }
    }
    public String inputCodetrung(List<Doctor> doctorList){

        while (true){
            String code = inputString("Enter Code:  ");
            Doctor dt =searchBook(code,doctorList);
            if(code.equals(dt)){
                return code;
            }
            System.out.println("ID does not match in the list. please re-enter !");
            continue;
        }
    }
    public Doctor searchBook(String code, List<Doctor> doctorListt){
        for (Doctor dt: doctorListt) {
            if(dt.getCode().equals(code)){
                return dt;
            }
        }
        return null;
    }
}
