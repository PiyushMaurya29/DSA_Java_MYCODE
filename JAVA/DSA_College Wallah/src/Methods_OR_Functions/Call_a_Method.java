package Methods_OR_Functions;
import java.util.Scanner;
public class Call_a_Method {
    public class Main {
        static void welcome() {
            System.out.println("Welcome to Coding World");
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            /* Function / Method is a block of code which performs a particular task
               It can be reuse any number of times
             */

            /* Syntax
               Body
               return Statement;
             */
            welcome();
        }
    }
}
