package Recursion.Arrays;

public class isArraySorted {
    static boolean isSorted2(int arr[] , int index){
        if(index==arr.length-1) return true;
        if(arr[index] > arr[index+1]){
            return false;
        }
        return isSorted2(arr,index+1);
    }
    static boolean isSorted(int arr[] , int index){
        if(arr.length==0 || arr.length==1) return true;
        if(index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && isSorted(arr,index+1);
    }
    public static void main(String[] args) {
        // Find if array is sorted or not
        int arr[] = {23,34,56,78,89,90,99};

        System.out.println(isSorted(arr , 0));

        System.out.println(isSorted2(arr,0));
    }
}
