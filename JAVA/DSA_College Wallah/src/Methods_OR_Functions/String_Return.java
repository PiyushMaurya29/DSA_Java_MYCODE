package Methods_OR_Functions;
import java.util.*;
public class String_Return {
    static String myGreet(String name){
        String message = "Hello Mr/Mrs "+name;
        return message;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        String personalized = myGreet(name);
        System.out.println(personalized);

    }
}
