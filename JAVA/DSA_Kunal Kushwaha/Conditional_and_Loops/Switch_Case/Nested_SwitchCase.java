package Conditional_and_Loops.Switch_Case;

import java.util.Scanner;

public class Nested_SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Emp-ID : ");
        int empID = sc.nextInt();
        System.out.print("Enter Emp-Department : ");
        String department = sc.next();

        switch (empID){
            case 1 :
                System.out.println("Shaurya Pratap");
                break;
            case 2 :
                System.out.println("Sumit Kushwaha");
                break;
            case 3 :
                System.out.println("Emp Number 3");
                switch (department){
                    case "IT" :
                        System.out.println("IT department");
                        break;
                    case "Management" :
                        System.out.println("Management department");
                        break;
                    default :
                        System.out.println("No department entered");
                }
                break;
            default :
                System.out.println("Enter correct Emp-ID");
        }

        // Enhanced version of the code is given by :-

        switch (empID) {
            case 1 -> System.out.println("Shaurya Pratap");
            case 2 -> System.out.println("Sumit Kushwaha");
            case 3 -> {
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter correct Emp-ID");
        }

    }
}
