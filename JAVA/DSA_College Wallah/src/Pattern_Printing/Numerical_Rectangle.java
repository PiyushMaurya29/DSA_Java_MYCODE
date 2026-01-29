package Pattern_Printing;
import java.util.Scanner;
public class Numerical_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Question : Print 1 2 3 4 5 6 7
                            2 3 4 5 6 7 1
                            3 4 5 6 7 1 2
                            4 5 6 7 1 2 3
                            5 6 7 1 2 3 4
                            6 7 1 2 3 4 5
                            7 1 2 3 4 5 6
         */
        System.out.print("Enter number of rows : ");
        int r = sc.nextInt();

        for(int i=1 ; i<=r ; i++){
            for(int j=i ; j<=r ; j++){
                System.out.print(j);
            }
            for(int k=1 ; k<=i-1 ; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
