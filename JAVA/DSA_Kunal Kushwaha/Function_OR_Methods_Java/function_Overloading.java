package Function_OR_Methods_Java;

import java.util.Arrays;

public class function_Overloading {
    // Same name functions can exist but with different arguments
    static void fun(int a , int b){
        System.out.println("("+a+","+b+")");
    }
    static void fun(int a , int b , int c){
        System.out.println("("+a+","+b+","+c+")");
    }
    static void demo(String ...s){
        System.out.println(Arrays.toString(s));
    }
    static void demo(int ...i){
        System.out.println(Arrays.toString(i));
    }
    static void fun(String ...s){
        System.out.println(Arrays.toString(s));
    }
    public static void main(String[] args) {

        fun(11,99);
        fun(47,48,49);
        fun("Ajay","Joshi","Pankaj","Kapil","SexyBhai");

        demo(0,1,2,3,4,5,6,7,8,9);
        demo("shaurya","abhishek","jack","jones","marry");

    }
}
