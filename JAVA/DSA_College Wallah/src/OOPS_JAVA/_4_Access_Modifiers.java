package OOPS_JAVA;
import java.util.*;
public class _4_Access_Modifiers {
    public static class Student{
        String name;
        private int rNO;
        double percentage;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
             Access Modifiers (Specifiers)
             # Public -> All packages
             # Private -> Same class
             # Default -> Same package
         */
        /* Access Modifier | within class | within package | outside package by subclass only  | outside package
           # Private       |       Y      |      N         |              N                    |       N
           # Default       |       Y      |      Y         |              N                    |       N
           # Protected     |       Y      |      Y         |              Y                    |       N
           # Public        |       Y      |      Y         |              Y                    |       N
         */

        Student s2 = new Student();
        s2.name = "Piyush";
//        s2.rNo = 45;   //Cannot be accessed due to private access modifier
        s2.percentage = 93;

    }
}
