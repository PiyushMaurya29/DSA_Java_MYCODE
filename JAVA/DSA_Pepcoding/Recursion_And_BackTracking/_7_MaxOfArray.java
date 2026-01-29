package Recursion_And_BackTracking;

public class _7_MaxOfArray {
    static int findMaxOfArray1(int arr[], int idx, int max){
        if(idx == arr.length) return max;
        if(arr[idx] > max){
            return findMaxOfArray1(arr, idx+1, arr[idx]);
        }
        return findMaxOfArray1(arr, idx+1, max);
    }
    static int findMaxOfArray2(int arr[], int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        int maxInSmallerArray = findMaxOfArray2(arr, idx+1);
        if(maxInSmallerArray > arr[idx]){
            return maxInSmallerArray;
        }
        return arr[idx];
    }
    static int findMaxOfArray3(int arr[], int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }else{
            int maxInRest = findMaxOfArray3(arr, idx+1);
            return Math.max(arr[idx], maxInRest);
        }
    }
    public static void main(String[] args) {

        int arr[] = {23, 45, 11, 89, 99, 67, 54};
        System.out.println(findMaxOfArray1(arr, 0, Integer.MIN_VALUE));
        System.out.println(findMaxOfArray2(arr, 0));
        System.out.println(findMaxOfArray3(arr, 0));
    }
}
