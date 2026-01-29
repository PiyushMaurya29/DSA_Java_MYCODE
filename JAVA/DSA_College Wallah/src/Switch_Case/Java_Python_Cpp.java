package Switch_Case;
import java.util.Scanner;
public class Java_Python_Cpp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int course = 2;
        switch (course) {
            case 1:
                System.out.println("Java");
            case 2:
                System.out.println("Python");
            default:
                System.out.println("cpp");
        }
    }
}
