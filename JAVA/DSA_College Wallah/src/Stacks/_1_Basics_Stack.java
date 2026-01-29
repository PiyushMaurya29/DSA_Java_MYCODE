package Stacks;
import java.util.*;
public class _1_Basics_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> arr = new ArrayList<>(); // Arraylist Declaration
//        int arr[] = new int[10];  // Array Declaration

        // Stack work of the LIFO (Last in First Out) Approach
        // Or FILO (First in Last Out

        // Declaration of Stacks
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());
        // Putting elements in Stack
        st.push(47);
        st.push(20);
        st.push(90);
        st.push(11);

        //Peek / Top -> Uppermost element of Stack
        System.out.println(st.peek());

        // Printing whole Stack
        System.out.println(st);

        // Removing the uppermost element of Stack
        st.pop();
        System.out.println(st);

        // Size of stack
        System.out.println("Size of stack : "+st.size());

        // Printing second element of Stack
        while (st.size()>2){
            st.pop();
        }
        System.out.println(st.peek());
        // But while poping out the elements all element except 1st one is deleted
        System.out.println(st);

        // Checking the stack is empty or not
        System.out.println(st.isEmpty());

        /* Pros of Stack
         * Unlimited size
         */

        /*   Taking input of Stack from the user

            Stack<Integer> st = new Stack<>();

        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();

        System.out.println("Enter the elements : ");
        for(int i=1 ; i<=n ; i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
         */
    }
}
