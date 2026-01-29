package Arrays_and_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter elements of array : ");
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        // Printing array :-
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        // 2nd way to print array
        for(int num : arr){
            // Here num represents element of the array
            System.out.print(num+" ");
        }
        System.out.println();

        // 3rd way to print array :-
        System.out.println(Arrays.toString(arr));

        // Taking string as a input
        String str[] = new String[4];
        for(int i=0 ; i<str.length ; i++){
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));

        // modify
        str[2] = "Sexy";
        System.out.println(Arrays.toString(str));
    }
}
