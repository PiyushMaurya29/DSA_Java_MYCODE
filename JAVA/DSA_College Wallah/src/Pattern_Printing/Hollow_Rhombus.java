package Pattern_Printing;
import java.util.*;
public class Hollow_Rhombus {
    static void print_Hollow_Rhombus(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines : ");
        int n = sc.nextInt();

        for(int i=1 ; i<=n ; i++){

            // Spaces
            for(int j=1 ; j<=(n-i) ; j++){
                System.out.print(" ");
            }
            // Hollow Rectangle
            for(int k=1 ; k<=n ; k++){
                if(i==1 || i==n || k==1 || k==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        print_Hollow_Rhombus();
    }
}
