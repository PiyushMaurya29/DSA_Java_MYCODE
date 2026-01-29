package Pattern_Printing;
import java.util.*;
public class Solid_Rhombus {
    static void print_Solid_Rhombus(){
        Scanner sc = new Scanner (System.in);
        System.out.print("ENTER Number of lines : ");
        int n = sc.nextInt();

        for(int i=1 ; i<=n ; i++){
            // For Spaces
            for(int j=1 ; j<=n-i ; j++){
                System.out.print(" ");
            }
            // For Stars
            for(int k=1 ; k<=n ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        print_Solid_Rhombus();
    }
}
