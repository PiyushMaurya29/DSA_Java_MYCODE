package Searching;

public class Search_In_Range {
    static boolean searchInRange(int arr[] , int target , int start , int end){
        if(arr.length==0){
            return false;
        }
        for(int i=start ; i<=end ; i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int arr[] = {18,12,-7,3,14,28};

        // Q. Search for 3 in the range of index [1,4]

        int target = 3;
        if(searchInRange(arr,target,1,4)){
            System.out.println("Element "+target+" is present");
        }
        else{
            System.out.println("Element "+target+" is not present");
        }

    }
}
