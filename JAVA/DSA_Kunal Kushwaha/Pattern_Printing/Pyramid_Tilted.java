package Pattern_Printing;

import java.util.Scanner;

public class Pyramid_Tilted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();

        for(int i = 0 ; i < 2 * n ; i++){
            int totalColInRow =  i > n ? 2 * n - i : i;
            for(int j=0 ; j<totalColInRow ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
