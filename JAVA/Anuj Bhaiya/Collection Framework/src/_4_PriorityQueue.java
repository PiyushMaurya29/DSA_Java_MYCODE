import java.util.Comparator;
import java.util.PriorityQueue;

public class _4_PriorityQueue {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pqMax = new PriorityQueue<>(Comparator.reverseOrder()); // Max Heap
        // This will always keep Minimum element at it's peak or Head
        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);
        System.out.println(pq);
        pq.poll(); // It will remove the minimum element first
        System.out.println(pq);
        System.out.println(pq.peek());
    }
}
