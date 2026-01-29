package Arrays.Array_Questions;
import java.util.Scanner;
public class TripletArraySumX {
    static int tripletSum(int arr[],int x){
        int count = 0;
        for(int i=0 ; i<=arr.length ; i++){ //First Number
            for(int j=i+1 ; j<arr.length ; j++){ //Second Number
                for(int k=j+1 ; k<arr.length ; k++){ //Third Number
                    if(arr[i]+arr[j]+arr[k]==x) count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q. Find the number of triplets in array whose sum is equal to the target sum

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        System.out.println("Enter "+n+" elements : ");
        int arr[] = new int[n];
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the targetTripletSum(X) : ");
        int x = sc.nextInt();

        System.out.println("The number of triplet whose sum is X : "+tripletSum(arr,x));
    }
}
