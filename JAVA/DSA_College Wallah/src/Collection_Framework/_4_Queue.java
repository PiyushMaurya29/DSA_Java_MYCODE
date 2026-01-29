package Collection_Framework;

import java.util.LinkedList;

public class _4_Queue {
    static void QueueExamples(){
        LinkedList<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q.peek()); // 1
        System.out.println(q.poll()); // 1 -> also remove
        System.out.println(q.peek()); // 2
        System.out.println(q.isEmpty()); // false
        System.out.println(q.size()); // 2
        System.out.println(q); // 2 3
    }
    public static void main(String[] args) {
        QueueExamples();
    }
}
