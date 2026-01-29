package Leet_Code.BinarySearch;
//Q. https://leetcode.com/problems/peak-index-in-a-mountain-array/
//Q. https://leetcode.com/problems/find-peak-element/
 // This both question are exactly same to same
public class Mountain_Array {
    public static int peakIndexInMountainArray(int[] nums) {
        int start = 0 , end = nums.length-1;
        while (start < end){
            int mid = start + (end - start)/2;
            if(nums[mid] > nums[mid+1]){
                // you are in dec part of array
                // this may be the answer , but look at left
                // this is why end != mid - 1
                end = mid;
            }
            else{
                // you are in asc part of array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
            // in the end , start == end and pointing to the largest number because of the 2 checks
            // start and end are always trying to find amx element in the above 2 checks
            // hence , when they are pointing to just one element , tht is the max one because that is what the checks say
            // more elaboration : at every point of time for start and end , they have the best possible answer till that time
            // and if we are saying that only one item is remaining , hence because of above 1 line
        }
        return start; // or return end as both : start == end
    }
    public static void main(String[] args) {



    }
}
