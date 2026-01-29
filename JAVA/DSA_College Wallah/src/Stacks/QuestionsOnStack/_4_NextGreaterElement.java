package Stacks.QuestionsOnStack;

import java.util.Arrays;
import java.util.Stack;

public class _4_NextGreaterElement {
    public static int[] findNextGreaterEle(int arr[]){
        // TC = O(n^2) and SC = O(1)
        int n = arr.length;
        int res[] = new int[n];
        for(int i=0 ; i<n ; i++){
            res[i] = -1;
            for(int j=i+1 ; j<n ; j++){
                if(arr[j]>arr[i]){
                    res[i] = arr[j];
                    break;
                }
            }
        }
        return res;
    }
    static int[] findPrevGreaterEle(int arr[]){
        int n = arr.length;
        int res[] = new int[n];
        for(int i=0 ; i<n ; i++){
            res[i] = -1;
            for(int j=i ; j>=0 ; j--){
                if(arr[j]>arr[i]){
                    res[i] = arr[j];
                    break;
                }
            }
        }
        return res;
    }
    static int[] findNextGreaterEleStack(int arr[]){
        // TC = O(n) and SC = O(n)
        int n = arr.length;
        int res[] = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        res[n-1] = -1;
        for(int i=n-2 ; i>=0 ; i--){
            while (!st.isEmpty() && arr[i]>st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                res[i] = -1;
            }
            else{
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return res;
    }

    static int[] findPrevGreaterEleStack(int arr[]){
        int n = arr.length;
        int res[] = new int[n];
        Stack<Integer> st = new Stack<>();
        res[0] = -1;
        st.push(arr[0]);
        for(int i=1 ; i<n ; i++){
            while (!st.isEmpty() && arr[i]>st.peek()) st.pop();
            if(st.isEmpty()) res[i] = -1;
            else res[i] = st.peek();
            st.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {

        /*
            Q. Next greater element
            Input : 1 3 2 1 8 6 3 4
            Output : 3 8 8 8 -1 -1 4 -1
         */

//        int arr[] = {1, 3, 2, 1, 8, 6, 3, 4};
        int arr[] = {100,80,60,70,60,75,85};
        int nextGreater[] = findNextGreaterEleStack(arr);
        System.out.println(Arrays.toString(nextGreater));
        for(var r : nextGreater){
            System.out.print(r+" ");
        }
        System.out.println();
        int prevGreater[] = findPrevGreaterEleStack(arr);
        System.out.println(Arrays.toString(prevGreater));
        for(var r : prevGreater){
            System.out.print(r+" ");
        }
    }
}
