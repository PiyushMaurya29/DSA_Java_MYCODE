package Methods_OR_Functions;
import java.util.Scanner;
public class Pascal_TriangleUsingNcR {
    static int factorial(int n){
        int fact = 1;
        for(int i=1 ; i<=n ; i++){
            fact = fact * i;
        }
        return fact;
    }
    static int combination(int n , int r){
        int nCr = factorial(n)/(factorial(r)*factorial(n-r));
        return nCr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Pascal Triangle
           oC0
           1C0  1C1
           2C0  2C1  2C2
           3C0  3C1  3C2  3C1
         */
        System.out.print("Enter number of rows for pascal triangle : ");
        int n = sc.nextInt();

        int nsp = n-1;
        for(int i=0 ; i<n ; i++){
            for(int k=1 ; k<=nsp ; k++){
                System.out.print(" ");
            }
            nsp--;
            for(int j=0 ; j<=i ; j++){
                int iCj = combination(i,j);
                System.out.print(iCj+" ");
            }
            System.out.println();
        }

    }
}
