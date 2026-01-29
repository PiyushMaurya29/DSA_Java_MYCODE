package BinarySearch;

public class _10_InfiniteArray_BS {
    static int binarySearch(int arr[], int s, int e, int target){
        while (s <= e){
            int mid = s + (e-s)/2;
            if(target == arr[mid]) return mid;
            else if(target > arr[mid]) s = mid + 1;
            else e = mid - 1;
        }
        return -1;
    }
    static int InfiniteArray_BS(int arr[], int target){
        int low = 0, high = 1;
        while (arr[high] < target){
            low = high;
            high *= 2;
        }
        return binarySearch(arr, low, high, target);
    }
    public static void main(String[] args) {
        int arr[] = new int[Integer.MAX_VALUE/10000];

        // Infinite array filled with even numbers
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = i * 2;
        }

        System.out.println(InfiniteArray_BS(arr, 20));
    }
}
