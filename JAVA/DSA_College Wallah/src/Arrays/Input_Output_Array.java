package Arrays;
import java.util.Scanner;
public class Input_Output_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+n+" elements of array : ");
        for (int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(n+" Elements of arrays are : ");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
