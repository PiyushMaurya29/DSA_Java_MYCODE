package Conditional_and_Loops.Switch_Case;

import java.util.Scanner;

public class Fruit_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter fruit name : ");
        String fruit = sc.next();

        // .equal checks the value of String not the reference of object
        // == checks the reference of the object

//        if(fruit.equals("mango")){
//            System.out.println("King of fruits");
//        }
//        if(fruit.equals("apple")){
//            System.out.println("Doctors fruit");
//        }

        switch (fruit){
            case "mango" :
                System.out.println("King of fruits");
                break;
            case "apple" :
                System.out.println("Doctors fruit");
                break;
                // If we don't put break all below statement will run
            case "orange" :
                System.out.println("Round juicy fruit");
                break;
            case "banana" :
                System.out.println("Long and soft fruit");
                break;
            default :
                System.out.println("Please enter valid fruit name");
        }

        // Enhanced version of switch statement given below :-

        switch (fruit) {
            case "mango" -> System.out.println("King of fruits");
            case "apple" -> System.out.println("Doctors fruit");

            // If we don't put break all below statement will run
            case "orange" -> System.out.println("Round juicy fruit");
            case "banana" -> System.out.println("Long and soft fruit");
            default -> System.out.println("Please enter valid fruit name");
        }

    }
}
