package BinarySearch.BS_Questions;

import java.util.Scanner;

public class _3_BS_RotatedArrayMinIdx {
    static int findMinIdx(int arr[]){
        int n = arr.length;
        int s=0, e=n-1;
        int ans = -1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] <= arr[n-1]){
                ans = mid;
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
             Q. A rotated sorted array is a sorted array on which rotation operation has been performed some
                number of times. Given a rotated sorted array, find the index of the minimum element in the array.
                Follow 0-based indexing.
                It is guaranteed that all the elements in the array are unique.

                Input : Array = [3, 4, 5, 1, 2]
                Output : 3
         */
        // Find index of pivot or the index of minimum element

        int arr[] = {3, 4, 5, 1, 2};
        System.out.println(findMinIdx(arr));

    }
}
