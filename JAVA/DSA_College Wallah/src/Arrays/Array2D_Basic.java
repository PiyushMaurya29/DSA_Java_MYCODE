package Arrays;
import java.util.*;
public class Array2D_Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = {{3,45,6,67},{345,677},{23,34,5,6,78},{3,4,5,10,11,22,33}};

        // You can enter any number of row but column of each row may vary
//        for(int row=0 ; row<arr.length ; row++){
//            for(int col=0 ; col<arr[row].length ; col++){
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }

        // Printing 2D Matrix
        for(int i=0 ; i<arr.length ; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
