package Arrays.Array_Questions;
import java.util.Scanner;
public class SecondSmallestElement {
    static int secondSmallestElement(int arr[]){
        int smallest = Integer.MAX_VALUE;
        //Finding Smallest element
        for(int i=0 ; i<arr.length ; i++){
            if(smallest>arr[i]) smallest = arr[i];
        }
        // Finding 2nd smallest element
        int smallest2 = Integer.MAX_VALUE;
        for(int i=0 ; i<arr.length ; i++){
            if((smallest2>arr[i]) && (smallest != arr[i])) smallest2 = arr[i];
        }
        return smallest2;
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

        System.out.println("Second smallest element : "+secondSmallestElement(arr));
    }
}
