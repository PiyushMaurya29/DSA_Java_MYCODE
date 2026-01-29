package ArrayList;
import java.util.*;
public class ArrayList_Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList();
        list.add(76);
        list.add(45);
        list.add(96);
        list.add(123);
        list.add(84);
        list.add(902);

        System.out.println(list);
        System.out.println(list.contains(123));
        System.out.println(list.contains(654));

        // Changing element of the index
        list.set(0,99);
        System.out.println(list);

        // Remove element from a index
        list.remove(1);
        System.out.println(list);

        // Printing element at a particular index
        System.out.println(list.get(0));

        /*
           1. Size is fixed internally
           2. Say ArrayList fills by some amount it will create a new
              arraylist of say double the size old elements are copied int new
              and old one is deleted
         */

    }
}
