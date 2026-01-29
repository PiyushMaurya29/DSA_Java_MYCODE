package Stacks;

import java.util.*;

public class _2_Copy_Stack_In_Same_Order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q. Copy contents of one stack to another in same order

        Stack<Integer> st = new Stack<>();

        System.out.print("Enter number of elements you want to insert : ");
        int n = sc.nextInt();
        System.out.print("Enter "+n+" elements : ");
        for(int i=1 ; i<=n ; i++){
            int x = sc.nextInt();
            st.push(x);
        }

        // Putting st elements in temp stack in reverse order
        Stack<Integer> temp = new Stack<>();
        while (st.size()>0){
            //int x = st.peek();
            temp.push(st.pop());
            //st.pop();
        }
        System.out.println(temp);

        // Putting the elements of temp in rt stack in reverse order so that it is same as st
        Stack<Integer> rt = new Stack();
        while (temp.size()>0){
            rt.push(temp.pop());
        }
        System.out.println(rt);

        // Now st and temp both stack are empty
        System.out.println(st);
        System.out.println(temp);

    }
}
