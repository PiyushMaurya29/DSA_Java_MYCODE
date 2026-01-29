package Methods_OR_Functions;
import java.util.*;
public class MathFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x : ");
        int x = sc.nextInt();
        System.out.print("Enter y : ");
        int y = sc.nextInt();

        System.out.println(Math.min(x,y));
        System.out.println(Math.max(x,y));
        System.out.println(Math.sqrt(x));
        System.out.println(Math.pow(x,y));
        System.out.println(Math.abs(x));   // Calculate absolute of x
    }
}
