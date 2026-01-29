package Recursion.RecursionOnArrays;
import java.util.Scanner;
public class PrintArrayValues_Recursively {
    static void printArrayRecursively(int arr[] , int index){
        //base case
        if(index == arr.length) return;
        //self work
        System.out.print(arr[index]+" ");
        //recursive work - sub problem
        printArrayRecursively(arr,index+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q. Given an array , print all its values recursively.

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+n+" elements in array : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int index = 0;  //Implies that the first element of array at o index
        //Index 0 is passes to traversing the array
        printArrayRecursively(arr,index);
    }
}
