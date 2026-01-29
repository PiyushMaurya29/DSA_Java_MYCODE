package Recursion;

import java.util.ArrayList;

public class _3_SubSequences {
    public static void printSubSequence(int arr[], ArrayList<Integer> list, int idx, int n){
        if(idx == n){
            System.out.print(list+" ");
            return;
        }
        // take or pick the particular index into the subsequence
        list.add(arr[idx]);
        printSubSequence(arr, list, idx+1, n);
        list.remove(list.size()-1);
        // not pick, or not take condition, this element is not added to your subsequence
        printSubSequence(arr, list, idx+1, n);
    }
    public static void main(String[] args) {
        // SubSequences is a contiguous/continuous sequence which follows the order
        // Example : (312) = 3, 1, 2, 31, 12, 32, 312
        // Sequence maybe continuous or not but order should be maintained
        // Number of SubSequences = 2^n

        int arr[] = {3, 1, 2};
        int n = 3;
        ArrayList<Integer> list = new ArrayList<>();
        printSubSequence(arr, list, 0, n);

    }
}
