package Stacks.QuestionsOnStack;

import java.util.Arrays;
import java.util.Stack;

public class _5_PreSmallerEle {
    static int[] findNextSmaller(int arr[]){
        int n = arr.length;
        int res[] = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(n-1);
        res[n-1] = -1;
        for(int i=n-2 ; i>=0 ; i--){
            while (!st.isEmpty() && arr[i]<=arr[st.peek()]) st.pop();
            if(st.isEmpty()) res[i] = -1;
            // For storing Index res[i] = st.peek()
            else res[i] = arr[st.peek()];
            st.push(i);
        }
        return res;
    }
    static int[] findPrevSmaller(int arr[]){
        int n = arr.length;
        int res[] = new int[n];
        Stack<Integer> st = new Stack<>();
        res[0] = -1;
        st.push(0);
        for(int i=1 ; i<n ; i++){
            while (!st.isEmpty() && arr[st.peek()]>=arr[i]) st.pop();
            if(st.isEmpty()) res[i] = -1;
            // For storing Index res[i] = st.peek()
            else res[i] = arr[st.peek()];
            st.push(i);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {5,2,4,6,3,5};
        int nextSmaller[] = findNextSmaller(arr);
        System.out.println(Arrays.toString(nextSmaller));
        int prevSmaller[] = findPrevSmaller(arr);
        for(var e : prevSmaller){
            System.out.print(e+" ");
        }
    }
}
