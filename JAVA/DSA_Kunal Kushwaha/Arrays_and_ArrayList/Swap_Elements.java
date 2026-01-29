package Arrays_and_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Swap_Elements {
    static void swap(int arr[] , int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {23,45,67,11,36,99};

        System.out.println(Arrays.toString(arr));
        swap(arr,1,4);
        System.out.println(Arrays.toString(arr));

    }
}
