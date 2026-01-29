package Arrays.Arrays_2D;

import java.util.*;

public class DiagonalSumOfMatrix {
    static int diagonalSumOfMatrix(int matrix[][]){
        int n = matrix.length; //For square matrix row and column is equal
        int diagonalSum = 0;
//        for(int i=0 ; i<n ; i++){ // O(n^2)
//            for(int j=0 ; j<n ; j++){
//                if((i==j)){   // Primary Diagonal Sum
//                    diagonalSum += matrix[i][j];
//                }
//                if((i+j)==n-1 && i!=j){  // Secondary Diagonal Sum
//                    diagonalSum += matrix[i][j];
//                }
//            }
//        }

        for(int i=0 ; i<n ; i++){  // More Optimised Code
            diagonalSum += matrix[i][i];  // Primary Diagonal Sum
            if(i != n-i-1){               // Secondary Diagonal Sum
                diagonalSum += matrix[i][n-i-1];
            }
        }
        return diagonalSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Find the sum of diagonal of a matrix of primary and secondary diagonal
           Only valid for a square matrix
         */

        System.out.print("Enter number of row and column of Matrix : ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int matrix[][] = new int[r][c];
        System.out.println("Enter elements of Matrix : ");
        for(int i=0 ; i<r ; i++){
            for(int j=0 ; j<c ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }



        System.out.println("Sum of Diagonals of Matrix : "+diagonalSumOfMatrix(matrix));

    }
}
