package Pattern_Printing;
import java.util.Scanner;
public class Rectangular_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Question : Print a star pattern of rectangle
        System.out.print("Enter number of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int c = sc.nextInt();

        for(int i=1 ; i<=r ; i++){
            for(int j=1 ; j<=c ; j++) {
                System.out.print("*");
            }
            System.out.println(); //For next line
        }
    }
}
