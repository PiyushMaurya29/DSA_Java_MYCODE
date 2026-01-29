package Arrays.Array_Questions;
import java.util.Scanner;
public class CheckNumberPresentOrNot {
    static int[] makeFrequencyArray(int arr[]){
        int freq[] = new int[100010]; //Makes some extra space
        for(int i=0 ; i<arr.length ; i++){
            freq[arr[i]]++; // It will increase +1 in frequency array
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Q. Given Q queries , check if the given number
        is present in the array or not.
        Note -> Elements value will be less than 10^5.
         */

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+n+" elements in array : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int frequency[] = makeFrequencyArray(arr);

        System.out.print("Enter number of queries : ");
        int q = sc.nextInt();

        while(q>0){
            System.out.print("Enter number to be searched : ");
            int x = sc.nextInt();
            if(frequency[x]>0) System.out.println("YES");
            else System.out.println("NO");
            q--;
        }

    }
}
