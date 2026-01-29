package Conditional_and_Loops.Switch_Case;

import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number for a weekday : ");
        int num = sc.nextInt();

        switch (num){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default :
                System.out.println("Invalid day number entered");
                // No need to add break below the default statement
                break;
        }

        // Enhanced code is given by :-
        switch (num) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day number entered");

            // No need to add break below the default statement
        }


        // For weekdays and weekends

        switch (num){
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Week-day");
                break;
            case 6 :
            case 7 :
                System.out.println("Week-end");
                break;
            default :
                System.out.println("Invalid day number entered");
        }

        // Enhanced code for this
        switch (num) {
            case 1, 2, 3, 4, 5 -> System.out.println("Week-day");
            case 6, 7 -> System.out.println("Week-end");
            default -> System.out.println("Invalid day number entered");
        }
    }
}
