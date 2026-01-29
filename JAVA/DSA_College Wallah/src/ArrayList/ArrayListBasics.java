package ArrayList;
import java.util.*;
public class ArrayListBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Syntax
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(67);
        list.add(85);
        list.add(96);
        list.add(71);
        list.add(122);

        System.out.println(list);

    }
}
