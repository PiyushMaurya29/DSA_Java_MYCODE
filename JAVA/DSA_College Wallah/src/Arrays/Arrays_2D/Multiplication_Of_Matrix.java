package Arrays.Arrays_2D;
import java.util.Scanner;
public class Multiplication_Of_Matrix {
    static void printArray(int arr[][]){
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[i].length ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void multiplyMatrix(int arr[][] , int r1 , int c1 , int brr[][] , int r2 , int c2){
        if(c1 != r2){
            System.out.println("Multiplication of matrix is not possible - Wrong dimensions");
            return;
        }
        int mul[][] = new int[r1][c2];
        for(int i=0 ; i<r1 ; i++){      //row number
            for(int j=0 ; j<c2 ; j++){  //column number
                for(int k=0 ; k<r2 ; k++){   //Can use c1 instead of r2
                    // mul[i][j] = ith row of a * jth col of b
                    mul[i][j] += (arr[i][k] * brr[k][j]);
                }
            }
        }
        System.out.println("Multiplication of array : ");
        printArray(mul);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows and column of 1st Matrix : ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int arr[][] = new int[r1][c1];

        System.out.println("Enter "+r1*c1+" elements of 1st Matrix : ");
        for(int i=0 ; i<r1 ; i++){
            for(int j=0 ; j<c1 ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter number of rows and column of 2nd Matrix : ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int brr[][] = new int[r2][c2];
        System.out.println("Enter "+r2*c2+" elements of 2nd Matrix : ");
        for(int i=0 ; i<r2 ; i++){
            for(int j=0 ; j<c2 ; j++){
                brr[i][j] = sc.nextInt();
            }
        }

        multiplyMatrix(arr,r1,c1,brr,r2,c2);
    }
}
