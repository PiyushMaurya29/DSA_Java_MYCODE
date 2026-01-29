package Pattern_Printing;
import java.util.Scanner;
public class Number_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int r = sc.nextInt();

        int nsp = r-1;
        int nst = 1;

        for(int i=1 ; i<=r ; i++){
            for(int j=1 ; j<=nsp ; j++){
                System.out.print(" ");
            }
            nsp--;

            int num = 1;
            for(int k=1 ; k<=nst ; k++){
                System.out.print(num);
                num++;
            }

            nst+=2;
            System.out.println();
        }
    }
}
