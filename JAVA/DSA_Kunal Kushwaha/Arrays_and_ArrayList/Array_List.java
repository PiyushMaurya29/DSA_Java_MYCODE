package Arrays_and_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(5);

        // we can add as many elements as we want initialization doesn't matter at all

//        list.add(67);
//        list.add(12);
//        list.add(56);
//        list.add(78);
//        list.add(99);
//        list.add(121);
//        list.add(56);
//        list.add(11);
//        list.add(91);
//
//        System.out.println(list.contains(54)); // gives boolean value
//        System.out.println(list);
//        list.set(0,121);
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list);

        // taking input
        for(int i=0 ; i<5 ; i++){
            list.add(sc.nextInt());
        }

        // printing list
        for(int i=0 ; i<5 ; i++){
            System.out.println(list.get(i));
        }
        // 2nd method
        System.out.println(list);

        /*
           Working of arrayList :-
           1. Size is fixed internally
           2. When arrayList is full by some amount
              It will form of new arrayList say , double the
              size of old elements are copied in new one
         */

    }
}
