package Methods_OR_Functions;
import java.util.*;
public class BinomialCoefficient {
//    static int fact(int n){
//        int f = 1;
//        for(int i=1 ; i<=n ; i++){
//            f *= i;
//        }
//        return f;
//    }
//    static int comb(int n , int r){
//        int nCr = fact(n)/(fact(r)*fact(n-r));
//        return nCr;
//    }

    static int factorial(int n){
        int f = 1;
        for(int i=1 ; i<=n ; i++){
            f *= i;
        }
        return f;
    }
    static int binCoff(int n , int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoff = fact_n/(fact_r*fact_nmr);
        return binCoff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Calculate binomial coefficient for given value n and r
           Binomial : nCr = n!/(r!(n-r)!)
           nCr = nC(n-r)
           Permutation : nPr = n!/(n-r)!
         */
        System.out.print("Enter value of n and r : ");
        int n = sc.nextInt();
        int r = sc.nextInt();

        int binAns = binCoff(n,r);
        System.out.println("Binomial Coefficient : "+binAns);

    }
}
