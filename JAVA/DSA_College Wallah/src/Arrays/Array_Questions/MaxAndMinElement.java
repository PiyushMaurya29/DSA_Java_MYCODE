package Arrays.Array_Questions;
import java.util.Arrays;
import java.util.Scanner;
public class MaxAndMinElement {
//    static void SmallestAndLargestElement(int arr[]){
//        Arrays.sort(arr);
//        System.out.println("Smallest element : "+arr[0]);
//        System.out.println("Largest element : "+arr[arr.length-1]);
//    }
    static int[] SmallestAndLargestElement(int arr[]){
        Arrays.sort(arr);
        int ans[] = {arr[0],arr[arr.length-1]};
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        //Arrays.sort(arr); Used to sort array
        int ans[] = SmallestAndLargestElement(arr);
        System.out.println("Smallest : "+ans[0]);
        System.out.println("Largest : "+ans[ans.length-1]);
    }
}
