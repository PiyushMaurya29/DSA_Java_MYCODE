package Methods_OR_Functions;
import java.util.*;
public class swapValues {
    static void changeC(int c){
        c = 400;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Swap -> Values exchange
        int a = 5;
        int b = 10;

        // Swapping
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = "+a+"\nb = "+b);

        // Swapping will not take place by methods/function because integer is call by value not reference
        // Copies of integer created in function but changes does not take place in actual
        // Java mainly works on call by value not call by reference
        int c = 100;
        changeC(c);  // Change in method/function does not reflect in main function
        System.out.println(c);
    }
}
