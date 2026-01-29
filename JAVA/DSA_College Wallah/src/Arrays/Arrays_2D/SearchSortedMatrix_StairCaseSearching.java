package Arrays.Arrays_2D;
import java.util.*;
public class SearchSortedMatrix_StairCaseSearching {
    static boolean stairCaseSearch(int matrix[][] , int key){
        int row = 0, col = matrix[0].length-1;

        while(row< matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("Found key at ("+row+","+col+")");
                return true;
            }
            else if(key < matrix[row][col]){
                col--;
            }
            else {
                row++;
            }
        }
        System.out.println("Key not Found");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Search for a key in row wise and column wise in sorted Matrix.
         * Matrix is sorted in both row and column wise

           Example : 10 20 30 40
                     15 25 35 45
                     27 29 37 48
                     32 33 39 50
         */

        // Stair Case Time Complexity O(n+m)
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

        System.out.print("Enter key you want to Search : ");
        int key = sc.nextInt();

        stairCaseSearch(matrix,key);


    }
}
