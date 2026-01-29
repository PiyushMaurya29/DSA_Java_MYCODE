package Pattern_Printing;

import java.util.Scanner;

public class NumberBox_Into_NumberBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = sc.nextInt();

        n = 2 * n;
        for(int row=0 ; row<=n ; row++){
            for(int col=0 ; col<=n ; col++){
                int atEveryIndex = Math.min(Math.min(row,col),Math.min(n-row , n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
}
