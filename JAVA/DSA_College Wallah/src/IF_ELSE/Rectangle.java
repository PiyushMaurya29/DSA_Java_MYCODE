package IF_ELSE;
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Rectangle : ");
        double length = sc.nextDouble();
        System.out.print("Enter breath of Rectangle : ");
        double breadth = sc.nextDouble();

        double area = length * breadth;
        double perimeter = 2*(length+breadth);

        if(area==perimeter)
            System.out.println("Area and Perimeter are equal");
        else if(area>perimeter)
            System.out.println("Area of Rectangle is greater");
        else
            System.out.println("Perimeter of Rectangle is greater");
    }
}
