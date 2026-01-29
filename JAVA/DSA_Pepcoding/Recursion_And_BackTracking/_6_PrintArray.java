package Recursion_And_BackTracking;

public class _6_PrintArray {
    static void displayArray(int arr[], int index){
        if(index == arr.length){
            System.out.println();
            return;
        }
        System.out.print(arr[index]+" ");
        displayArray(arr, index+1);
    }
    static void displayArrayReverse(int arr[], int index){
        if(index == arr.length) return;
        displayArrayReverse(arr, index+1);
        System.out.print(arr[index]+" ");
    }
    public static void main(String[] args) {

        int arr[] = {10,20,30,40,50};

        displayArray(arr, 0);
        displayArrayReverse(arr, 0);

    }
}
