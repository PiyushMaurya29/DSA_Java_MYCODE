package Recursion.RecursionOnArrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Searching {

    static boolean lSearch(int arr[], int idx, int n, int target){
        // base case
        if(idx == n){
            return false;
        }
        // self work
        if(arr[idx] == target){
            return true;
        }
        // recursive work
        return lSearch(arr, idx+1, n, target);
    }
    static void findAllIndices(int arr[], int n, int target, int idx){
        // base case
        if(idx >= n){
            return;
        }
        // self work
        if(arr[idx] == target){
            System.out.print(idx+", ");
        }
        // recursive work
        findAllIndices(arr, n, target, idx+1);
    }

    static ArrayList<Integer> targetAllIndices(int arr[], int n, int target, int idx){

        ArrayList<Integer> ans = new ArrayList<>();

        // base case
        if(idx >= n){
            return ans; // return empty arraylist
        }
        // self work
        if(arr[idx] == target){
            ans.add(idx);
        }
        // recursive work
        ArrayList<Integer> smallAns = targetAllIndices(arr, n, target, idx+1);
        ans.addAll(smallAns);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {1, 2, 4, 2, 6, 8, 9, 2};
        int target = 2;     // Key value;

        int n = arr.length;
        if(lSearch(arr, 0, n, target)){
            System.out.println("Yes, Found");
        }else {
            System.out.println("No, Not found");
        }

        findAllIndices(arr, arr.length, target, 0);

        ArrayList<Integer> ans = targetAllIndices(arr, n, target, 0);

        // Printing Arraylist using foreach loop

        System.out.println();
        for(Integer i: ans){
            System.out.println(i);
        }

    }
}
