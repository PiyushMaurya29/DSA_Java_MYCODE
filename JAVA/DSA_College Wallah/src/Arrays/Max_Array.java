package Arrays;
class ArrayExamples {
    void MaxOfArray() {
        int arr[] = {5, 4, 3, 9,99};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i],max);
            // if (max < arr[i]) max = arr[i];  // Another Method
        }
        System.out.println("The maximum element is : " + max);
    }

    void searchArray() {
        int arr[] = {34, 55, 6, 77, 43,77};
        int x = 77;
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans = i;
                break;
            }
        }
        if (ans>0) System.out.println("Index of element x : " + ans);
        else System.out.println(ans);
    }
}

    public class Max_Array {
        public static void main(String[] args) {
            ArrayExamples object = new ArrayExamples();

            object.MaxOfArray();

            object.searchArray();
        }
    }

