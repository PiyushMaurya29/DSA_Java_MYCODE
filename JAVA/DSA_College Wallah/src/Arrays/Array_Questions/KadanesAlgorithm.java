package Arrays.Array_Questions;

import java.util.Scanner;

public class KadanesAlgorithm {
    static void kadanes(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0 ; i<arr.length ; i++){
            currSum = currSum + arr[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum,maxSum);
        }
        System.out.println("Our Maximum SubArray sum is : "+maxSum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Kadanes Algorithm calculates the maximum subArray sum

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements of array : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        // Example arr[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(arr);
    }
}
