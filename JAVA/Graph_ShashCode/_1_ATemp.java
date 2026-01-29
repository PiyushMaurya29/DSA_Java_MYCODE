import java.util.*;

public class _1_ATemp {
    public static int solve(int n, int k){
        int AIndex = n;
        int BIndex = 1;
        while(k >= 1){
            if(k==1) return BIndex;
            if(AIndex==1) AIndex = n;
            else AIndex--;
            if(BIndex==n) BIndex = 1;
            else BIndex++;
            if(AIndex==BIndex){
                BIndex = BIndex%n + 1;
            }
            k--;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(solve(2, 1));
        System.out.println(solve(2, 2));
        System.out.println(solve(3, 1));
        System.out.println(solve(3, 2));
        System.out.println(solve(3, 3));
        System.out.println(solve(5, 5));
        System.out.println(solve(69, 1337));
    }
}
