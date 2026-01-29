package Arrays.Array_Questions;
import java.util.Scanner;
public class Pair_Array_Sum_X {
    static int pairSumX(int arr[],int x){
        int count = 0;
        for(int i=0 ; i<arr.length ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                if(x == arr[i] + arr[j]) count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q. Find the total number of pairs in the array whose sum is equal to given value x.

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements : ");
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter value of TargetSum(X) : ");
        int x = sc.nextInt();

        System.out.println("Pairs in array whose sum is "+x+" : "+pairSumX(arr,x));
    }
}
