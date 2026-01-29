package Recursion.RecursionOnArrays;
import java.util.*;
public class LastOccurrenceOfElement_Recursion {
    static int lastOccurrence(int arr[] , int idx , int key){
        if(idx == arr.length) return -1; // -1 means element not found
        int isFound = lastOccurrence(arr,idx+1,key);
        if(isFound == -1 && arr[idx]==key) return idx;

        return isFound;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //WAP to find the last occurrence of an element in an array
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements of array : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element want to search : ");
        int key = sc.nextInt();
        System.out.println("Last occurrence index of "+key+" is "+lastOccurrence(arr,0,key));
    }
}
