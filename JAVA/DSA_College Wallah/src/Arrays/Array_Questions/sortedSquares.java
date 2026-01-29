package Arrays.Array_Questions;

import java.util.Arrays;

public class sortedSquares {
    static void swap(int arr[] , int left , int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    static void reverseArray(int arr[]){
        int left = 0 , right = arr.length-1;
        while (right > left){
//            int temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
            swap(arr,left,right);
            left++;
            right--;
        }
    }
    static int[] sortSquares(int arr[]){
        int n = arr.length;
        int left = 0 , right = n-1;
        int ans[] = new int[n];
        int k = 0; // For traversing answer array
        // We can skip reverse part if we fill answer from last

        while (right >= left){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++] = arr[left] * arr[left];
                left++;
            }else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        reverseArray(ans);
        return ans;
    }
    public static void main(String[] args) {

        int arr[] = {-10,-3,-2,1,4,5};

        int ans[] = sortSquares(arr);

        System.out.println(Arrays.toString(ans));

    }
}
