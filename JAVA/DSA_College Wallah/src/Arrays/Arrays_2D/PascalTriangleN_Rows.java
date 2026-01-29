package Arrays.Arrays_2D;
import java.util.Scanner;
public class PascalTriangleN_Rows {
    static void printMatrix(int matrix[][]){
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[i].length ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] pascal(int n){
        int pascal[][] = new int[n][];

        for(int i=0 ; i<n ; i++){
            //ith row has (i+1)th column
            pascal[i] = new int[i+1];
            //1st and last element of every row is 1.
            pascal[i][0] = pascal[i][i] = 1;

            for(int j=1 ; j<i ; j++){
                pascal[i][j] = pascal[i-1][j] + pascal[i-1][j-1];
            }
        }
        return pascal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Pascal Triangle look like
        1
        1  1
        1  2  1
        1  3  3  1
        1  4  6  4  1
        * General Formula p[i][j] = p[i-1][j] + p[i-1][j-1]
        * In every row , first and last element is 1.
        * ith row has (i+1) columns.
        * This is jagged array because it is not in form of square
        ith row has (i+1)th column
         */
        System.out.print("Enter number of rows of pascal triangle : ");
        int n = sc.nextInt();

        System.out.println("The required pascal triangle : ");
        int pascal[][] = pascal(n);
        printMatrix(pascal);

    }
}
