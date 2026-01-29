package Arrays;
import java.util.Scanner;
public class CloningArray {
    static void printArray(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+n+" elements : ");
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array : ");
        printArray(arr);


        int arr2[] = arr.clone(); //It makes deep copies element of Array by Pass by Value not Pass by Reference.
        System.out.println("Copied Array : ");
        printArray(arr2);

        //arr2[0] = 444; //Changing elements in arr2 also change in arr if we do not use arr.clone.

    }
}
