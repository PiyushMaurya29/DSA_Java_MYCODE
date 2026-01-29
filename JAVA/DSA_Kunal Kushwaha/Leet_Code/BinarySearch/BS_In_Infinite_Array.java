package Leet_Code.BinarySearch;

public class BS_In_Infinite_Array {
    static int ans(int arr[] , int target){
        // first find the range
        // first find with a box of size 2
        int start = 0 , end = 1;

        // condition for the target to lie in the range
        while (target > arr[end]){
            int newStart = end + 1;
            // double the box value
            // end = prevEnd + sizeOfBox * 2
            end = end + (end - start) * 2;
            start = newStart;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int arr[] , int target , int start , int end){
        while (start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] > target){
                end = mid - 1;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        /*
        If we have given an infinite array . Means we have to assume that we
        don't know the length of array the we take part-wise array and search
        for target element.
         */

        int arr[] = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(ans(arr,target));

    }
}
