package Sting_and_StringBuilder;

import java.util.Arrays;

public class Methods_Of_String {
    public static void main(String[] args) {

        String name = "Piyush Maurya";
        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf('M'));

        System.out.println("   THe   ".strip());

        String name2 = "Hello Ji How are you doing now days";

        System.out.println(Arrays.toString(name2.split(" ")));

    }
}
