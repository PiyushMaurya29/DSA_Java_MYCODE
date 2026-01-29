package Arrays;

import java.util.Arrays;

public class FuntionsInArray {
    static void printArray(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,34,55,66,11};

        int arr2[] = arr.clone(); //Copies whole array
        printArray(arr2);

        int arr3[] = Arrays.copyOf(arr,arr.length); //Pass by value copies till the second given value
        printArray(arr);
        arr3[0] = 100;
        printArray(arr3);

        int arr4[] = Arrays.copyOfRange(arr,0,3); //To(to) index is excluded
        printArray(arr4);

        Arrays.sort(arr); //Sorting of array happens
        printArray(arr);


    }
}
