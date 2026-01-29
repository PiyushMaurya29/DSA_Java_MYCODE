package Operators;
import java.util.Scanner;
public class Bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = 9 , q = 10;
        System.out.println(p | q);  //9 = 1001 =>2^3X1 + 2^0X1
                                    //10 = 1010 =>2^3X1 + 2^2X1
                                    //11  = 1011 => 2^3X1 + 2^1X1 + 2^0X1

        System.out.println(p & q);    //9 = 1001
                                      //10 = 1010
                                      //8 = 1000 => 2^3X1

        System.out.println(p ^ q);    //9 = 1001
                                      //10 = 1010
                                      //3  =  0011

        System.out.println(p << 1);   //9 = 1001
                                      //18 = 10010

        System.out.println(p << 2);    //9 = 1001
                                       //36  = 100100

        System.out.println(q << 1);     //10 = 1010
                                        //20  = 10100

        System.out.println(q >> 2);     //10 = 1010
                                        //2  = 10

        System.out.println(~p);          //9 = 1001
                                         //6  = 0110

        System.out.println(~q);          //10 = 1010
                                         //5   = 0101
    }
}
