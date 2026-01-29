package Recursion;
import java.util.Scanner;
public class Power_Recursion {
    static int power1(int p , int q){
        if(q==0) return 1;
        //recursive work
        //int smallAns = power(p,q-1);
        //Use p^q = p^q-1 * p
        return p * power1(p,q-1);
    }

    // 2nd Method is more efficient and optimized than first method
    static int power2(int p , int q){ // TimeC -> O(log(n))
        /* We can write
         * If q is even -> p^q = p^q/2 * p^q/2
         * If q is odd  -> p^q = p * p^q/2 * p^q/2
         */
        if(q==0) return 1;
        int smallPow = power2(p,q/2);

        if(q%2==0){
            return smallPow * smallPow;
        }
        return p * smallPow * smallPow;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Find p to the power q
        //Use p^q = p^q-1 * p
        System.out.print("Enter P and Q : ");
        int p = sc.nextInt();
        int q = sc.nextInt();

        //System.out.println("Value of p^q : "+power1(p,q));

        // Now , using 2nd Method
        System.out.println("Value of p^q : "+power2(p,q));

    }
}
