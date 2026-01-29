package Pattern_Printing;
import java.util.*;
public class Inverted_Pyramid {
    static void printInvertedPyramid(int n){
        for(int i=1 ; i<=n ; i++){
            // For Spaces
            for(int j=1 ; j<=n-i ; j++){
                System.out.print(" ");
            }
            // For Stars
            for(int k=1 ; k<=i ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of lines : ");
        int n = sc.nextInt();

        printInvertedPyramid(n);
    }
}
