package Arrays.Array_Questions;
import java.util.*;
public class PrintSubArrays {
    static void printSubArrays(int arr[]){
        int n = arr.length;
        int totalSubArray = 0;
        for(int i=0 ; i<n ; i++){
            int start = i; // start and end written for understanding purpose only
            for(int j=i ; j<n ; j++){
                int end = j;
                for(int k=start ; k<=end ; k++){
                    System.out.print(arr[k]+" ");
                    totalSubArray++;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total SubArrays = "+totalSubArray);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // SubArray is a continuous part of array

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements of array : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        printSubArrays(arr);
    }
}
