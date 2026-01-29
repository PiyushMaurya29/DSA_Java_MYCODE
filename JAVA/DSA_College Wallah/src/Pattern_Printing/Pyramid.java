package Pattern_Printing;
import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int r = sc.nextInt();
        int nst = 1; //nst => Number of stars
        int nsp = r-1; //nsp => Number of space

        for(int i=1 ; i<=r ; i++){
            for(int j=1 ; j<=nsp ; j++){  //Use r-i space
                System.out.print(" ");
            }
            nsp--;
            for(int k=1 ; k<=nst ; k++){ //Use 2*i-1 stars
                System.out.print("*");
            }
            nst+=2;
            System.out.println();
        }
    }
}
