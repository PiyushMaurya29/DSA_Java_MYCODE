package TimeAndSpaceComplexity;
import java.util.*;
public class NestedLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n : ");

        /*
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<i ; j++){
                // some constant (K) work will be done
                // is done in this loop
            }
        }
            i=0   0X
            i=1   1X   j=0 to 0   k = k
            i=2   2X   j=0 to 1   k = 2k
            i=3   3X   j=0 to 2   k = 3k
            i=4   4X   j=0 to 3   k = 4k
            i=5   5X   j=0 to 4   k = 5k
            ..    ..
            ..    ..
            i=n-1 n-1

            Total work = k + 2k + 3k + 4k ...... (n-1)k
                       = kn(n-1)/2

            Therefore TimeComplexity = O(n^2)
         */

    }
}
