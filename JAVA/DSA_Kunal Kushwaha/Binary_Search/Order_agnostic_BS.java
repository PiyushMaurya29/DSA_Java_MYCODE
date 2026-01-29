package Binary_Search;

public class Order_agnostic_BS {
    static int orderAgnostic_BS(int arr[] , int target){
        int start = 0 , end = arr.length-1;

        // find whether the array is sorted in ascending or descending

        boolean isAsc = arr[start] < arr[end];
//        if(arr[start] < arr[end]){
//            isAsc = true;
//        }
//        else {
//            isAsc = false;
//        }

        while (start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        // for binary search array should be sorted whether in ascending or descending order
        // Time complexity for BS is log(N)


        int arr[] = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target = 22;

        int ans = orderAgnostic_BS(arr,target);
        System.out.println(ans);

        int brr[] = {99,80,75,22,11,10,5,2,-3};
        int target2 = 22;
        int ans2 = orderAgnostic_BS(brr,target2);
        System.out.println(ans2);

    }
}
