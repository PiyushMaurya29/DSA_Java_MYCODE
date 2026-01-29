package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class TwoD_MatrixSearching {
    static int[] searchInMatrix(int arr[][] , int target){
        for(int row=0 ; row<arr.length ; row++){
            for(int col=0 ; col<arr[row].length ; col++){
                if(target==arr[row][col]){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {

        int matrix[][] = {
            {12,34,99},
            {55,32,19,17},
            {49,41,56,29},
                {18,22},
        };

        int target = 29;

        int ans[] = searchInMatrix(matrix,target);
        // format of return value {row,col}
        System.out.println(Arrays.toString(ans));

    }
}
