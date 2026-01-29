package Pattern_Printing;
import java.util.Scanner;
public class Number_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int c = sc.nextInt();


        for(int i=1 ; i<=r ; i++){
            int num = 1 ;
            for(int j=1 ; j<=c ; j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}
