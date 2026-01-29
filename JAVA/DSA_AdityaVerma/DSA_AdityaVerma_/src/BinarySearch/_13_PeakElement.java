package BinarySearch;

public class _13_PeakElement {
    static int findPeakElement_1(int arr[]){
        int n = arr.length;
        int s=0, e=n-1;
        while (s < e){
            int mid = s + (e-s)/2;
            if(arr[mid] > arr[mid+1]){
                e = mid;
            }
            else{
                s = mid + 1;
            }
        }
        return s;
    }
    static int findPeakElement_2(int arr[]){ // Aditya Code
        int n = arr.length;
        int s=0, e=n-1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(mid==0){
                if(arr[0] > arr[1]) return 0;
                return 1;
            }
            else if(mid==n-1){
                if(arr[n-1] > arr[n-2]) return n-1;
                return n-2;
            }
            else if(mid > 0 && mid < n-1){
                if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                    return mid;
                }
            }
            else if(arr[mid-1] > arr[mid]){
                e = mid - 1;
            }
            else if(arr[mid] > arr[mid+1]){
                s = mid + 1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        // Find the index of peak element
        // Find the maximum element in bitonic Array

        int arr[] = {5,10,15,20,15,10}; // Return 20
        System.out.println(findPeakElement_1(arr));
//        System.out.println(findPeakElement_2(arr));

        int brr[] = {10,20,15,2,23,90,67}; // Return any 20 Or 90
        System.out.println(findPeakElement_1(brr));
//        System.out.println(findPeakElement_2(brr));
    }
}
