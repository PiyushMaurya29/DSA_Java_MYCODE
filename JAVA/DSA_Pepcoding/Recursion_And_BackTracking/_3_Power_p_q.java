package Recursion_And_BackTracking;

public class _3_Power_p_q {

    static int power1(int x, int n){
        if(n==0) return 1;
        int xnm1 = power1(x, n-1);
        int xn = x * xnm1;
        return xn;
    }
    static int power2(int x, int n){
        if(n==0) return 1;
        int xpnb2 = power2(x, n/2);
        int xn = xpnb2 * xpnb2;
        if(n%2==1){ // If n is odd
            xn = x * xn;
        }
        return xn;
    }
    public static void main(String[] args) {

        System.out.println(power1(2, 10));
        System.out.println(power2(2, 10));
    }
}
