package Pattern_Printing;
import java.util.*;
public class InvertedNumberPyramid {
    static void printInvertedNumberPyramid(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER Number of lines : ");
        int n = sc.nextInt();

        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=n-i+1 ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        printInvertedNumberPyramid();
    }
}
