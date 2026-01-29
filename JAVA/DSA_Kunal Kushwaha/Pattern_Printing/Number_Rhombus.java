package Pattern_Printing;

import java.util.Scanner;

public class Number_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();

        for(int i = 1 ; i < n ; i++){
            for(int z=1 ; z<=n-i ; z++){
                System.out.print("  ");
            }
            for(int j=i ; j >= 1 ; j--){
                System.out.print(j+" ");
            }
            for(int k=2 ; k<=i ; k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }

    }
}
