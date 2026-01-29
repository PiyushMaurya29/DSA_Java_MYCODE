package Queues;
import java.util.*;
public class Queues_Basics {
    public static void main(String[] args) {

        /*
           Queue is FIFO(First In First Out) OR LILO(Last In Last Out
         */

        Queue<Integer> q  = new LinkedList<>();
        // 2ns way to declare queue is given below :-
        Queue<Integer> r = new ArrayDeque<>();
        System.out.println(q.isEmpty()); // Tells queue is empty or not
        q.add(4);
        q.add(3);
        q.add(7);
        q.add(9);
        q.add(6);
        System.out.println(q.size()); // Prints size of queue i.e 5
        System.out.println(q);
        q.remove(); // Removers 1st element i.e 4 or front is deleted
        System.out.println(q);
        q.poll(); // Same as remove
        System.out.println(q);
        System.out.println(q.peek()); // Prints front element of queue
        System.out.println(q.element()); // Same as peek

        System.out.println(q.size()); // 3
        System.out.println(q.isEmpty());

    }
}
