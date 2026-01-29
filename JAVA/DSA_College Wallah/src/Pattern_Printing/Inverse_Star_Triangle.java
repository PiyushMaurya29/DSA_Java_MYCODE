package Pattern_Printing;
import java.util.Scanner;
public class Inverse_Star_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int r = sc.nextInt();
        int nst = r; //nst => Number of stars

        for(int i=1 ; i<=r ; i++){
            for(int j=1 ; j<=nst ; j++){
                System.out.print("*");
            }
            nst--;
            System.out.println();
        }
    }
}
