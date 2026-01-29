package Arrays.ArrayTwoPointer;
import java.util.Scanner;
public class SortArray_0_and_1_UsingSwapping {
    static void printArray(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int arr[] , int left , int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    static void sortArray_0_and_1(int arr[]){
        int n = arr.length;
        int left = 0 , right = n-1;
        while (left<right){
            if(arr[left]==1 && arr[right]==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]==0) left++;
            if(arr[right]==1) right--;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Sort array consist of 0 and 1 using Swapping
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements in array : ");
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        sortArray_0_and_1(arr);

        System.out.println("Sorted array : ");
        printArray(arr);
    }
}
