package Arrays.Array_Questions;
import java.util.Scanner;
public class ReverseArray {
    static void reverseArray1(int arr[]){
        int n = arr.length;
        int brr[] = new int[n];

        for(int i=0 ; i<n ; i++){
            brr[n-i-1] = arr[i];
        }
        for(int i=0 ; i<n ; i++){
            arr[i] = brr[i];
        }
    }
    static int[] reverseArray2(int arr[]){
        int n = arr.length;
        int ans[] = new int[n];
        int j = 0;
        //Traverse original array in reverse direction
        for(int i=n-1 ; i>=0 ; i--){
            ans[j] = arr[i];   //Or use ans[j++]
            j++;
        }
        return ans;
    }

    static int[] reverseArray3(int arr[]){
        int n = arr.length;
        int ans[] = new int[n];
        for(int i=0 ; i<n ; i++){
            ans[i] = arr[n-i-1];
        }
        return ans;
    }
    static void printArray(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter element in array : ");
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

//        reverseArray1(arr);
//        printArray(arr);

//        int ans[] = reverseArray2(arr);
//        printArray(ans);

        int ans[] = reverseArray3(arr);
        System.out.println("The reverse array : ");
        printArray(ans);

    }
}
