package Pattern_Printing;
import java.util.Scanner;
public class Triangle_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int r = sc.nextInt();

        int nst = 1;

        for(int i=1 ; i<=r ; i++){
            for(int j=1 ; j<=nst ; j++){ //Or use i instead of nst
                System.out.print("*");
            }
            nst++;
            System.out.println();
        }

    }
}
