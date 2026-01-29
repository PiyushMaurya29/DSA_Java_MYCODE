package Collection_Framework;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class _1_ArrayList {
    static void ArrayListExamples(){
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l); // 1, 2, 3
        System.out.println(l.get(1)); // 2
        l.set(0,10);
        System.out.println(l); // 10, 2, 3
        System.out.println(l.contains(10)); // true
    }
    public static void main(String[] args) {
        ArrayListExamples();
    }
}
