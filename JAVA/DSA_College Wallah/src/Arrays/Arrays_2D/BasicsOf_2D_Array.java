package Arrays.Arrays_2D;
import java.util.Scanner;
public class BasicsOf_2D_Array {
    static void printArray(int arr[][]){
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[i].length ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int c = sc.nextInt();


        int arr[][] = new int[r][c]; //Initialization

        System.out.println("Enter "+r*c+" elements in array : ");

        for(int i=0 ; i<r ; i++){
            for(int j=0 ; j<c ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        printArray(arr);
    }
}
