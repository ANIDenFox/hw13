import java.util.ArrayList;
public class NumberSearch {
    public static void checkElement(ArrayList<Integer> list, int searchNumber) {
        if (list.contains(searchNumber)) {
            System.out.println("Елемент " + searchNumber + " присутній у списку.");
        } else {
            System.out.println("Елемент " + searchNumber + " відсутній у списку.");
        }
    }
}