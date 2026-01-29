package BitManipulation;
import java.util.*;
public class BinaryAND {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Binary AND(&)
           Rules 0 & 0 = 0
                 0 & 1 = 0
                 1 & 0 = 0
                 1 & 1 = 1
           Example  5 & 6
                    5 = 0 1 0 1
                  & 6 = 0 1 1 0
                    4  = 0 1 0 0
         */

        System.out.println(5 & 6);
    }
}
