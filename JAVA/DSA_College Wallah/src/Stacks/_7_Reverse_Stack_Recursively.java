package Stacks;
import java.util.*;
public class _7_Reverse_Stack_Recursively {
    public static void pushAtBottom(Stack<Integer> st , int x){
        if(st.size() == 0){
            st.push(x);
            return;
        }
        int top = st.pop();
        pushAtBottom(st,x);
        st.push(top);
    }
    public static void reverseStack(Stack<Integer> st){
        if(st.size() == 1) return; // or st.size() == 0 return;
        int top = st.pop();
        reverseStack(st);
        pushAtBottom(st,top);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> st = new Stack<>();
        st.push(34);
        st.push(87);
        st.push(38);
        st.push(21);
        st.push(56);
        st.push(79);
        st.push(44);

        System.out.println(st);
        reverseStack(st);
        System.out.println(st);
    }
}
