import java.util.ArrayDeque;

public class _5_ArrayDeque {
    public static void main(String[] args) {
        // Can be added and removal from both the sides
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(23);
        adq.offerFirst(12);
        adq.offerLast(45);
        adq.offer(26); // Add element at last
        System.out.println(adq);

        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());
        System.out.println(adq);
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
    }
}
