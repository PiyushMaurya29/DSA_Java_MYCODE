package BinarySearch.BS_Questions;

import java.util.Scanner;

public class _4_BS_RotatedArrayTargetIdx {

    static int findTargetIdx(int arr[], int target){
        int n = arr.length;
        int s=0, e=n-1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == target) return mid;
            // If we take any 2 segments of an array atleast one of the segment will be sorted
            else if(arr[mid] < arr[e]){ // mid to end is sorted
                if(target > arr[mid] && target <= arr[e]){
                    s = mid + 1;
                }else{
                    e = mid - 1;
                }
            }
            else{ // start to mid is sorted
                if(target >= arr[s] && target < arr[mid]){
                    e = mid - 1;
                }else{
                    s = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
               Q. Given the rotated sorted array of integers, which contains distinct elements, and an integer target,
                  return the index of target if it is in the array . Else return -1.
         */

        int arr[] = {3, 4, 5, 1, 2};
        int target = 2;
        System.out.println(findTargetIdx(arr, target));

    }
}
