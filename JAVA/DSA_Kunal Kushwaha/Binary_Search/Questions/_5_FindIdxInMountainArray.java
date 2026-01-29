package Binary_Search.Questions;

public class _5_FindIdxInMountainArray {

    // Q.   https://leetcode.com/problems/find-in-mountain-array/description/
    static int orderAgnosticBS(int arr[], int s, int e, int target){
        boolean isAsc = arr[s] < arr[e];
        while (s <= e){
            int mid = s + (e-s)/2;
            if(target == arr[mid]) return mid;
            if(isAsc){
                if(target > arr[mid]) s = mid + 1;
                else e = mid - 1;
            }
            else{
                if(target > arr[mid]) e = mid - 1;
                else s = mid + 1;
            }
        }
        return -1;
    }
    static int peakIndexInMountainArray(int arr[]){
        int n = arr.length;
        int s=0, e=n-1;
        while (s < e){
            int mid = s + (e-s)/2;
            if(arr[mid] > arr[mid+1]) e = mid;
            else s = mid + 1;
        }
        return s;
    }
    static int searchMinIdxInMountainArray(int arr[], int target){
        int peakIdx = peakIndexInMountainArray(arr);
        int leftArray = orderAgnosticBS(arr, 0, peakIdx, target);
        if(leftArray != -1){
            return leftArray;
        }
        // if not found in left part search in second part
        int rightArray = orderAgnosticBS(arr, peakIdx+1, arr.length-1, target);
        if(rightArray != -1){
            return rightArray;
        }
        return -1;
    }
    public static void main(String[] args) {

        // Q. Find the minimum index of element in mountain array . Return -1 id doesn't exist.

        int arr[] = {1,2,3,4,5,3,1}; //0,1,2,4,2,1
        int target = 3;

        System.out.println(searchMinIdxInMountainArray(arr, target));

    }
}
