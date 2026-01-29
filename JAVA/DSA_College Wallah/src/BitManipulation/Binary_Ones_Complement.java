package BitManipulation;
import java.util.*;
public class Binary_Ones_Complement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Binary One's Complement (Or NOT)
           Operations ~0 = 1
                      ~1 = 0

           Example 5 = 0 1 0 1
                  ~5 =   0 1 0 = 2
           If Most Significant Bit is zero means we are talking about Positive(+ve) Number
           If Most Significant Bit is one means we are talking about Negative(-ve) Number
         */
        /* Least Significant Bit  (RightMostBit)
           Most Significant Bit  (LeftMostBit)
         */

        System.out.println(~5); // But it prints -6 instead of printing 2
        System.out.println(~0);
    }
}
