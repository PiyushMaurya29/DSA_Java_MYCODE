package Recursion.RecursionOnArrays;
import java.util.Scanner;
public class sumArray_Recursively {
    static int sumOfArrayRecursion(int arr[] , int index){
        //base case
        if(index == arr.length) return 0;
        // recursive work and sub-problem
        return sumOfArrayRecursion(arr,index+1) + arr[index];
    }
    static int sumOfArrayRecursion2(int arr[], int idx, int sum){
        if(idx == arr.length){
            return sum;
        }
        return sumOfArrayRecursion2(arr, idx+1, sum + arr[idx]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements of array : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int index = 0; //Index implies from which index we have to start operation
        System.out.println("Sum : "+sumOfArrayRecursion2(arr,index,0));
    }
}
