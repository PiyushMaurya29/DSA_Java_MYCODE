package OOPS_JAVA;
import java.util.*;
public class Classes_Creation_Students {
    // creating a new data type with multiple attributes
    // Always create a class starting with capital letter conventionally
    public static class Car{
        String name;
        String type;
        int price;
    }
    public static void fun(_3_StudentInSamePackage s1){
        System.out.println(s1.name);
        //System.out.println(s1.rNO);
        System.out.println(s1.percentage);
    }
    public static void main(String[] args) {
        // Scanner is also a class
        Scanner sc = new Scanner(System.in);
        // Classes are used when we have to declare user defined data type of multiple attributes
        /*
            # Classes are blueprint
            # Objects are real life entities
            # Objects are instances of class
         */

        _3_StudentInSamePackage s1 = new _3_StudentInSamePackage();
        // All are the objects of class student
        s1.name = "Shaurya";
 //       s1.rNO = 96;
        s1.percentage = 87;
        System.out.println(s1.name);
 //       System.out.println(s1.rNO + 99);

        // Passing class to function
        fun(s1);

        Car c1 = new Car();
        c1.name = "Alto";
        c1.price = 50000;
        c1.type = "Hatchback";

    }
}
