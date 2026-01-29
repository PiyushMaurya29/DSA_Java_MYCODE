package Stacks;
import java.util.*;
public class _3_Reverse_Stack {
    public static void reverseStack(Stack<Integer> st){
        Stack<Integer> temp = new Stack<>();
        while (st.size()>0){
            temp.push(st.pop());
        }
        Stack<Integer> temp2 = new Stack<>();
        while (temp.size()>0){
            temp2.push(temp.pop());
        }
        while (temp2.size()>0){
            st.push(temp2.pop());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Reverse the stack
        Stack<Integer> st = new Stack<>();
        st.push(87);
        st.push(67);
        st.push(23);
        st.push(45);
        st.push(49);
        st.push(11);
        st.push(97);
        System.out.println(st);

        reverseStack(st);

        System.out.println(st);

    }
}
