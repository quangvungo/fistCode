import java.util.ArrayList;
import java.util.List;

public class View {
    public static void main(String[] args) {
        Check check = new Check();
        List<Doctor> doctorList = new ArrayList<>();
        Menu menu = new Menu(check, doctorList);
        menu.displayMenu();
    }
}
