package Stacks;
import java.util.*;
public class _4_Push_Insertion_In_Stack {
    public static void pushAtBottomRecursively(Stack<Integer> st, int k){
        if(st.size() == 0){
            st.push(k);
            return;
        }
        int top = st.pop();
        pushAtBottomRecursively(st, k);
        st.push(top);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q. Insert an element at any index of Stack
        Stack<Integer> st = new Stack<>();
        st.push(55);
        st.push(66);
        st.push(77);
        st.push(88);
        st.push(99);
        st.push(22);
        System.out.println(st);

        // Put the element at given index and having a value
        int idx = 2;
        int x = 45;

        Stack<Integer> temp = new Stack<>();
        while (st.size()>idx){
            temp.push(st.pop());
        }
        st.push(x);
        while (temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println(st);

        pushAtBottomRecursively(st, 10);
        System.out.println(st);
    }
}
