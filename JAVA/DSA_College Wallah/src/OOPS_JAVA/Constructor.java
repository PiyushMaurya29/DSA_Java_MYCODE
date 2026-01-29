package OOPS_JAVA;
import java.util.*;

public class Constructor {
    public static class stud{
        String name;
        int rNo;
        double percentage;
        // default constructor
        public stud(){

        }

        // Constructor
        // No need to give all the values
        public stud(String name , int rNo , double percentage){
            // To give same name to functions use this keyword with . operator
            this.name = name;
            this.rNo = 98;
            this.percentage = 87;
        }

    }
    static class collegeStudents{
        String name;
        int roll;
        collegeStudents(){
            System.out.println("Constructor is called ....");
        }
        collegeStudents(String name){
            this.name = name;
        }
        collegeStudents(int roll){
            this.roll = roll;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        stud s1 = new stud("Ram" , 14 , 100);
        System.out.println(s1.name);
        System.out.println(s1.rNo);
        System.out.println(s1.percentage);

        // If default constructor is not made then the initialization is not possible
        stud x = new stud();
        x.name = "Happy";
        x.rNo = 34;
        x.percentage = 87;
        System.out.println(x.name+" "+x.rNo+" "+x.percentage);


        // Class collegeStudents
        collegeStudents c1 = new collegeStudents();
        collegeStudents c2 = new collegeStudents("Shaurya");
        collegeStudents c3 = new collegeStudents(1698);

        System.out.println(c1.name);

    }
}
