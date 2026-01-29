import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.SynchronousQueue;

public class _3_Queue {
    public static void main(String[] args) {
        // FIFO
        Queue<Integer> queue = new LinkedList<>();
        queue.add(12);
        queue.offer(14);
        queue.offer(16); // Offer is better to use for adding element
        System.out.println(queue);
        queue.poll(); // remove()
        System.out.println(queue);
        System.out.println(queue.peek()); // element()

    }
}
