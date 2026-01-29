package IF_ELSE;
import java.util.Scanner;
public class Greatestof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number : ");
        int num3 = sc.nextInt();

//        if(num1>num2 && num1>num3) System.out.println("First is Greatest");
//        else if(num2>num1 && num2>num3) System.out.println("Second is Greatest");
//        else System.out.println("Third is Greatest");
        if(num1>num2){
            if(num1>num3) System.out.println("First number is Greatest");
            else System.out.println("Third number is Greatest");
        }
        else if(num2>num1){
            if(num2>num3) System.out.println("Second number is Greatest");
            else System.out.println("Third number is Greatest");
        }
        else if (num3>num1){
            if(num3>num2) System.out.println("Third number is greatest");
            else System.out.println("Second number is Greatest");
        }
    }
}
