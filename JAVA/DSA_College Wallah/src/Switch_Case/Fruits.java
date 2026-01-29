package Switch_Case;
import java.util.*;
public class Fruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER Fruit Name : ");
        String fruit = sc.nextLine();

        switch (fruit){
            case "Mango" :
                System.out.println("King of fruits.");
                break;
            case "Apple" :
                System.out.println("A Sweet red fruit.");
                break;
            case "Orange" :
                System.out.println("Round fruit.");
                break;
            case "Grapes" :
                System.out.println("Juicy fruit.");
                break;
            case "Banana" :
                System.out.println("A long yellow fruit.");
                break;
            default :
                System.out.println("Please ENTER a valid fruit name.");
        }

        // This will get by pressing alt + enter
        // This is more clean than the upper one
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits.");
            case "Apple" -> System.out.println("A Sweet red fruit.");
            case "Orange" -> System.out.println("Round fruit.");
            case "Grapes" -> System.out.println("Juicy fruit.");
            case "Banana" -> System.out.println("A long yellow fruit.");
            default -> System.out.println("Please ENTER a valid fruit name.");
        }
    }
}
