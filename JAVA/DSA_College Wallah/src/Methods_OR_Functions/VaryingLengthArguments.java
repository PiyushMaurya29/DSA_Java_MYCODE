package Methods_OR_Functions;
import java.util.*;
public class VaryingLengthArguments {
    static void fun(int ...v){
        // ...v is taken as arrays of integer
        System.out.println(Arrays.toString(v));
    }
    // Variable Length arguments should always come at last
    static void multiples(int a , int b , String ...v){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // This method of passing many parameters called variable_Length_Arguments
        fun(454,6,78,32,11,23,45);

        multiples(29 , 10 , "Hello" , "Hey" , "Piyush" , "Maurya");
    }
}
