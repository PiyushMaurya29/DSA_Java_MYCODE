package OOPS_JAVA;

public class Getters_and_Setters {
    public static void main(String[] args) {

        /*
           Getters and Setters are used so that we atleat access the private
           things if we cannot change to it.
         */

        _3_StudentInSamePackage s = new _3_StudentInSamePackage();
        // Printing private roll number using get
        System.out.println(s.getrNo());

        // Setting private roll number using set
        s.setrNO(45);
        System.out.println(s.getrNo());
    }
}
