import java.util.Stack;

public class _3_QueueUsingStack {
    public static class QueuesUsingStacks{
        Stack<Integer> first = new Stack<>();
        Stack<Integer> second = new Stack<>();
        public QueuesUsingStacks(){
            first = new Stack<>();
            second = new Stack<>();
        }
        public void add(int item){
            first.push(item);
        }
        public int remove(){
            if(first.isEmpty()) return -1;
            while (!first.isEmpty()) second.push(first.pop());
            int removed = second.pop();
            while (!second.isEmpty()) first.push(second.pop());
            return removed;
        }
        public int peek(){
            while (!first.isEmpty()) second.push(first.pop());
            int top = second.peek();
            while (!second.isEmpty()) first.push(second.pop());
            return top;
        }
        public boolean isEmpty(){
            return first.isEmpty();
        }

    }
    public static void main(String[] args) {

    }
}
