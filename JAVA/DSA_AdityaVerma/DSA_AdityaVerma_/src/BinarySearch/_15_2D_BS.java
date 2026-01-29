package BinarySearch;

import java.util.Arrays;

public class _15_2D_BS {
    static int[] searchInSortedMatrix(int matrix[][], int key){
        int rows = matrix.length;
        int columns = matrix[0].length;

        // Start from the top-right corner
        int row = 0, col = columns-1;
        // Optional Conditions = row>=0 and col<columns
        while (row>=0 && row<rows && col>=0 && col<columns){
            int currentElement = matrix[row][col];
            if(key == currentElement) return new int[]{row,col};
            else if(key > currentElement) row++;
            else col--;
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        // Search in Row wise + Column wise Sorted Matrix

        // TC = O(n+m) // n = row, m = column
        int matrix[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};

        int answerIndex[] = searchInSortedMatrix(matrix, 10);

        System.out.println("Index of key : "+ Arrays.toString(answerIndex));

    }
}
