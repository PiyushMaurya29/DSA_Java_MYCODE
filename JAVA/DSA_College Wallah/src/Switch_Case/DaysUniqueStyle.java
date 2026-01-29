package Switch_Case;
import java.util.*;
public class DaysUniqueStyle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        switch (num){
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Weekday");
                break;
            case 6 :
            case 7 :
                System.out.println("Weekend");
                break;
        }

        // This both are same with different syntax
        // This will get by pressing alt + enter
        switch (num) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }
    }
}
