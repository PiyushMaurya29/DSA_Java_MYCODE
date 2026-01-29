package Arrays.Arrays_2D;
import java.util.*;
public class SearchingKey {
    static boolean search(int matrix[][] , int key){
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[i].length ; j++){
                if(matrix[i][j] == key){
                    System.out.println("Found at index : ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not Found");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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

        System.out.print("Enter key you want to search : ");
        int key = sc.nextInt();

        search(matrix,key);
    }
}
