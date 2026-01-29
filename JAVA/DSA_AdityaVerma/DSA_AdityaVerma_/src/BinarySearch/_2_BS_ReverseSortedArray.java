package BinarySearch;

public class _2_BS_ReverseSortedArray {
    static int BS_ReverseSortedArray(int arr[], int target){
        int n = arr.length;
        int s=0, e=n-1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(target == arr[mid]) return mid;
            else if(target > arr[mid]) e = mid-1;
            else s = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {20,17,15,14,13,10,8,4,2};

        System.out.println(BS_ReverseSortedArray(arr,17));
    }
}
