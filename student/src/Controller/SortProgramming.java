package Controller;
import Common.Algorithm;
import Common.Library;
import Model.Element;
import View.Menu;
public class SortProgramming {
    static String[] mc = {"Sort", "Search", "Exit"};
    protected Library library;
    protected Algorithm algorithm;
    protected int[] array;
    protected int size_array;
    public SortProgramming(Element element) {
        super();
        library = new Library();
        algorithm = new Algorithm();
        size_array = element.getSize_array();
        array = element.getArray();
        //1. Enter a possitive number
        //size_array = library.getInt("Enter number of array", 1, 100);
        //2. Create array by generate random integer in range
        //array = library.createArray(size_array);
    }
    public void sort() {
        final String[] mcSort = {"Buddle Sort", "Quick Sort", "Exit"};
        class SortMenu extends Menu<String> {

            public SortMenu() {
                super("Sort Option", mcSort);
            }

            @Override
            public void execute(int n) {
                System.out.println("Unsorted array: ");
                library.display(array);
                switch (n) {
                    case 1:
                        algorithm.buddleSort(array);
                        System.out.println("\nSorted array by Buddle Sort: ");
                        library.display(array);
                        System.out.println("");
                        break;
                    case 2:
                        algorithm.quickSort(array, 0, size_array - 1);
                        System.out.println("\nSorted array by Quick Sort: ");
                        library.display(array);
                        System.out.println("");
                        break;
                    case 3:
                        System.exit(0);
                        break;
                }
            }
        }
        SortMenu sm = new SortMenu();
        sm.run();
    }
}