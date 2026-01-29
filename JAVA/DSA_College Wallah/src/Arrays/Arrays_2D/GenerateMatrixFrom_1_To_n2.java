package Arrays.Arrays_2D;
import java.util.Scanner;
public class GenerateMatrixFrom_1_To_n2 {
    static void printMatrix(int arr[][]){
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[i].length ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] GenerateSpiralMatrix(int n){
        int matrix[][] = new int[n][n];
        int current = 1;
        int topRow = 0 , bottomRow = n-1;
        int leftColumn = 0 , rightColumn = n-1;
        while (current <= n * n){
            //top row -> leftCol to rightColumn
            for(int j=leftColumn ; j<=rightColumn && current<=n*n ; j++){
                matrix[topRow][j] = current; //Or write current++.
                current++;
            }
            topRow++;
            //rightColumn -> topRow to bottomRow
            for(int i=topRow ; i<=bottomRow && current<=n*n; i++){
                matrix[i][rightColumn] = current;
                current++;
            }
            rightColumn--;
            //bottomRow -> rightColumn to leftColumn
            for(int j=rightColumn ; j>=leftColumn && current<=n*n; j--){
                matrix[bottomRow][j] = current;
                current++;
            }
            bottomRow--;
            //leftColumn -> bottomRow to topRow
            for(int i=bottomRow ; i>=topRow && current<=n*n; i--){
                matrix[i][leftColumn] = current;
                current++;
            }
            leftColumn++;

        }
        return matrix;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Q. Given a positive integer n, generate an nXn matrix filled
        with elements from 1 to n^2 in spiral order.
         */
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();

        int matrix[][] = GenerateSpiralMatrix(n);
        printMatrix(matrix);
    }
}
