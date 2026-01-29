package OOPS_JAVA;
import java.util.*;
public class static_Keyword {
    public static class studes{
        String name;
        int age;
        double marks;
        // by initializing using keyword static it will update for each excess
        // whenever it will be excess studes
        private static int numberOfStudents;

        // making constructor
        public studes(String name , int age , double marks){
            this.name = name;
            this.age = age;
            this.marks = marks;
            numberOfStudents++;
        }
        public static int getNumberOfStudents(){
            return numberOfStudents;
        }
        public studes(){

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(studes.numberOfStudents);

        // If we do not use static then the numberOfStudents will not be updated
        studes s1 = new studes("Ram" , 23 , 98);
       // System.out.println(s1.numberOfStudents);    // Print 1
        System.out.println(s1.getNumberOfStudents());
        studes s2 = new studes("Raghav" , 30 , 100);
       // System.out.println(s2.numberOfStudents);    // Print 2
        System.out.println(s2.getNumberOfStudents());
        studes s3 = new studes("Nand" , 31 , 99);
       // System.out.println(s3.numberOfStudents);    // Prints 3
        System.out.println(s3.getNumberOfStudents());

        System.out.println(studes.numberOfStudents);
        // If all the 3 print statements written in last then it will print 3 , 3 , 3 in the last

        // It is changing its value being static so change this to private static
        studes.numberOfStudents = 100;
        System.out.println(studes.numberOfStudents);
    }
}
