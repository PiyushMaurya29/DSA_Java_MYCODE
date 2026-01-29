package Basics;
import java.util.Scanner;
public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=2 , j=3 , k , l;
        double a , b ;
        k = i / j * j;
        l = j / i * i;
        a = i / j * j;
        b = j / i * i;
        System.out.println(k+" "+l+" "+a+" "+b);
    }
}
