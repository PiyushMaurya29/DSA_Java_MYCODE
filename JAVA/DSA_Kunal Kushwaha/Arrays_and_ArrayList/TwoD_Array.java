package Arrays_and_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class TwoD_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[3][];
        int brr[][] = {
                {23,25,67},
                {11,22},
                {55,66,77,199},
        };

        // Printing matrix brr
        for(int i=0 ; i<brr.length ; i++){
            for(int j=0 ; j<brr[i].length ; j++){
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println(Arrays.toString(brr[2]));

        System.out.print("Enter number of row : ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int c = sc.nextInt();

        int matrix[][] = new int[r][c];
        // Input of matrix
        System.out.println("Enter values in matrix : ");
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[i].length ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // Printing matrix :
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[i].length ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        // 2nd method for printing
        for(int i=0 ; i<r ; i++){
            System.out.println(Arrays.toString(arr[r]));
        }

        // 3rd method for printing
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }


    }
}
