package Arrays.Arrays_2D;
import java.util.Scanner;
public class MatrixRotateBy_90_Degree {
    static void printArray(int arr[][]){
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[i].length ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void reverseArray(int arr[]){
        int i=0 , j=arr.length - 1;
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void transposeInPlace(int arr[][] , int r , int c){
        for(int i=0 ; i<r ; i++){
            for(int j=0 ; j<c ; j++){
                if(j>i){
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
    }
    static void rotate(int matrix[][] , int n){ // n represent both row and column
        //Doing transpose of matrix
        transposeInPlace(matrix,n,n);

        //Reverse each row of transpose matrix
        for(int i=0 ; i<n ; i++){
            reverseArray(matrix[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Rotated 90 matrix is formed by taking transpose
        of matrix and then reversing the elements of each row
        It is only applicable for square matrix
         */
        System.out.print("Enter number of rows and column of matrix : ");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        System.out.println("Enter elements of array : ");
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input Matrix : ");
        printArray(arr);

        rotate(arr,n);
        System.out.println("Rotation of matrix : ");
        printArray(arr);

    }
}
