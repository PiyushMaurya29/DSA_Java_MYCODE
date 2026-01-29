package Function_OR_Methods_Java;

import java.util.Scanner;

public class Greeting {
    static String greet(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name : ");
        String name = sc.nextLine();
        String greeting = "Hello "+name;
        return greeting;
    }
    public static void main(String[] args) {

        System.out.println(greet());

    }
}
