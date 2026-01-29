package Recursion.RecursionOnArrays;
import java.util.*;
public class FirstOccurrenceOfElement_Recursion {
    static int findOccurrenceOfK(int arr[] , int idx , int key){
        if(idx==arr.length) return -1; // -1 means element not found
        if(arr[idx]==key) return idx;
        return findOccurrenceOfK(arr,idx+1 , key);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //WAP to find the first occurrence of an element in an array
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements of array : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element want to search : ");
        int key = sc.nextInt();
        System.out.println("First occurrence index of "+key+" is "+findOccurrenceOfK(arr,0,key));
    }
}
