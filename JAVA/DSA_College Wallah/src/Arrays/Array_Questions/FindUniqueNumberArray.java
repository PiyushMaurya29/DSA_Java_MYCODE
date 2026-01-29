package Arrays.Array_Questions;
import java.util.Scanner;
public class FindUniqueNumberArray {
    static int findUnique(int arr[]){
        int n = arr.length;
        int ans = 0;
        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        for(int i=0 ; i<n ; i++){
            if(arr[i]>0) ans = arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Q. Find the unique number in a given Array where all
        the elements are being repeated twice with one value being unique
         */
        /* Algorithm :
        * Traverse all pairs
        * Equal pairs mark -1
        * Traverse array again value > 0 is our answer
         */

        // arr = 1 2 3 4 2 1 3 , ans = 4;

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter elements of array : ");
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The Unique element is : "+findUnique(arr));
    }
}
