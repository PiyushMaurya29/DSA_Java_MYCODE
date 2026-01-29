package Arrays.Array_Questions;

import java.util.*;
public class SumOfEachRow {
    public static void sumOfEachRow(int arr[][]){
        for(int i=0 ; i<arr.length ; i++){
            int sum = 0;
            for(int j=0 ; j<arr[i].length ; j++){
                sum += arr[i][j];
            }
            System.out.println("Sum of "+i+" row : "+sum);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows of matrix : ");
        int r = sc.nextInt();
        System.out.print("Enter columns of matrix : ");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];

        System.out.println("Enter "+r*c+" elements of Matrix : ");
        for(int i=0 ; i<r ; i++){
            for(int j=0 ; j<c ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sumOfEachRow(arr);
    }
}
