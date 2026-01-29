package BinarySearch.BS_Questions;

public class _1_FirstOccOfEle {
    static int firstOccurrence(int arr[], int key){
        int n = arr.length;
        int s=0, e=n-1;
        int firstOcc = -1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == key){
                firstOcc = mid;
                e = mid-1;
            }else if(arr[mid] > key){
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }
        return firstOcc;
    }
    static int lastOccurrence(int arr[], int key){
        int n = arr.length;
        int s=0, e=n-1;
        int lastOcc = -1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == key){
                lastOcc = mid;
                s = mid + 1;
            }else if(arr[mid] > key){
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }
        return lastOcc;
    }
    public static void main(String[] args) {
        // Find the first occurrence of a given element x. Given that the given array is sorted.
        // If no occurrence of x is found then return -1.

        int arr[] = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int key = 5;

        System.out.println(firstOccurrence(arr, key));
        System.out.println(lastOccurrence(arr, key));
    }
}
