package BinarySearch;

public class _12_Min_Diff_Element {
    static int findMinDiffEle(int arr[], int key){
        int n = arr.length;
        int s=0, e=n-1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(key == arr[mid]) return mid;
            else if(key > arr[mid]) s = mid + 1;
            else e = mid - 1;
        }
        if(Math.abs(arr[s]-key) < Math.abs(arr[e]-key)) return arr[s];
        else return arr[e];
    }
    public static void main(String[] args) {
        // Find the element having absolute minimum difference when subtracted from the key element

        int arr[] = {1, 3, 8, 10, 15}; // Ans = Index of 10 Or directly return the element
        int key = 12;

        System.out.println(findMinDiffEle(arr, key));
    }
}
