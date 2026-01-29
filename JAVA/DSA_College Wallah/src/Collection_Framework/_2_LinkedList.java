package Collection_Framework;

import java.util.LinkedList;

public class _2_LinkedList {
    static void LinkedListExample(){
        LinkedList<Integer> l = new LinkedList<>();
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
        LinkedListExample();
    }
}
