package Methods_OR_Functions;
import java.util.*;
public class Global_Variable {
    static int x = 98;
     static String name = "Piyush Maurya";
    static void printX(){
        System.out.println(x); // prints 98
        int x = 76;
        System.out.println(x); // prints 76
    }
    static void printName(){
        System.out.println(name);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(x);
        printX();

        System.out.println(name);
        printName();
    }
}
