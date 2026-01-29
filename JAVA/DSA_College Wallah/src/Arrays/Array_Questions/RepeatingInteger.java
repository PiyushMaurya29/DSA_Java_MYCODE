package Arrays.Array_Questions;
import java.util.Scanner;
public class RepeatingInteger {
    static int firstRepeatingValue(int arr[]){
        int n = arr.length;
        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Q.Given an array 'a' consisting of integers.
        Return the first value that is repeating in this array
        If no value is being repeated , return -1.
         */
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements : ");
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("First repeating value in array : "+firstRepeatingValue(arr));
    }
}
