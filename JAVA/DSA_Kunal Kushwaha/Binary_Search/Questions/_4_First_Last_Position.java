package Binary_Search.Questions;

public class _4_First_Last_Position {
    static int[] findFirstLastIdx(int arr[], int target){
        int n = arr.length;
        int s=0, e=n-1;
        int ans[] = {-1,-1};
        while (s <= e){
            int mid = s + (e-s)/2;
            if(target < arr[mid]){
                e = mid - 1;
            }
            else if(target > arr[mid]){
                s = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {



    }
}
