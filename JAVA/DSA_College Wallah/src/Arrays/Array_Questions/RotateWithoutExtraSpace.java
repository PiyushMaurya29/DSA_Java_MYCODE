package Arrays.Array_Questions;
import java.util.Scanner;
public class RotateWithoutExtraSpace {
    static void printArray(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int arr[] , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverse(int arr[] , int i , int j){  // i -> start , j -> end
        while (i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static void rotateInPlace(int arr[] , int k){
        int n = arr.length;
        k = k % n;
        /* reverse both parts of array then reverse the whole array
           Example : 1 2 : 3 4 5 6 7
                     2 1 : 7 6 5 4 3
               if k = 5
              Rotated : 3 4 5 6 7 1 2
         */
        reverse(arr,0,n-k-1);
        reverse(arr,n-k , n-1);
        reverse(arr , 0 , n-1);

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

        System.out.print("Enter k by which want to rotate : ");
        int k = sc.nextInt();

        rotateInPlace(arr,k);
        printArray(arr);

    }
}
