package Loops;
import java.util.Scanner;
public class ABCD_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int r = sc.nextInt();

        int nst = 1;
        int nsp = r-1;

        for(int i=1 ; i<=r ; i++){
            for(int j=1 ; j<=nsp ; j++){
                System.out.print(" ");
            }
            nsp--;

            char ch = 'A';
            for(int k=1 ; k<=nst ; k++){
                System.out.print(ch);
                ch++;
            }
            nst+=2;
            System.out.println();
        }
    }
}
