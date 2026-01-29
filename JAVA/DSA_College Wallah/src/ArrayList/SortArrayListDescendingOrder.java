package ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class SortArrayListDescendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {2,344,55,66,99};
        Arrays.stream(arr).sorted();
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
