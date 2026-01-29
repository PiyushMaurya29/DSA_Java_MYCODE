package Sting_and_StringBuilder;

public class Pretty_Printing {
    public static void main(String[] args) {

        // %f %d %s these are called PlaceHolders

        float a = 498.2452f;
        // we have written printf not println because printf means formatted string
        System.out.printf("Formatted number is %.2f",a); // .2 means , round off upto 2 decimal places
        System.out.println();
        System.out.printf("Pie : %.3f",Math.PI);

        System.out.println();
        System.out.printf("Hello my name is %s and I am %s","Maurya","Sexy");
    }
}
