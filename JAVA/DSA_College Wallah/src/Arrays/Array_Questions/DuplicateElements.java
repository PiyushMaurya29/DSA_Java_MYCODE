package Arrays.Array_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElements {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");

        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Duplicate elements in the array: ");

        for(int i = 0; i < n-1; i++) {
            if(arr[i] == arr[i+1]) {
                System.out.println(arr[i]);
            }
        }
    }
}
