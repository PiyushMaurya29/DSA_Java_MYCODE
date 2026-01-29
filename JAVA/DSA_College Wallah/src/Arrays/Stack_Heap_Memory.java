package Arrays;

public class Stack_Heap_Memory {
    static void changeArray(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = 0;
        }
    }
    static void printArray(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[4];
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 7;

        changeArray(arr);

        printArray(arr);

    }
}
