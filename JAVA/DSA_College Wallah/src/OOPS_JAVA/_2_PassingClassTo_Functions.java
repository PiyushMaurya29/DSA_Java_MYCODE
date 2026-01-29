package OOPS_JAVA;
import java.util.*;
public class _2_PassingClassTo_Functions {
    public static class Student{
        String name;
        int rNo;
        double percentage;
    }
    public static void fun(Student s1){
        s1.rNo = 78;
        s1.name = "Priyanshu";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();

        s1.name = "Aryan";
        s1.rNo = 99;
        s1.percentage = 88;
        System.out.println(s1.rNo);
        System.out.println(s1.name);

        // Passing class in function work as pass by reference
        // Changing value in function reflects in main function
        fun(s1);
        System.out.println(s1.rNo);
        System.out.println(s1.name);



    }
}
