package BinarySearch;

public class _6_NumberOfTimesArrayIsRotated {
    static int findRotationCount_1(int arr[]){
        for(int i=0 ; i<arr.length-1 ; i++){
            if(arr[i] > arr[i+1]) return i+1;
        }
        // If array is not rotated
        return 0;
    }
    static int findRotationCount_2(int arr[]){
        int n = arr.length;
        int s=0, e=n-1;
        while (s < e){
            int mid = s + (e-s)/2;
            if(arr[mid] > arr[e]){
                s = mid + 1;
            }else{
                e = mid;
            }
        }
        return s;
    }
    static int findRotationCount_3(int arr[]){
        int n = arr.length;
        int s=0, e=n-1;
        while (s <= e){
            if(arr[s] <= arr[e]) return s;

            int mid = s + (e-s)/2;
            int next = (mid + 1)%n;
            int prev = (mid + n + -1) % n;
            // Check if the middle element is the pivot
            if(arr[mid] <= arr[next] && arr[mid] <= arr[prev]) return mid;

            // Decide which half to continue the search
            // We have to move towards the unsorted part of the array
            if(arr[mid] <= arr[e]) e = mid - 1;
            else if(arr[mid] >= arr[s]) s = mid + 1;
        }
        // If array is not rotated
        return 0;
    }
    public static void main(String[] args) {
        // Q. How many times is a Sorted Array Rotated

        // Find the minimum element index gives how many times array is rotated
        // We say the minimum element to pivot element

        int arr[] = {11,12,15,18,2,5,6,8};
        System.out.println(findRotationCount_1(arr));
        System.out.println(findRotationCount_2(arr));
        System.out.println(findRotationCount_3(arr));
    }
}
