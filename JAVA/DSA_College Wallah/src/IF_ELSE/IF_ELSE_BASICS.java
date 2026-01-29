package IF_ELSE;
import java.util.*;
public class IF_ELSE_BASICS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
           Syntax of is statement :
           if (boolean expression  T or F){
               // body
               } else {
               // do this
               }
         */
        int salary = 25400;
        if(salary > 10000){
            salary += 2000;
        } else if (salary > 2000) {
            salary += 3000;
        } else {
            salary += 1000;
        }

        System.out.println("New Salary : "+salary);
    }
}
