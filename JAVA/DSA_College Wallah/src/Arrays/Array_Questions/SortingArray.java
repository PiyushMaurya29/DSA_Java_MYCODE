package Arrays.Array_Questions;
import java.util.Scanner;
public class SortingArray {
    static boolean sortArray(int arr[]){
        boolean check = true;
        for(int i=1 ; i<arr.length ; i++){
            if(arr[i]<arr[i-1]) {
                check = false;
                break; // break is conditional statement
            }
        }
        return check;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+n+" elements of array : ");
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The array is Sorted : "+sortArray(arr));
    }
}
