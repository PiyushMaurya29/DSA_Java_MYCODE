package Searching;

public class Linear_Search {
    static int linearSearch(int arr[] , int key){
        if(arr.length==0){
            return -1;
        }
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]==key){
                return i;
            }
        }

        // This line will execute if none of the return statements above have executed
        // Hence , the target not found
        return -1;
    }
    public static void main(String[] args) {
        // Given an array find an element exist in it or not

        int arr[] = {18,12,9,14,77,50};
        // Find whether 14 exist of not
        // Search in the array : return the index if item is found
        // Otherwise if item is not found return -1

        int target = 77;

        int idx = linearSearch(arr,target);

        if(idx>0){
            System.out.println("Element "+target+" exist at index : "+idx);
        }
        else{
            System.out.println("Element "+target+" doesn't exist");
        }
    }
}
