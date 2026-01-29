package Arrays.Arrays_2D;
import java.util.Scanner;
public class TransposeOfMatrix {
    static void printArray(int arr[][]){
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[i].length ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void transposeOf(int arr[][] , int r , int c){

        int transpose[][] = new int[c][r];
        for(int i=0 ; i<c ; i++){
            for(int j=0 ; j<r ; j++){
                transpose[i][j] = arr[j][i];
            }
        }
        System.out.println("Transpose of Matrix : ");
        printArray(transpose);
    }

    //2nd Method Used for Transpose without new array
    static void transposeInPlace(int arr[][] , int r , int c){
        for(int i=0 ; i<c ; i++){
            for(int j=0 ; j<r ; j++){ // use j=1 instead of if(j>i) will result same result
                //swap arr[i][j] ans arr[j][i]
                //swap only upper or lower triangle not both
                //swapping method only valid for square matrix
                if(j>i){
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
        System.out.println("Transpose Matrix : ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows and columns of matrix : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];

        int totalElements = r * c;

        System.out.println("Enter "+totalElements+" elements of array : ");
        for(int i=0 ; i<r ; i++){
            for(int j=0 ; j<c ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input Matrix : ");
        printArray(arr);
        //transposeOf(arr,r,c);
        transposeInPlace(arr,r,c);
        System.out.println("Transpose Matrix : ");
        printArray(arr);

    }
}
