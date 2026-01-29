package IF_ELSE;
import java.util.Scanner;
import java.lang.String;
public class Ternary_Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();


        String ans = (num%2==0) ? "Even" : "Odd";
        System.out.println(ans);

    }
}
