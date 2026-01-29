package Arrays.ArrayTwoPointer;
import java.util.Scanner;
public class SortArrayConsistOf_0_and_1 {
    static void printArray(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void sortZeroAndOne(int arr[]){
        int count0 = 0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]==0) count0++; // Counting number of 0 in array
        }
        // Fill array  0 to count-1 : count to lengthOfArray
        // 1st Method
//        for(int i=0 ; i<count0 ; i++){
//            arr[i] = 0;
//        }
//        for(int i=count0 ; i<arr.length ; i++){
//            arr[i] = 1;
//        }

        //2nd Method
                for(int i=0 ; i<arr.length ; i++){
                    if(i<count0) arr[i] = 0;
                    else arr[i] = 1;
                }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q. Sort array consist of 0 and 1 in increasing order

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+n+" elements in array : ");
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        sortZeroAndOne(arr);

        System.out.println("Sorted array : ");
        printArray(arr);
    }
}
