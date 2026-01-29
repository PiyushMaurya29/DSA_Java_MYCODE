package Sorting_Algorithms;

public class Cyclic_Sort {
    static void swap(int arr[] , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static void cyclicSort(int arr[]){
        int i = 0;
        while (i < arr.length){
            int correctIdx = arr[i] - 1;  // index = value - 1
            if(arr[i] != arr[correctIdx]){
                swap(arr,i,correctIdx);
            }
        }
    }
    public static void main(String[] args) {
        /*
           Cyclic Sort :
           * When given numbers from range 1 to N . Use cyclic sort

           * Index = Value - 1
         */
    }
}
