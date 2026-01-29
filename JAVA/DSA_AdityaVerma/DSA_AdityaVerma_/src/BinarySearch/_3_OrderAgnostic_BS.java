package BinarySearch;

public class _3_OrderAgnostic_BS {
    static int orderAgnosticBS(int arr[], int target){
        int n = arr.length;
        int s=0, e=n-1;
        boolean isAscending = arr[e] > arr[s];
        while (s <= e){
            int mid = s + (e-s)/2;
            if(target == arr[mid]) return mid;
            if(isAscending){
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
    public static void main(String[] args) {
        int arr[] = {12,23,34,45,56,67,78};
        System.out.println(orderAgnosticBS(arr, 45));

        int brr[] = {98,87,76,65,54,43,32,21};
        System.out.println(orderAgnosticBS(brr, 65));
    }
}
