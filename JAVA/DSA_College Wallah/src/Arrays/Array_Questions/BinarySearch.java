package Arrays.Array_Questions;
import java.util.*;
public class BinarySearch {
    public static void printArray(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void swap(int arr[] , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void sortArray(int arr[]){
        int n = arr.length;
        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                if(arr[i]>arr[j]){
                    swap(arr,i,j);
                }
            }
        }
    }
    public static void binarySearch(int arr[] , int key){
        int n = arr.length;
        int i=0 , j=n-1;
        int flag = 0;
        int position = -1;
        while (i<=j && flag==0){
            int mid = (i+j)/2;
            if(arr[mid]==key){
                flag = 1;    //element found
                position = mid + 1;
            }
            if(arr[mid]>key){
                i=mid-1;
            }
            if(arr[mid]<key){
                i=mid+1;
            }
        }
        if(flag==1) System.out.println("Number found : "+position);
        else System.out.println("Not found : "+position);
    }
//    static int binarySearch2(int arr[] , int k){
//        int start = 0 , end = arr.length-1;
//        while (start<=end){
//            int mid = (start+end)/2;
//
//            if(arr[mid] == k) return mid;
//            if(arr[mid]<k) start = mid+1;
//            if(arr[mid]>k) end = mid-1;
//
//        }
//        return -1;
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // For binary search the elements should be sorted

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" element in array : ");
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        sortArray(arr);
        System.out.print("Sorted Array : ");
        printArray(arr);
        System.out.print("Enter value want to search : ");
        int key = sc.nextInt();

        binarySearch(arr,key);
    }
}
