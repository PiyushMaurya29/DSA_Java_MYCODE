package Stacks;

import java.util.Stack;

public class _5_Print_Display_Stack {
    public static void printStack(Stack<Integer> st){
        Stack<Integer> temp = new Stack<>();
        while (st.size() > 0){
            temp.push(st.pop());
        }
        while (temp.size() > 0){
            int x = temp.pop();
            System.out.print(x+" ");
            st.push(x);
        }
        System.out.println();
    }
    public static void printStackUsingArray(Stack<Integer> st){
        int n = st.size();
        int arr[] = new int[n];
        for(int i=n-1 ; i>=0 ; i--){
            int x = st.pop();
            arr[i] = x;
        }
        for(int i=0 ; i<=n-1 ; i++){
            int x = arr[i];
            st.push(x);
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);

        printStack(st);
        printStackUsingArray(st);
    }
}
