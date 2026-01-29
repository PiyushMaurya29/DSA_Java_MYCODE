package Stacks;
import java.util.*;
public class _6_Print_Display_Stack_Recursively {
    public static void disReverse_Recursively(Stack<Integer> st){
        if(st.size() == 0) return;
        int top = st.pop();
        System.out.print(top+" ");
        disReverse_Recursively(st);
        st.push(top);
    }
    public static void display_Recursively(Stack<Integer> st){
        if(st.size() == 0) return;
        int top = st.pop();
        display_Recursively(st);
        System.out.print(top+" ");
        st.push(top);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> st = new Stack<>();
        st.push(98);
        st.push(33);
        st.push(12);
        st.push(87);
        st.push(34);
        st.push(72);

        display_Recursively(st);
        System.out.println();
        disReverse_Recursively(st);

    }
}
