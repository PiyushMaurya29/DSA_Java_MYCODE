package Stacks;
public class LinkedList_Implementation_Of_Stacks {
    public static class Node{ // User defined dataTypes
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class StackLL{ // User defined data structure
        Node head = null;
        private int size = 0;
        void push(int val){
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
            size++;
        }
        int pop(){
            if(head==null){
                System.out.println("Stack is Empty!");
                return -1;
            }
            int top = head.val;
            head = head.next;
            size--;
            return top;
        }
        int peek(){
            if(head==null){
                System.out.println("Stack is Empty!");
                return -1;
            }
            return head.val;
        }
        void displayRec(Node h){
            if(h==null) return;
            displayRec(h.next);
            System.out.print(h.val+" ");
        }
        void display(){
            if(size==0){
                System.out.println("Stack is Empty");
                return;
            }
            displayRec(head);
            System.out.println();
        }
        void displayReverse(){
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size(){ // getter
            return size;
        }
        boolean isEmpty(){
            if(size==0) return true;
            return false;
        }
    }
    public static void main(String[] args) {

        /*
                # Advantages of array Implementation of Stacks
                * Unlimited Size

                # DisAdvantages of array Implementation of Stacks
                * Each element take two data members
                * Display reverse -> Space complexity is more O(n)
         */

        StackLL st = new StackLL();
        st.display(); // Stack is Empty
        st.push(4);
        st.push(5);
        st.push(1);
        st.push(9);

        st.display(); // 4 5 1 9
        System.out.println(st.size()); // 4
        st.pop();
        System.out.println(st.size()); // 3
        st.display(); // 4 5 1
        st.push(5); // 4 5 1 5
        st.push(6); // 4 5 1 5 6
        System.out.println(st.peek()); // 6

    }
}
