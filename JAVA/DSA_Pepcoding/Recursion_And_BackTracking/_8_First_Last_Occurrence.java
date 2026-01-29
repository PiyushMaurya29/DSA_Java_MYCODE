package Recursion_And_BackTracking;

public class _8_First_Last_Occurrence {
    static int findFirstOcc1(int arr[], int idx, int target){
        if(idx == arr.length){
            return -1;
        }
        if(target == arr[idx]){
            return idx;
        }
        return findFirstOcc1(arr, idx+1, target);
    }
    static int findFirstOcc2(int arr[], int idx, int key){
        if(idx == arr.length){
            return -1;
        }
        if(arr[idx] == key){
            return idx;
        }else{
            // First index in smaller array
            int fiisa = findFirstOcc2(arr, idx+1, key);
            return fiisa;
        }
    }
    static int findFirstOcc3(int arr[], int idx, int key){
        if(idx == arr.length) return -1;
        int firstInSub = findFirstOcc3(arr, idx+1, key);
        if(arr[idx] == key) return idx;
        return firstInSub;
    }
    static int findLastOcc1(int arr[], int idx, int key){
        if(idx == -1) return -1;
        if(key == arr[idx]){
            return idx;
        }
        return findFirstOcc1(arr, idx-1, key);
    }
    static int findLastOcc2(int arr[], int idx, int key){
        if(idx == arr.length) return -1;
        // Last index in smaller array
        int liisa = findLastOcc2(arr, idx+1, key);
        if(liisa == -1){
            if(key == arr[idx]){
                return idx;
            }else{
                return -1;
            }
        }else{
            return liisa;
        }
    }
    public static void main(String[] args) {
        // Find index of first Or last occurrence of key element
        int arr[] = {2,3,9,8,7,6,4,12,7,3,8,12};
        int key = 8;

        System.out.println(findFirstOcc1(arr, 0, key));
        System.out.println(findFirstOcc2(arr, 0, key));
        System.out.println(findFirstOcc3(arr, 0, key));

        System.out.println(findLastOcc1(arr, arr.length-1, key));
        System.out.println(findLastOcc2(arr, 0, key));
    }
}
