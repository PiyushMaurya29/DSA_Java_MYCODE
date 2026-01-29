package Arrays.Array_Questions;

import java.util.Scanner;

public class FrequencyArray {
    static int[] makeFreqArray(int arr[]){
        int freq[] = new int[(int)(Math.pow(10,6))];
        for(int i=0 ; i<arr.length ; i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {5,6,5,400,560,1000,400,121,234,566};

        int q = 10;

        int freq[] = makeFreqArray(arr);

        while (q != 0){
            System.out.print("Enter a number : ");
            int n = sc.nextInt();
            if(freq[n] > 0){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
            q--;
        }

    }
}
