package IF_ELSE;
import java.util.Scanner;
public class SidesofTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first side of Triangle : ");
        int a = sc.nextInt();
        System.out.print("Enter second side of Triangle : ");
        int b = sc.nextInt();
        System.out.print("Enter third side of Triangle : ");
        int c = sc.nextInt();

        if((a+b)>c && (b+c)>a && (c+a)>b)
            System.out.println("The Triangle is Possible.");
        else
            System.out.println("The Triangle is not Possible");
    }
}
