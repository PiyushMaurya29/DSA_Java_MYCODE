package BitManipulation;
import java.util.*;
public class Binary_OR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Binary OR(|)
           Rules 0 | 0 = 0
                 0 | 1 = 1
                 1 | 0 = 1
                 1 | 1 = 1
             Example : 5 | 6
                   5 = 0 1 0 1
                 | 6 = 0 1 1 0
                   7  = 0 1 1 1
         */

        System.out.println(5 | 6);
    }
}
