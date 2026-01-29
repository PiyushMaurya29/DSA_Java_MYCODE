package Stacks.QuestionsOnStack;

import java.util.*;
public class _3_RemoveConsecutiveSubsequences {
    public static int[] removeConSubSeq(int arr[]){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0 ; i<n ; i++){
            if(st.size()==0 || st.peek()!=arr[i]) st.push(arr[i]);
//            if(st.peek()!=arr[i]) st.push(arr[i]);
            else if(arr[i]==st.peek()){
                if(i==n-1 || arr[i]!=arr[i+1]) st.pop();
            }
        }
        int m = st.size();
        int res[] = new int[m];
        for(int i=m-1 ; i>=0 ; i--){
            res[i] = st.pop();
        }
        return res;
    }
    public static void main(String[] args) {
        /*
            Q. Given a sequence of numbers. Remove all the consecutive subsequences of
               length greater than or equal to 2 that contains the same element.

               Input : 1 2 2 3 10 10 10 4 4 4 5 7 7 2
               Output : 1 3 5 2
         */

        int arr[] = {1,2,2,3,10,10,10,4,4,4,5,7,7,2};

        int res[] = removeConSubSeq(arr);

        System.out.println(Arrays.toString(res));

    }
}
