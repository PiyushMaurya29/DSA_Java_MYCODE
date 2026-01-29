package Arrays.Array_Questions;
import java.util.*;
public class SubArrayMaxSumPrefixSumArray {
    static void printArray(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void maxSubArraySum(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        //Calculate prefix Array
        for(int i=1 ; i<prefix.length ; i++){
            prefix[i] = prefix[i] + prefix[i-1];
        }

        for(int i=0 ; i<arr.length ; i++){
            int start = i;
            for(int j=i ; j<arr.length ; j++){
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(maxSum<currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum Sum = "+maxSum);
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
