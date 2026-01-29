package TimeAndSpaceComplexity;
import java.util.Scanner;

import static java.lang.Math.pow;

public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Find sum of all elements from 1 to n.
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        int ans1 = 0;
        for(int i=0 ; i<=n ; i++){
            ans1 += i;
        }
        System.out.println("Sum : "+ans1);

        int ans2 = (n*(n+1))/2;
        System.out.println("Sum : "+ans2);
    }
}
