package Pattern_Printing;
import java.util.*;
public class Diamond_Pattern {
    static void printDiamondPattern(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Lines : ");
        int n = sc.nextInt();

        // For upper part
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=n-i ; j++){
                System.out.print(" ");
            }
            for(int k=1 ; k<=2*i-1 ; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        // For lower part
        for(int i=n ; i>=1 ; i--){
            for(int j=1 ; j<=(n-i) ; j++){
                System.out.print(" ");
            }
            for(int k=1 ; k<=(2*i)-1 ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        printDiamondPattern();
    }
}
