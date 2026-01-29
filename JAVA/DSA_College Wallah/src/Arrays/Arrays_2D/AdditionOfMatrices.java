package Arrays.Arrays_2D;
import java.util.Scanner;
public class AdditionOfMatrices {
    static void addTwoMatrix(int arr[][] , int r1 , int c1 , int brr[][] , int r2 , int c2){
        if(r1 != r2 || c1 != c2){
            System.out.println("Wrong Input - Addition Not Possible");
            return;
        }
        int sum[][] = new int[r1][c1];
        for(int i=0 ; i<r1 ; i++){
            for(int j=0 ; j<c1 ; j++){
                sum[i][j] = arr[i][j] + brr[i][j];
            }
        }
        printArray(sum);
    }
    static void printArray(int arr[][]){
        for(int i=0 ; i<arr.length ; i++){         //Rows
            for(int j=0 ; j<arr[i].length ; j++){  //Columns
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Only Matrices with same rows and columns i.e. (same dimensions) can be added.

        System.out.print("Enter number of rows of 1st matrix : ");
        int r1 = sc.nextInt();
        System.out.print("Enter number of columns of 1st matrix : ");
        int c1 = sc.nextInt();
        int arr[][] = new int[r1][c1];

        System.out.println("Enter "+r1*c1+" elements in 1st array : ");
        for(int i=0 ; i<r1 ; i++){
            for(int j=0 ; j<c1 ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter number of rows of 2nd matrix : ");
        int r2 = sc.nextInt();
        System.out.print("Enter number of columns of 2nd matrix : ");
        int c2 = sc.nextInt();
        int brr[][] = new int[r2][c2];
        System.out.println("Enter "+r2*c2+" elements in 2nd array : ");
        for(int i=0 ; i<r2 ; i++){
            for(int j=0 ; j<c2 ; j++){
                brr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix 1 : ");
        printArray(arr);
        System.out.println("Matrix 2 : ");
        printArray(brr);

        System.out.println("Sum of two matrix : ");
        addTwoMatrix(arr,r1,c1,brr,r2,c2);

    }
}
