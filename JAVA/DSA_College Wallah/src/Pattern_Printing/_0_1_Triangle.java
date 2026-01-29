package Pattern_Printing;
import java.util.*;
public class _0_1_Triangle {
    static void printO1Triangle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines : ");
        int n = sc.nextInt();

        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
                if((i+j)%2==0) System.out.print(1+" ");
                else System.out.print(0+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printO1Triangle();
    }
}
