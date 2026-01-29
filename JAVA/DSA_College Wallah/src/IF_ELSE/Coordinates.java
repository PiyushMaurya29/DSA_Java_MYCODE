package IF_ELSE;
import java.util.Scanner;
public class Coordinates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x-coordinate : ");
        int x = sc.nextInt();

        System.out.print("Enter y-coordinate : ");
        int y = sc.nextInt();

        if(x==0 && y==0) System.out.println("Point is origin");
        else if(x==0 && y!=0) System.out.println("Point lies on y-axis");
        else if(x!=0 && y==0) System.out.println("Point lies on x-axis");
        else System.out.println("Point neither lie on x-axis or y-axis");
    }
}
