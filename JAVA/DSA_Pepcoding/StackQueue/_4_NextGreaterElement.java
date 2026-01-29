package StackQueue;

import java.util.Arrays;
import java.util.Stack;

public class _4_NextGreaterElement {
    public static int[] getNextGreaterElement(int arr[]){
        // From Right to Left
        int n = arr.length;
        int result[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1 ; i>=0 ; i--){
            while (!st.isEmpty() && st.peek()<=arr[i]) st.pop();
            if(st.isEmpty()) result[i] = -1;
            else result[i] = st.peek();
            st.push(arr[i]);
        }
        return result;
    }
    public static int[] getNextGreaterElement2(int arr[]){
        // From Left to Right
        int n = arr.length;
        int result[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0 ; i<n ; i++){
            while(st.size()>0 && arr[i]>arr[st.peek()]){
                int pos = st.pop();
                result[pos] = arr[i];
            }
            st.push(i);
        }
        while (!st.isEmpty()){
            int pos = st.pop();
            result[pos] = -1;
        }
        return result;
    }
    public static int[] getNextSmallerElement(int arr[]){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int result[] = new int[n];
        for(int i=n-1 ; i>=0 ; i--){
            while (!st.isEmpty() && st.peek()>arr[i]) st.pop();
            if(st.isEmpty()) result[i] = -1;
            else result[i] = st.peek();
            st.push(arr[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {2, 5, 9, 3, 1, 12, 6, 8, 7};
        int nge[] = getNextGreaterElement(arr);
        int nge2[] = getNextGreaterElement2(arr);
        int nse[] = getNextSmallerElement(arr);

        System.out.println(Arrays.toString(nge));
        System.out.println(Arrays.toString(nge2));
        System.out.println(Arrays.toString(nse));
    }
}
