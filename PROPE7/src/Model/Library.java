package Model;

import sun.nio.cs.ISO_8859_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.*;
import java.util.function.Predicate;

public class Library {

    private List<Book> list;
    public Library(){
        this.list = new ArrayList<>();
    }
    public void listAllBook(List<Book> list, Comparator<Book> comparator) {
        int total = list.size();

        if (total <= 0) {
            System.err.println("Sorry. Nothing to print.");

            return;
        }

        list.sort(comparator);

        System.out.println("List all Book");
        System.out.println("--------------------------------");
        System.out.printf("%-15s%-25s%-8s%-5s\n", "BookID", "Title", "Author", "Year published");

        for (Book book : list) {
            System.out.println(book);
        }

        System.out.println("--------------------------------");
        System.out.println("Total: " + total + " Book.");
    }
    public List<Book> search(Predicate<Book> b) {
        List<Book> newList = new ArrayList<>();

        for (Book book : list) {
            if (b.test(book)) {
                newList.add(book);
            }
        }

        return newList;
    }
    public void readFile(String p) throws FileNotFoundException, ParseException {

        File file = new File(p);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            String[] tokens = line.split(",");

            String BookID = tokens[0];
            String Title = tokens[1];
            String Author= tokens[2];
            String Year = tokens[3];

            Book b = new Book(BookID,Title,Author,Year);
            list.add(b);

        }
    }

    public void printAllBook() throws FileNotFoundException, ParseException {

        System.out.println("List of Books");
        if(list.isEmpty()) {
            readFile("D:\\src\\folder");
        }
        System.out.println("-----------------");
        if(!list.isEmpty()&&list!=null) {
            list.forEach(b->System.out.println(b));
        }
    }
    public void printBook(ArrayList<Book> rc) {
        System.out.println("List of book");
        list.forEach(c->System.out.println(c));
    }
    private String getValue(String message) {
        Scanner sc=new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }
}
