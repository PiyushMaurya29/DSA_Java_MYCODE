package BinarySearch.BS_Questions;

public class _5_BS_DuplicateEle {
    static boolean bs_DuplicateEle(int arr[], int target){
        int n = arr.length;
        int s=0, e=n-1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == target) return true;
            if(arr[s] == arr[mid] && arr[e] == arr[mid]){
                ++s;
                --e;
            }
            else if(arr[mid] <= arr[e]){
                if(target > arr[mid] && target <= arr[e]){
                    s = mid + 1;
                }else{
                    e = mid - 1;
                }
            }
            else{
                if(target >= arr[s] && target < arr[mid]){
                    e = mid - 1;
                }else{
                    s = mid + 1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {

        // Q. Search element in rotated sorted array with duplicate elements.
        // Return true if the element is found, else return false.

        int arr[] = {1, 1, 1, 2, 2, 3, 1};  // 0, 0, 0, 1, 1, 1, 2, 0, 0, 0
        int target = 3;

        System.out.println(bs_DuplicateEle(arr, target));

    }
}
