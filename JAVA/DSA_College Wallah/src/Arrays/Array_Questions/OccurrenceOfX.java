package Arrays.Array_Questions;
import java.util.Scanner;
public class OccurrenceOfX {
    static int countOccurrenceX(int arr[],int x){
        int count = 0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]==x) count++;
        }
        return count;
    }
    static int LastOccurrenceX(int arr[],int x){
        int index = -1;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]==x) index = i;
        }
        return index;
    }
    static int greaterThanX(int arr[],int x){
        int count = 0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]>x) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        //Count the number of occurrences of a particular element X.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter elements in array : ");
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value of x : ");
        int x = sc.nextInt();

        System.out.println("Count of x in array : "+countOccurrenceX(arr,x));
        System.out.println("Last Index of X : "+LastOccurrenceX(arr,x));
        System.out.println("Element Greater than X : "+greaterThanX(arr,x));
    }
}
