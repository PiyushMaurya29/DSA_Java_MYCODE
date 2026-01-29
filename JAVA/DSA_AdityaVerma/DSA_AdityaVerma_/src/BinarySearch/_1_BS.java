package BinarySearch;

public class _1_BS {
    static int binarySearch(int arr[], int target){
        int n = arr.length;
        int s=0, e=n-1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] > target) e = mid - 1;
            else s = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(binarySearch(arr, 2));
    }
}
