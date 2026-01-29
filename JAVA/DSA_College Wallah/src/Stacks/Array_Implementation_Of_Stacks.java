package Stacks;


public class Array_Implementation_Of_Stacks {
    public static class Stack{
        private int arr[] = new int[5];
        private int idx = 0;
        void push(int val){
            if(isFull()){  // Checking if stack is full or not
                System.out.println("Stack is Full");
                return;
            }
            arr[idx] = val;
            idx++;
        }
        int peek(){
            if(idx==0){ // Or write isEmpty()
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            // Or write isEmpty() instead of idx==0
            if(idx==0){  // Checking if stack is empty
                System.out.println("Stack is Empty");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0; // Putting 0 inplace of popped element
            idx--;  // Going 1 index back after deleting element
            return top;
        }
        void display(){
            if(isEmpty()){
                System.out.println("Stack is Empty!");
                return;
            }
            for(int i=0 ; i<=idx-1 ; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){ // Return the number of elements of stack
            return idx;
        }
        int capacity(){  // Returns the actual size of array of stack
            return arr.length;
        }
        boolean isEmpty(){
            if(size()==0) return true; // OR idx == 0
            return false;
        }
        boolean isFull(){
            if(idx==arr.length) return true;
            return false;
        }
        int capacityOfStack(){
            return arr.length;
        }
    }
    public static void main(String[] args) {

        /*
                # Advantages of array Implementation of Stacks
                * Size of every element space taken is one block
                * Display takes O(1) complexity

                # DisAdvantages of array Implementation of Stacks
                * Size is fixed . Overflow can happen
         */
        Stack st = new Stack();
        st.display(); // Stack is Empty
        st.push(4);
        st.push(5);
        st.push(1);
        st.push(9);

        st.display(); // 4 5 1 9
        System.out.println(st.size()); // 4
        st.pop();
        st.display(); // 4 5 1
        st.push(5);
        st.push(6);
        st.display();  // 4 5 1 5 6
        System.out.println(st.peek()); // 6
        System.out.println(st.isFull());

    }
}
