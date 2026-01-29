package BinarySearch;
import java.util.*;
public class BinarySearch_OrderAgnostic {
    static int orderAgnosticBS(int arr[] , int target){
        int start = 0 , end = arr.length-1;
        // find whether the array is sorted in ascending order or descending
        boolean isAsc = arr[start] < arr[end];
//        if(arr[start]<arr[end]){
//            isAsc = true;
//        }else {
//            isAsc = false;
//        }
        while (end>=start){
            int mid = (start+end)/2;

            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(arr[mid]>target){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else {
                if(arr[mid]<target){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {-18 , -12 , -4 , 0 , 2 , 3 , 4 , 15 , 16 , 18 , 22 , 45 , 89};
        int target = 22;
        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);

    }
}
