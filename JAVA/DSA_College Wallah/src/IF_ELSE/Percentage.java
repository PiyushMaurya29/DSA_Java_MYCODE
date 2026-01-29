package IF_ELSE;
import java.util.Scanner;
public class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Percentage of Student : ");
        int Percentage = sc.nextInt();
        if(Percentage>90) System.out.println("Excellent");
        else if(Percentage>80) System.out.println("Very Good");
        else if(Percentage>70) System.out.println("Good");
        else if(Percentage>60) System.out.println("Can do better");
        else if(Percentage>50) System.out.println("Average");
        else if(Percentage>40) System.out.println("Below Average");
        else if(Percentage<=40) System.out.println("Fail");
    }
}
