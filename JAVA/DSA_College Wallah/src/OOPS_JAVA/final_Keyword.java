package OOPS_JAVA;
import java.util.*;
public class final_Keyword {
    public static class studs{
        String name;
        int rNo;
        double percent;
        // It is not changeable if final keyword is used
        final String schoolName = "NGDPS";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        studs s = new studs();
        s.name = "Rohan";
        s.percent = 87;
        s.rNo = 98;
//        Value of school name cannot be changed as it is fixed by "final" keyword
//        s.schoolName = "SBV";

    }
}
