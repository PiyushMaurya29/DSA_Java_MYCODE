package Binary_Search.Questions;

public class _1_Ceiling_Of_Number {
    static int ceilingOfNumber(int arr[] , int target){
        // but what if the target is greater than the greatest number in the array
        if(target > arr[arr.length-1]){
            return -1;
        }
        int start = 0 , end = arr.length-1;
        while (start<=end){
            int mid = start + (end - start)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        // return the index of smallest number >= target
        return start;
    }
    public static void main(String[] args) {
        // Ceiling -> The smallest element in array greater or equal to target
        /*
           For given array
           arr[] = {2,3,5,9,14,16,18}
            Examples :
              Ceiling(arr,target=14) = 14
              Ceiling(arr,target=15) = 16
              Ceiling(arr,target=4) = 5
              Ceiling(arr,target=9) = 9

             If you don't find that target element in array
             you will return an element which is greater than the
             target element

             Next big number , when no answer is found = start element because it is the beaking
             point of loop
         */

        int arr[] = {2,3,5,9,14,16,18};
        int target  = 4;
        int ans = ceilingOfNumber(arr,target);
        System.out.println(ans);
    }
}
