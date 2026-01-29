package BinarySearch;

public class _9_Floor_Ceil_OfElement {
    static int findFloorOfElement(int arr[], int target){
        int n = arr.length;
        int s=0, e=n-1;
        int floor = -1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(target == arr[mid]) return mid;
            else if(target > arr[mid]){
                floor = arr[mid];
                s = mid + 1;
            }
            else e = mid - 1;
        }
        return floor; // Or directly return arr[e]
    }
    static int findCeilOfElement(int arr[], int target){
        int n = arr.length;
        int s=0, e=n-1;
        int ceil = -1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(target == arr[mid]) return mid;
            else if(target > arr[mid]) s = mid + 1;
            else{
                ceil = arr[mid];
                e = mid - 1;
            }
        }
        return ceil; // Or return arr[s] directly
    }
    public static void main(String[] args) {

        // Find Floor of an element in a Sorted array
        // Floor is the greatest element smaller than target element
        // Small element which is greater than the target element
        int arr[] = {3, 4, 8, 10, 12, 19};

        System.out.println(findFloorOfElement(arr, 5));
        System.out.println(findCeilOfElement(arr, 5));

    }
}
