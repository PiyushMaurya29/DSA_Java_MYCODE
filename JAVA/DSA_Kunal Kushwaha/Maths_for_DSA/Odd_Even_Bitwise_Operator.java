package Maths_for_DSA;

public class Odd_Even_Bitwise_Operator {
    static boolean isOdd(int n){
        return (n & 1) == 1;
    }
    public static void main(String[] args) {

        /*
            Doing a number and with 1
            * If gives 1 means number is odd
            * If doesn't gives 1 means number is even
         */
        int n = 67;
        System.out.println(isOdd(n));

    }
}
