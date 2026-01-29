package Pattern_Printing;

import java.util.Scanner;

public class star_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();

        for(int row=1 ; row<=n ; row++){  // Number of rows
            for(int col=1 ; col<=row ; col++){ // Number of columns
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
