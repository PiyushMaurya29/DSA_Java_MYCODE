package Arrays.ArrayPrefixSum;
import java.util.Scanner;
public class ArrayPrefixSum1 {
    static void printArray(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
//    static int[] makePrefixSumArray(int arr[]){
//        int n = arr.length;
//        int pref[] = new int[n];
//        pref[0] = arr[0];
//        for(int i=1 ; i<n ; i++){
//            pref[i] = pref[i-1] + arr[i];
//        }
//        return pref;
//    }

    //2nd Method without new array
    static void makePrefixSumArray(int arr[]){
        int n = arr.length;

        for(int i=1 ; i<n ; i++){
            arr[i] = arr[i] + arr[i-1];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Q. Given an integer array arr return the prefix
        sum or running sum in the same array without creating new array
         */
        /*Prefix sum is sum of all elements of array till that
        index whose prefix sum is needed
        i.e. pre[i] = (0 to i) summation arr[i]

        arr[] = 2 , 1 , 3 , 4 , 5
        prefixSum[] = 2 , 3 , 6 , 10 , 15
        General Formula  prefixSum[i] = prefixSum[i-1] + arr[i]
         */

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+n+" elements in array : ");
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        //int pref[] = makePrefixSumArray(arr);

        makePrefixSumArray(arr);
        System.out.print("Prefix sum array : ");
        printArray(arr);
    }
}
