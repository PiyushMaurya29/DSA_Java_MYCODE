package IF_ELSE;
import java.util.Scanner;
public class PointOnLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //This Program is used to check points lie on Straight or Not.
        System.out.print("Enter x1 : ");
        int x1 = sc.nextInt();
        System.out.print("Enter y1 : ");
        int y1 = sc.nextInt();
        System.out.print("Enter x2 : ");
        int x2 = sc.nextInt();
        System.out.print("Enter y2 : ");
        int y2 = sc.nextInt();
        System.out.print("Enter x3 : ");
        int x3 = sc.nextInt();
        System.out.print("Enter y3 : ");
        int y3 = sc.nextInt();

        int m1 = (y2-y1)/(x2-x1);
        int m2 = (y3-y2)/(x3-x2);

        if(m1==m2) System.out.println("Point lie on straight line.");
        else System.out.println("Points does not lie on straight line.");
    }
}
