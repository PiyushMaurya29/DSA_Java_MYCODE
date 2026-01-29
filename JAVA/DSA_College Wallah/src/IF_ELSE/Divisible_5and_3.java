package IF_ELSE;
import java.util.Scanner;
public class Divisible_5and_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

//        if(num%5==0 && num%3==0)
//            System.out.println("Number "+num+" is divisible.");
//        else
//            System.out.println("Number "+num+" is not divisible.");
        if(num%3==0){
            if(num%5==0) System.out.println("Divisible by 3 and 5.");
            else System.out.println("Not divisible by 3 and 5.");
        }
        else System.out.println("Not divisible by 3 and 5.");
    }
}
