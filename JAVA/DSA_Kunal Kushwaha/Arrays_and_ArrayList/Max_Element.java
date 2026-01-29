package Arrays_and_ArrayList;

import java.util.Scanner;

public class Max_Element {
    static int findMax(int arr[]){
        int max = Integer.MIN_VALUE;

        for(int i=0 ; i<arr.length ; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {23,11,45,67,87,32,34,99,72};


        System.out.println("Maximum element of array : "+findMax(arr));

    }
}
