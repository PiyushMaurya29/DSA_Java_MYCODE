package Pattern_Printing;

import java.util.Scanner;

public class Inverted_Star_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int row = sc.nextInt();

        for(int i=1 ; i<=row ; i++){
            for(int j=1 ; j<=row-i+1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
