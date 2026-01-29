package Arrays.Array_Questions;
import java.util.*;
public class FindAllPairs {
    static void findPairs(int arr[]){
        int n = arr.length;
        int totalPairs = 0;  // Total pairs = (n*(n-1))/2;
        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                totalPairs++;
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
        System.out.println("Total Number of Pairs : "+totalPairs);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements of array : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        findPairs(arr);
    }
}
