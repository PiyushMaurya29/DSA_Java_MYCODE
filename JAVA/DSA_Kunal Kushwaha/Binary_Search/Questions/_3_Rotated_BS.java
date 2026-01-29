package Binary_Search.Questions;

import java.util.Scanner;

public class _3_Rotated_BS {
    static int rotatedBS(int arr[] , int target , int s , int e){
        if(s > e) return -1;
        int mid = s + (e - s) / 2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[s] <= arr[mid]){
            if(target >= arr[s] && target <= arr[mid]){
                return rotatedBS(arr , target , s , mid-1);
            }
            else{
                return rotatedBS(arr , target , mid+1 , e);
            }
        }
        if(target >= arr[mid] && target <= arr[e]){
            return rotatedBS(arr , target , mid+1 , e);
        }
        return rotatedBS(arr , target , s , mid-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {4,5,6,2,1,0,12};
        int target = 0;
        System.out.println(rotatedBS(arr,target,0,arr.length-1));

    }
}
