package Recursion_And_BackTracking;

public class _1_Print_INC_DEC {
    static void printIncreasing(int n){
        if(n==0) return;
        printIncreasing(n-1);
        System.out.print(n+" ");
    }
    static void printDecreasing(int n){
        if(n==0) return;
        System.out.print(n+" ");
        printDecreasing(n-1);
    }
    static void printDecInc(int n){
        if(n==0) return;
        System.out.print(n+" ");
        printDecInc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {

        printIncreasing(10);
        System.out.println();
        printDecreasing(10);
        System.out.println();
        printDecInc(10);

    }
}
