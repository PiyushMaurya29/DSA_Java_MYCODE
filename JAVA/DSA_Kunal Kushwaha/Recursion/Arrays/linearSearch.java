package Recursion.Arrays;

import java.util.ArrayList;

public class linearSearch {
    static int linearSearch(int arr[] , int index , int target){
        if(arr[index] == target){
            return index;
        }
        return linearSearch(arr ,index+1 , target);
    }
    static boolean linearSearch2(int arr[] , int target , int index){
        if(index == arr.length) return false;
        return arr[index] == target || linearSearch2(arr , target , index + 1);
    }
    static int LSFromLast(int arr[] , int target , int index){
        if(index == -1) return -1;
        if(arr[index] == target){
            return index;
        }
        return LSFromLast(arr,target,index-1);
    }
    static ArrayList<Integer> findAllIndex(int arr[] , int index , int target , ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr ,index+1 , target , list);
    }
    static ArrayList<Integer> findAllIndex2(int arr[] , int index , int target){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
//        This will contain answer for that call only
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr ,index+1 , target);
        list.addAll(ansFromBelowCalls);
        return list;
    }
    public static void main(String[] args) {

//        Linear search using recursion
        int arr[] = {12,34,56,43,21,87,43,65};
        int target = 43;
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(LSFromLast(arr,target,arr.length-1));
        System.out.println(linearSearch2(arr,target,0));
        System.out.println(linearSearch(arr,0,target));
        System.out.println(findAllIndex(arr,0,target,list));
        System.out.println(findAllIndex2(arr,0,target));
    }
}
