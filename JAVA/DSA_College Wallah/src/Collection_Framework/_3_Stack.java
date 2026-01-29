package Collection_Framework;

import java.util.Stack;

public class _3_Stack {
    static void StackExample(){
        Stack<String> st = new Stack<>();
        st.push("Pw");
        st.push("Skills");
//        st.push("Maurya");
        System.out.println(st.peek()); // Skills
        System.out.println(st.pop()); // Skills
        System.out.println(st.peek()); // Pw
        System.out.println(st.size()); // 1
        System.out.println(st); // Pw
        System.out.println(st.empty()); // false
    }
    public static void main(String[] args) {
        StackExample();
    }
}
