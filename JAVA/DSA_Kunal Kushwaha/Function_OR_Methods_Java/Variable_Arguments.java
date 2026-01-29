package Function_OR_Methods_Java;

import java.util.Arrays;
import java.util.Scanner;

public class Variable_Arguments {
    // Arguments will be taken as array of integers
    static void funInt(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void funStr(String ...s){
        System.out.println(Arrays.toString(s));
    }
    static void multipleArgs(int a , int b , int c , int ...i){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(Arrays.toString(i));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        funInt(3,34,556,66,11,121,98,976);

        funStr("Piyush","Shaurya","Rahul","Jatin","Shubham");

        multipleArgs(11,22,33,1,2,3,4,5,6,7,8,9);
    }
}
