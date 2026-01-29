package Stacks.QuestionsOnStack;

import java.util.Arrays;
import java.util.Stack;

public class _6_All_Greater_Smaller_Stack {
    static int[] findNextGreaterEle(int arr[]){
        int n = arr.length;
        int res[] = new int[n];
        Stack<Integer> st = new Stack<>();
        res[n-1] = -1;
        st.push(arr[n-1]);
        for(int i=n-2 ; i>=0 ; i--){
            while (!st.isEmpty() && arr[i]>=st.peek()) st.pop();
            if(st.isEmpty()) res[i] = -1;
            else res[i] = st.peek();
            st.push(arr[i]);
        }
        return res;
    }
    static int[] findPrevGreaterEle(int arr[]){
        int n = arr.length;
        int res[] = new int[n];
        Stack<Integer> st = new Stack<>();
        res[0] = -1;
        st.push(arr[0]);
        for(int i=1 ; i<n ; i++){
            while (!st.isEmpty() && arr[i]>=st.peek()) st.pop();
            if(st.isEmpty()) res[i] = -1;
            else res[i] = st.peek();
            st.push(arr[i]);
        }
        return res;
    }
    static int[] findNextSmallerEle(int arr[]){
        int n = arr.length;
        int res[] = new int[n];
        Stack<Integer> st = new Stack<>();
        res[n-1] = -1;
        st.push(arr[n-1]);
        for(int i=n-2 ; i>=0 ; i--){
            while (!st.isEmpty() && arr[i]<=st.peek()) st.pop();
            if(st.isEmpty()) res[i] = -1;
            else res[i] = st.peek();
            st.push(arr[i]);
        }
        return res;
    }
    static int[] findPrevSmallerEle(int arr[]){
        int n = arr.length;
        int res[] = new int[n];
        Stack<Integer> st = new Stack<>();
        res[0] = -1;
        st.push(arr[0]);
        for(int i=1 ; i<n ; i++){
            while (!st.isEmpty() && st.peek()>=arr[i]) st.pop();
            if(st.isEmpty()) res[i] = -1;
            else res[i] = st.peek();
            st.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {5,2,4,6,3,};
        int nextGreater[] = findNextGreaterEle(arr);
        System.out.println(Arrays.toString(nextGreater));
        int prevGreater[] = findPrevGreaterEle(arr);
        System.out.println(Arrays.toString(prevGreater));
        int nextSmaller[] = findNextSmallerEle(arr);
        System.out.println(Arrays.toString(nextSmaller));
        int prevSmaller[] = findPrevSmallerEle(arr);
        System.out.println(Arrays.toString(prevSmaller));
    }
}
