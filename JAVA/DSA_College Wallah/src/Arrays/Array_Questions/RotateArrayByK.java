package Arrays.Array_Questions;
import java.util.Scanner;
public class RotateArrayByK {
    static int[] rotateArray(int arr[] , int k){
        int n = arr.length;
        k = k % n;
        int ans[] = new int[n];
        int j = 0;
        for(int i=n-k ; i<n ; i++){
            ans[j] = arr[i]; //Or use ans[j++]
            j++;
        }
        for(int i=0 ; i<n-k ; i++){
            ans[j++] = arr[i];
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
        System.out.println("Enter elements of array : ");
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k by which want to rotate array : ");
        int k = sc.nextInt();

        int ans[] = rotateArray(arr,k);

        System.out.println("Array after rotation : ");
        printArray(ans);
    }
}
