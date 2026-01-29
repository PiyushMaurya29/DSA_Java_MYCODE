package Collection_Framework;

import java.util.Comparator;
import java.util.PriorityQueue;

public class _5_PriorityQueue {
    static void MinPriorityQueueExample(){
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // min pq
        pq.add(10);
        pq.add(5);
        pq.add(7);
        System.out.println(pq.peek()); // 5 The smallest ele has the highest priority queue
        System.out.println(pq); // Guarantee -> Topmost element is processed first
        System.out.println(pq.poll()); // 5
        System.out.println(pq); // 7 10
        System.out.println(pq.peek()); // 7
    }
    static void MaxPriorityQueueExample(){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // max pq
        pq.add(10);
        pq.add(5);
        pq.add(7);
        System.out.println(pq.peek()); // 10 The largest ele has the highest priority queue
        System.out.println(pq); // Guarantee -> Topmost element is processed first
        System.out.println(pq.poll()); // 10
        System.out.println(pq); // 7 5
        System.out.println(pq.peek()); // 7
    }
    public static void main(String[] args) {
//        MinPriorityQueueExample();
        MaxPriorityQueueExample();
    }
}
