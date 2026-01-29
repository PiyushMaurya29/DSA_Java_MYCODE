package Recursion.SubSeq_and_SubSets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _5_subSets {
    public static List<List<Integer>> subsetsWithDuplicates(int []arr){
        Arrays.sort(arr); // For taking duplicate elements together
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0, end = 0;
        for(int i=0 ; i<arr.length ; i++){
            start = 0;
            // If current and previous element is same, s = e + 1
            if(i>0 && arr[i] == arr[i-1]){
                start = end + 1;
            }
            end = outer.size()-1;
            int n = outer.size();
            for(int j=start ; j<n ; j++){
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
    public static List<List<Integer>> subsets(int arr[]){
        // TC = O(N*2^N) = (N * Total number of subsets)
        // SC = O(N*2^N) = (Space taken by each Subset * Total Subset)
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num : arr){
            int n = outer.size();
            for(int i=0 ; i<n ; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
    public static void main(String[] args) {
        // TC = O(N*2^N) = (N * Total number of subsets)
        // SC = O(N*2^N) = (Space taken by each Subset * Total Subset)
        int []arr = {1, 2, 3};
        List<List<Integer>> ans = subsets(arr);
        for(List<Integer> list : ans){
            System.out.println(list);
        }
        System.out.println(subsetsWithDuplicates(new int[]{1, 2, 2}));
        // When you find a duplicate element only add in to the newly created subset of previous step
        // We have to sort the array first, to make all the duplicates together
    }
}
