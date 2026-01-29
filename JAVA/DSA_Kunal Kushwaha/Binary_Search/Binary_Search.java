package Binary_Search;

public class Binary_Search {
    //return the index of target element
    //return -1 if it does not exist
    static int binarySearch(int arr[] , int target){
        int start = 0 , end = arr.length-1;

        while (start<=end){
            // find middle element
//            int mid = (start+end)/2;
//            might be possible that (start+end) takes a value that exceeds the range of integer in java

            // so good way to write is given by
            int mid = start + (end-start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                // answer found
                return mid;
            }
        }
        // if element doesn't exist
        return -1;
    }
    public static void main(String[] args) {
        // For binary searching array should be sorted
        // Time complexity for BS is log(N)

        // Sorted array
        int arr[] = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target = 22;
        int ans = binarySearch(arr,target);
        System.out.println(ans);

    }
}
