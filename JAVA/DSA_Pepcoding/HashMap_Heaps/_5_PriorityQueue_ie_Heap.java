import java.util.PriorityQueue;

public class _5_PriorityQueue_ie_Heap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // For small number priority
        PriorityQueue<Integer> pqDescending = new PriorityQueue<>(); // For descending order priority
        int[] ranks = {22, 99, 3, 11, 88, 4, 1};
        for(int val : ranks){
            pq.add(val);
        }

        while (pq.size() > 0){
            System.out.print(pq.peek()+" ");
            pq.remove();
        }
    }
}
