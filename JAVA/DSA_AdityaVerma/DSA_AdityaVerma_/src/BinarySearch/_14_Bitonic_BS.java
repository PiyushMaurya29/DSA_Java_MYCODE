package BinarySearch;

public class _14_Bitonic_BS {
    static int orderAgnosticBS(int arr[], int s, int e, int key){
        boolean isAscending = arr[s] < arr[e];
        if(isAscending){
            while (s <= e){
                int mid = s + (e-s)/2;
                if(key == arr[mid]) return mid;
                else if(key > arr[mid]) s = mid + 1;
                else e = mid - 1;
            }
        }else{
            while (s <= e){
                int mid = s + (e-s)/2;
                if(key == arr[mid]) return mid;
                else if(key > arr[mid]) e = mid - 1;
                else s = mid + 1;
            }
        }
        return -1;
    }
    static int findPeakIndex(int arr[]){
        int n = arr.length;
        int low=0, high=n-1;
        while (low < high){
            int mid = low + (high-low)/2;
            if(arr[mid] > arr[mid+1]){
                high = mid;
            }else {
                low = mid + 1;
            }
        }
        return low;
    }
    static int BS_bitonicArray(int arr[], int key){
        int n = arr.length;
        int maxEleIdx = findPeakIndex(arr);
        int leftResult = orderAgnosticBS(arr,0, maxEleIdx, key);
        int rightResult = orderAgnosticBS(arr, maxEleIdx+1, n-1, key);

        if(leftResult != -1) return leftResult;
        else if(rightResult != -1) return rightResult;
        else return -1;
    }
    public static void main(String[] args) {

        int arr[] = {1, 3, 8, 12, 4, 2};
        int key = 8;

        System.out.println(BS_bitonicArray(arr, key));

    }
}
