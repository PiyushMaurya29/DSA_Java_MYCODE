package Arrays;

class ArrayExample{
    void demoArray(){
        int ages[] = new int[3];
        double weight[] = new double[3];
        String names[] = {"Rahul","Piyush","Shaurya"};
        ages[0] = 34;
        ages[1] = 12;
        ages[2] = 45;


        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
    }
}
public class Array_basics_1D{
    public static void main(String[] args) {

        //Array : List of elements of same type placed in a
        //        contiguous memory location
        ArrayExample obj = new ArrayExample();
        obj.demoArray();
    }
}
