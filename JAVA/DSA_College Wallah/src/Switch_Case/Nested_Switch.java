package Switch_Case;
import java.util.*;
public class Nested_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee ID : ");
        int empID = sc.nextInt();
        System.out.print("Enter department : ");
        String department = sc.nextLine();

        switch (empID){
            case 1 :
                System.out.println("Kunal Kushwaha");
                break;
            case 2 :
                System.out.println("Shaurya Pratap");
                break;
            case 3 :
                System.out.println("Emp Number 3 : ");
               switch (department){
                   case "IT" :
                       System.out.println("IT Department");
                       break;
                   case "Management" :
                       System.out.println("Management Department");
                       break;
                   default :
                       System.out.println("No department entered.");
               }
               break;
            default :
                System.out.println("Enter correct Employee ID");
        }
    }
}
