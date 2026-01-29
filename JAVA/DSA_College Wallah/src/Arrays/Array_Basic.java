package Arrays;
import java.util.*;
public class Array_Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[]; // Declaration of array . arr is getting defined in the stack
        arr = new int[10]; // Initialisation actually here object is being created in the heap


        /*   int         arr[]         =       new int[5]
           datatype  referenceVariable     creating the object
           this happened at compileTime  happened at runtime(Dynamic Memory Allocation)
         */

        /*
           1. Arrays objects are in heap
           2. Heap objects are not continues
           3. Dynamic Memory Allocation
           * In java array may not be in continues memory because of JVM
           new keyword is used to create an object
           * Objects are stored in heap memory
         */

        // input using for loop
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        // printing using arrays function
        System.out.println(Arrays.toString(arr));

        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        // printing using for each loop
        for(int num : arr){ // for every element in array , print the element
            System.out.print(num+" "); // here num represent element of the array
        }
    }
}
