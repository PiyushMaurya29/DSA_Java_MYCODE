package Pattern_Printing;

import java.util.Scanner;

public class Rhombus_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();

        for(int i=1 ; i<=n ; i++){        // row
            for(int j=1 ; j<=n-i ; j++){  // spaces
                System.out.print(" ");
            }
            for(int k=1 ; k<=i ; k++){    // column
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=1 ; i<=n-1 ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(" ");
            }
            for(int k=1 ; k<=n-i ; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
