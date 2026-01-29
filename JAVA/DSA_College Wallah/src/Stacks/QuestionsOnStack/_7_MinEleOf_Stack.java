package Stacks.QuestionsOnStack;

import java.util.Stack;

public class _7_MinEleOf_Stack {
    static int getMin_1(Stack<Integer> st){
        // Not very efficient algorithm
        // TC = O(n^2) and SC = O(n)
        Stack<Integer> helper = new Stack<>();
        int min = Integer.MAX_VALUE;
        while (!st.isEmpty()){
            int top = st.pop();
            min = Math.min(min,top);
            helper.push(top);
        }
        while (!helper.isEmpty()){
            st.push(helper.pop());
        }
        return min;
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(7);
        st.push(8);
        st.push(5);
        st.push(6);
        st.push(3);

        st.pop();
        System.out.println(getMin_1(st));
        System.out.println(st);
    }
}
