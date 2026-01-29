package Recursion.Basic_Recursion;

public class Message_Example {
    static void message5(){
        System.out.println("Message 5");
    }
    static void message4(){
        System.out.println("Message 4");
        message5();
    }
    static void message3(){
        System.out.println("Message 3");
        message4();
    }
    static void message2(){
        System.out.println("Message 2");
        message3();
    }
    static void message1(){
        System.out.println("Message 1");
        message2();
    }
    public static void main(String[] args) {
        // Recursion : Function calling itself
        /*
            Why recursion :
            * It helps us in solving bigger / complex problems in a simpler way or smaller problems
            * You can convert recursion solution into iteration and vice versa (Loops)

            * Space complexity is not constant because of recursive calls
         */

        // While the function is not finished executing it wil remain in stack memory
        // Base Condition in Recursion : Condition where our recursion will stop making new calls
        // Each call of a function takes a separate stack memory
        /*
           No base condition means : Function call will keep happening and stack memory is filled again
           and again this leads to stack overflow
         */


        message1();

    }
}
