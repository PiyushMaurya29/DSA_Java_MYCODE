package Methods_OR_Functions;
import java.lang.reflect.Array;
import java.util.*;
public class Function_Overloading {
    static void fun(int a){
        System.out.println("First One");
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println("Second One");
        System.out.println(name);
    }
    static void fun(int a , String name){
        System.out.println("Third One");
        System.out.println(a);
        System.out.println(name);
    }
    static void demo(int ...n){
        System.out.println(Arrays.toString(n));
    }
    static void demo(String ...s){
        System.out.println(Arrays.toString(s));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Two function with same name can be declared but if and only if
           the number of arguments should be different or type of argument
           should be different.
         */

        fun(67);
        fun("Shaurya Pratap");
        fun(89,"Shaurya Pratap Singh");

        demo(56,67,4,3,2,21);
        demo("Hey","Poke","Joke","Hook");
    }
}
