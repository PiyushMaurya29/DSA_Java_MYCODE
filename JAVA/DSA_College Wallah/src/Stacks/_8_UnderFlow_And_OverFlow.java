package Stacks;
import java.util.*;
public class _8_UnderFlow_And_OverFlow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
            UnderFlow = If stack is empty end you are doing st.peek() or st.pop()
            OverFlow = If we try to push element in stack of fixed size then it is overflow
         */
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st); // 1 2 3 4
        st.pop();
        System.out.println(st); // 1 2 3
        st.pop();
        System.out.println(st); // 1 2
        st.pop();
        System.out.println(st); // 1
        st.pop();
        System.out.println(st); //
//        st.pop();  // Underflow condition
        System.out.println(st);

    }
}
