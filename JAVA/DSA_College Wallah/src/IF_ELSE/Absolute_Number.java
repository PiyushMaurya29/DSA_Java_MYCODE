package IF_ELSE;
import java.util.Scanner;
public class Absolute_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer : ");
        int num = sc.nextInt();

        if(num >= 0){
            System.out.println("The absolute value of number is "+num);
        }
        else {
            num = (-1) * num;
            System.out.println("The absolute value of number is "+num);
        }


    }
}
