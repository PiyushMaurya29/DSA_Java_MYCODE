package Arrays.Array_Questions;
import java.util.*;
public class LinearSearch {
    public static void linearSearch(int arr[] , int k){
        int n = arr.length;
        int i=0 , flag=0 , position = -1;
        for(i=0 ; i<n && flag==0 ; i++){
            if(arr[i]==k){
                flag = 1;
                position = i+1;
            }
        }
        if(flag==0) System.out.println("Not found");
        else System.out.println("Found at position : "+position);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" element in array : ");
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter value want to search : ");
        int key = sc.nextInt();

        linearSearch(arr,key);
    }
}
