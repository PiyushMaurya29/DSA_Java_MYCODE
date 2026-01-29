package Arrays.Array_Questions;
import java.util.*;
public class SubArray_MaxSum {
    static void maxSubArraySum(int arr[]){
        int n = arr.length;
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++){
            int start = i; // start and end written for understanding purpose only
            for(int j=i ; j<n ; j++){
                int end = j;
                currentSum = 0;
                for(int k=start ; k<=end ; k++){
                    //subArray Sum
                    currentSum += arr[k];
                }
                System.out.println(currentSum);
                if(maxSum<currentSum){
                    maxSum = currentSum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Maximum Sum : "+maxSum);
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
        maxSubArraySum(arr);
    }
}
