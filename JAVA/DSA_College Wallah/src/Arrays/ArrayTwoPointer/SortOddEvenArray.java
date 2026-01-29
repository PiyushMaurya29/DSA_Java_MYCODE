package Arrays.ArrayTwoPointer;
import java.util.Scanner;
public class SortOddEvenArray {
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
    static void sortOddEvenArray(int arr[]){
        int n = arr.length;
        int left = 0 , right = n-1;
        while (left<right){
            if((arr[left]%2==1) && (arr[right]%2==0)){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]%2==0) left++;
            if(arr[right]%2==1) right--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Given an array of integers arr move all the even integers
        at the beginning of the array followed by all the odd integers
        The relative order of odd or even integers does not matter
        Return an array that satisfies the condition.
         */

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+n+" elements in array ");
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        sortOddEvenArray(arr);

        System.out.println("Sorted Array : ");
        printArray(arr);

    }
}
