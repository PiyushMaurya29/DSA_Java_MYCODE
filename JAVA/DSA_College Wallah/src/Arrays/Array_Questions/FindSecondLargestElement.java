package Arrays.Array_Questions;
import java.util.Scanner;
public class FindSecondLargestElement {

    /*Another method can also be used by replacing maximum
    element with Integer.MIN_VALUE and find second maximum
     */
    static int secondLargest(int arr[]){
        int max = Integer.MIN_VALUE;
        // Finding the maximum element of array.
        for(int i=0 ; i<arr.length ; i++){
            if(max<arr[i]) max = arr[i];
        }
        // Now finding second maximum element of array.
        int secondMax = Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length ; i++){
            if((secondMax<arr[i]) && max != arr[i]) secondMax = arr[i];
        }
        return secondMax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements in array : ");

        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Second largest element is "+secondLargest(arr));
    }
}
