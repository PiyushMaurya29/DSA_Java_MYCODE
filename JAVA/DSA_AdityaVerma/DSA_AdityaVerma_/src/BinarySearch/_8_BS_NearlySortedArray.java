package BinarySearch;

public class _8_BS_NearlySortedArray {
    static int BS_NearlySortedArray(int arr[], int target){
        int n = arr.length;
        int s=0, e=n-1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(target == arr[mid]) return mid;
            if(mid-1 >= s && target == arr[mid-1]) return mid-1;
            if(mid+1 <= e && target == arr[mid+1]) return mid+1;

            if(target > arr[mid]) s = mid + 2;
            else e = mid - 2;
        }
        return -1;
    }
    public static void main(String[] args) {

        /*
            Q. Searching in a nearly sorted array
            Nearly sorted array means the element at i could be present at i, i-1, i+1.
         */
        int arr[] = {5, 10, 15, 17, 30, 20, 40};

        System.out.println(BS_NearlySortedArray(arr, 40));

    }
}
