package Arrays.Array_Questions;
import java.util.*;
public class FindMaxIn_Range {
    // add all the base cases
    static int maxRange(int arr[] , int start , int end){
        if(start > end) return -1;
        if(arr == null) return -1;
        if(arr.length == 0) return -1;
        int max = Integer.MIN_VALUE;
        for(int i=start ; i<=end ; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {23,4,5,6,7,8,89,9};

        System.out.println(maxRange(arr,2,6));

    }
}
