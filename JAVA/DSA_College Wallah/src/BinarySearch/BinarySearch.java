package BinarySearch;
import java.util.Scanner;
public class BinarySearch {
    static void printArray(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void sortArray(int arr[]){
        int n = arr.length;
        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    // Complexity is O(logN)
    static int binarySearch(int arr[] , int target){
        // TC = O(log(n))
        // SC = O(1)
        int n = arr.length;
        int start = 0 , end = n-1;

        if(target > arr[n-1]){
            return -1;
        }
        while (start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
    static int bsRecursion(int arr[], int start, int end, int target){
        // TC = O(log(n))
        // SC = O(log(n))

        if(start > end) return -1;
        int mid = start + (end - start)/2;
        if(arr[mid] == target) return mid;
        else if(arr[mid] > target) return bsRecursion(arr, start, mid-1, target);
        return bsRecursion(arr, mid+1, end, target);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter size of array : ");
//        int n = sc.nextInt();
//
//        int arr[] = new int[n];
//        System.out.println("Enter "+n+" elements of array : ");
//        for(int i=0 ; i<n ; i++){
//            arr[i] = sc.nextInt();
//        }
//        sortArray(arr);
//        printArray(arr);
//        System.out.print("Enter the key(target) to search : ");
//        int k = sc.nextInt();

        int arr[] = {1, 3, 4, 6, 7, 9};
        int target = 07;
        while (target != 10){
            System.out.printf("%d exist in array %d\n",target,bsRecursion(arr, 0, arr.length-1, target));
            System.out.printf("%d exist in array %d \n",target,binarySearch(arr, target));
            target++;
        }

    }
}
