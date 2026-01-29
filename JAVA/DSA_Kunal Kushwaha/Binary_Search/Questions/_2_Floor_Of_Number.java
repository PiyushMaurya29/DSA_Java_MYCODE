package Binary_Search.Questions;

public class _2_Floor_Of_Number {
    static int floorOfNumber(int arr[] , int target){
        if(target > arr[arr.length-1]){
            return -1;
        }
        int start = 0 , end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return end;
    }
    public static void main(String[] args) {

        int arr[] = {3,4,6,8,9};
        int target = 5;

        System.out.println(floorOfNumber(arr,target));

        int arr2[] = {1,3,5,7,8,9};
        int target2 = 10;
        System.out.println(floorOfNumber(arr,target2));

    }
}
