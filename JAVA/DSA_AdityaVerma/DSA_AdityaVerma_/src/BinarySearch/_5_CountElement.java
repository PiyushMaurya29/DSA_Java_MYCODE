package BinarySearch;

public class _5_CountElement {
    static int findFirstOccurrence(int arr[], int key){
        int n = arr.length;
        int s=0, e=n-1;
        int firstOccurrence = -1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(key == arr[mid]){
                firstOccurrence = mid;
                e = mid - 1;
            }
            else if(key > arr[mid]) s = mid + 1;
            else e = mid - 1;
        }
        return firstOccurrence;
    }
    static int findLastOccurrence(int arr[], int key){
        int n = arr.length;
        int s=0, e=n-1;
        int lastOccurrence = -1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(key == arr[mid]){
                lastOccurrence = mid;
                s = mid + 1;
            }
            else if(key > arr[mid]) s = mid + 1;
            else e = mid - 1;
        }
        return lastOccurrence;
    }
    static int countOfAnElement(int arr[], int key){
        int firstOccurrence = findFirstOccurrence(arr, key);
        int lastOccurrence = findLastOccurrence(arr, key);
        if(firstOccurrence != -1 && lastOccurrence != -1){
            return lastOccurrence - firstOccurrence + 1;
        }else {
            return 0; // Element not found in the array
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,10,10,10,18,20};

        System.out.println(countOfAnElement(arr, 10));
    }
}
