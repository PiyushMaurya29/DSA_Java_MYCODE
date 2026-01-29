package IF_ELSE;
import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age of Person : ");
        int age = sc.nextInt();

        if(age<=12) System.out.println("Child");
        else if(age>12 && age<18) System.out.println("Teenager");
        else if(age>=18) System.out.println("Adult");
    }
}
