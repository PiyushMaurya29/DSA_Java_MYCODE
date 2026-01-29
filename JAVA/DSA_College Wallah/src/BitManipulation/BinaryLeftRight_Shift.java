package BitManipulation;
import java.util.*;
public class BinaryLeftRight_Shift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Binary left shift (<<)
           a << b = a * pow(2,b)
           Example : 5 << 2 means 5 in binary left shifted by 2
               5 = 0 1 0 1
          5 << 2 = 1 0 1 0 0  (20)
         */
        System.out.println(5 << 2);  // 20

        /* Binary Right Shift (>>)
        a >> b = a / pow(2,b)
        Example : 5 >> 2 means in binary right shifted by 2
                5 = 0 1 0 1
           5 >> 2 =     0 1 (1)
         */

        System.out.println(5 >> 2); // 1
        System.out.println(6 >> 1); // 3
    }
}
