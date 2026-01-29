import java.util.*;

public class _1_Basics {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(6);
        queue.add(5);
        queue.add(16);
        queue.add(19);
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.addLast(78);
        deque.removeFirst();
        System.out.println(deque);
    }
}
