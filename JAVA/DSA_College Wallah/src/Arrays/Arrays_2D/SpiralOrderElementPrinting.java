package Arrays.Arrays_2D;
import java.util.Scanner;
public class SpiralOrderElementPrinting {
    static void printMatrix(int matrix[][]){
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[i].length ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void printSpiralOrder(int matrix[][] , int r , int c){
        int topRow = 0 , bottomRow = r-1;
        int leftColumn = 0 , rightColumn = c-1;
        int totalElements = 0;
        while (totalElements < r * c){
            //top row -> leftCol to rightColumn
            for(int j=leftColumn ; j<=rightColumn && totalElements<r*c ; j++){
                System.out.print(matrix[topRow][j]+" ");
                totalElements++;
            }
            topRow++;
            //rightColumn -> topRow to bottomRow
            for(int i=topRow ; i<=bottomRow && totalElements<r*c; i++){
                System.out.print(matrix[i][rightColumn]+" ");
                totalElements++;
            }
            rightColumn--;
            //bottomRow -> rightColumn to leftColumn
            for(int j=rightColumn ; j>=leftColumn && totalElements<r*c; j--){
                System.out.print(matrix[bottomRow][j]+" ");
                totalElements++;
            }
            bottomRow--;
            //leftColumn -> bottomRow to topRow
            for(int i=bottomRow ; i>=topRow && totalElements<r*c; i--){
                System.out.print(matrix[i][leftColumn]+" ");
                totalElements++;
            }
            leftColumn++;

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*  1 2 3
            4 5 6
            7 8 9
            Spiral Order = 1 , 2 , 3 , 6 , 9 , 8 , 7 , 4 , 5
            Steps :
            1. Print top row
            2. Print right column
            3. Print last row
            4. Print left column
         */
        System.out.print("Enter number of rows and column of matrix : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int matrix[][] = new int[r][c];
        int totalElements = r * c;
        System.out.println("Enter "+totalElements+" elements in matrix : ");
        for(int i=0 ; i<r ; i++){
            for(int j=0 ; j<c ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input Matrix : ");
        printMatrix(matrix);
        System.out.println("Spiral Order Elements : ");
        printSpiralOrder(matrix,r,c);


    }
}
