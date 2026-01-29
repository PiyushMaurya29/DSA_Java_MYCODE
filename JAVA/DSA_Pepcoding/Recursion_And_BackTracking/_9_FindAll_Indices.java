package Recursion_And_BackTracking;

import java.util.ArrayList;
import java.util.Arrays;

public class _9_FindAll_Indices {
    static void findAllIndices1(int arr[], int idx, int key, ArrayList<Integer> list){
        if(idx == arr.length){
            return;
        }
        if(key == arr[idx]){
            list.add(idx);
        }
        findAllIndices1(arr, idx+1, key, list);
    }
    static ArrayList<Integer> findAllIndices2(int arr[], int idx, int key){
        ArrayList<Integer> list = new ArrayList<>();
        if(idx >= arr.length){
            return list;
        }
        if(key == arr[idx]){
            list.add(idx);
        }
        list.addAll(findAllIndices2(arr, idx+1, key));
        return list;
    }
    static int[] findAllIndices3(int arr[], int idx, int key, int count){ // Class Solution
        if(idx == arr.length){
            return new int[count];
        }
        if(key == arr[idx]){
            int ansArray[] =  findAllIndices3(arr, ++idx, key, ++count);
            ansArray[count] = idx;
            return ansArray;
        }else {
            int ansArray[] = findAllIndices3(arr, ++idx, key, count);
            return ansArray;
        }
    }
    public static void main(String[] args) {

        int arr[] = {10, 12, 34, 12, 65, 99, 12, 64, 43};
        int key = 12;
        ArrayList<Integer> list = new ArrayList<>();
        findAllIndices1(arr, 0, key, list);
        System.out.println(list);

        ArrayList<Integer> allIndices = findAllIndices2(arr, 0, key);
        System.out.println(allIndices);

        // Not working properly
        int ans[] = findAllIndices3(arr, 0, key, 0);
        System.out.println(Arrays.toString(ans));
    }
}
