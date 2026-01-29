package BitManipulation;
import java.util.*;
public class Binary_XOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Binary XOR(^)
           Rules  0 ^ 0 = 0
                  0 ^ 1 = 1
                  1 ^ 0 = 1
                  1 ^ 1 = 0
            Example : 5 ^ 6
                  5 = 0 1 0 1
                  6 = 0 1 1 0
                  3 = 0 0 1 1
         */

        System.out.println(5 ^ 6);
    }
}
