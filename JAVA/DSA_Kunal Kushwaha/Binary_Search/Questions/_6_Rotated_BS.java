package Binary_Search.Questions;

public class _6_Rotated_BS {
    static int findIndRotatedArray(int arr[], int target){
        int n = arr.length;
        int s=0, e=n-1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(target == arr[mid]) return mid;
            else if(arr[s] <= arr[mid]){
                if(target < arr[mid] && target >= arr[s]){
                    e = mid - 1;
                }else{
                    s = mid + 1;
                }
            }
            else{
                if(target > arr[mid] && target <= arr[e]){
                    s = mid + 1;
                }else{
                    e = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int arr[] = {6, 7, 8, 1, 2, 3};
        int target = 1;

        System.out.println(findIndRotatedArray(arr, target));

    }
}
