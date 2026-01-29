package BinarySearch;

public class _7_FindElementIn_SortedArray {

    static int findElementBS_1(int arr[], int k){
        int n = arr.length;
        int s=0 ,e=n-1;
        while (s<=e){
            int mid = s + (e-s)/2;
            if(k == arr[mid]) return mid;
            else if(k >= arr[s] && k<=arr[mid]){
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        return -1;
    }
    static int findElementBS_2(int arr[], int k){
        int n = arr.length;
        int s=0, e=n-1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(k == arr[mid]) return mid;
            if(arr[s] <= arr[mid]){
                if(arr[s] <= k && k < arr[mid]) e = mid - 1;
                else s = mid + 1;
            }
            else{
                if(arr[mid] < k && k < arr[e]) s = mid + 1;
                else e = mid - 1;
            }
        }
        return -1;
    }
    static int binarySearch(int arr[], int s, int e, int k){
        while (s <= e){
            int mid = s + (e-s)/2;
            if(k == arr[mid]) return mid;
            else if(k > arr[mid]) s = mid + 1;
            else e = mid - 1;
        }
        return -1;
    }
    static int findPivotIndex(int arr[]){
        int n = arr.length;
        int s=0, e=n-1;
        while (s < e){
            int mid = s + (e-s)/2;
            if(arr[mid] > arr[e]) s = mid + 1;
            else e = mid;
        }
        return s;
    }
    static int findElementBS_3(int arr[], int k){
        int pivotIdx = findPivotIndex(arr);
        int leftSearch = binarySearch(arr,0, pivotIdx-1, k);
        int rightSearch = binarySearch(arr, pivotIdx, arr.length-1, k);

        if(leftSearch != -1) return leftSearch;
        if(rightSearch != -1) return rightSearch;
        return -1;
    }
    public static void main(String[] args) {
        // Q. Find an element in a Sorted Rotated Array

        int arr[] = {11, 12, 15, 18, 2, 5, 6, 8};


        System.out.println(findElementBS_1(arr, 11));
        System.out.println(findElementBS_2(arr, 11));
        System.out.println(findElementBS_3(arr, 11));
    }
}
