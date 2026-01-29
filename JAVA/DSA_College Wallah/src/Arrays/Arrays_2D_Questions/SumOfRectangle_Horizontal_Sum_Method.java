package Arrays.Arrays_2D_Questions;
import java.util.Scanner;
public class SumOfRectangle_Horizontal_Sum_Method {
    static void findPrefixSumMatrix(int matrix[][]){
        int r = matrix.length;     //Number of rows
        int c = matrix[0].length;  //Number of columns
        //traverse horizontally to calculate row wise perfix sum
        for(int i=0 ; i<r ; i++){
            for(int j=1 ; j<c ; j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }
    }
    static int findSum(int matrix[][] , int l1 , int r1 , int l2 , int r2){
        int sum = 0;
        findPrefixSumMatrix(matrix);
        for(int i=l1 ; i<=l2 ; i++){
            //r1 to r2 sum for row i
            if(r1>=1) {
                sum += matrix[i][r2] - matrix[i][r1 - 1];
            }
            else sum += matrix[i][r2];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Sum of Rectangle using the horizontal sum for
        each row in the Matrix.
         */
        System.out.print("Enter row and column of matrix : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int matrix[][] = new int[r][c];
        System.out.println("Enter elements of matrix : ");
        for(int i=0 ; i<r ; i++){
            for(int j=0 ; j<c ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter rectangular boundaries coordinates l1,r1,l2,r2 : ");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        System.out.print("Sum of rectangular : "+findSum(matrix,l1,r1,l2,r2));

    }
}
