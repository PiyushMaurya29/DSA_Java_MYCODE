package BinarySearch;

public class _11_FindIndexOf_1st_One_BinaryInfiniteArray {
    static int findFirstOccurrence(int arr[], int low, int high, int key){
        int result = -1;
        while (low <= high){
            int mid = low + (high-low)/2;
            if(key == arr[mid]){
                result = mid;
                high = mid - 1;
            }
            else if(key > arr[mid]) low = mid + 1;
            else high = mid - 1;
        }
        return result;
    }
    static int findFirstIdxOf_1(int arr[], int key){
        int low = 0;
        int high = 1;
        while (key > arr[high]){
            low = high;
            high *= 2;
        }
        return findFirstOccurrence(arr, low, high, key);
    }
    public static void main(String[] args) {

        //Q. Find the index of 1st One(1) in an Infinite Binary Sorted Array.
        // Array given is Infinite
        int arr[] = {0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1};

        System.out.println(findFirstIdxOf_1(arr, 1));

    }
}
