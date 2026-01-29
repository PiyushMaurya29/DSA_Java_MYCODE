package Sting_and_StringBuilder;

public class Comparison_Of_String {
    public static void main(String[] args) {

        String a = "kunal";
        String b = "kunal";

        System.out.println(a == b);
        System.out.println(a.equals(b));
        // Checks if reference variables are pointing to same object

        // Creating different object of same value
        String name1 = new String("kunal");
        String name2 = new String("kunal");
        // Creating these value outside the pool but in heap
        System.out.println(name1 == name2);  // gives false because both are different objects

        // When you only needs to check value , use .equal method
        System.out.println(a.equals(name1));
        System.out.println(name1.equals(name2));

        // If we want character at any index use str.charAt(index)

        System.out.println(name1.charAt(1));

    }
}
