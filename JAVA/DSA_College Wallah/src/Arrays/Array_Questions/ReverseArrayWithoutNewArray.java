package Arrays.Array_Questions;
import java.util.Scanner;
public class ReverseArrayWithoutNewArray {
    static void printArray(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void swapInArray(int arr[] , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverseWithoutNewArray(int arr[]){
        int i=0 , j=arr.length-1;
        while (i<j){
            swapInArray(arr,i,j);
            i++;
            j--;
        }
    }
    public static void reverseArray(int arr[]){
        int n = arr.length;
        int i=0 , j=n-1;
        while (j>i){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter elements in array : ");
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        reverseWithoutNewArray(arr);
        printArray(arr);
    }
}
