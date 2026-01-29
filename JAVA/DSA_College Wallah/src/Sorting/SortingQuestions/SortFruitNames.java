package Sorting.SortingQuestions;
import java.util.*;
public class SortFruitNames {
    static void printStringArray(String arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void sortFruits(String fruit[]){
        int n = fruit.length;
        for(int i=0 ; i<n-1 ; i++){
            int minIndex = i;
            for(int j=i+1 ; j<n ; j++){
                if(fruit[j].compareTo(fruit[minIndex])<0){
                    minIndex = j;
                }
            }
            String temp = fruit[i];
            fruit[i] = fruit[minIndex];
            fruit[minIndex] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Q. Given an array of names of the fruits , you are supposed to
             sort it in lexicographical order using the selection sort.

        Lexicographical order means like the words written in dictionary
        Input :  ["papaya" , "lime" , "watermelon" , "apple" , "mango" , "kiwi"]
        Output : ["apple" , "kiwi" , "lime" , "mango" , "papaya" , "watermelon"]

        Let us assume two string S1 and S2
        If s1.compareTo(s2)   gives positive value if s1 is greater than s2 and vise versa
            s1 == s2 then it gives zero value
         */

        System.out.print("Enter the size of String Array : ");
        int n = sc.nextInt();
        String fruit[] = new String[n];

        System.out.println("Enter "+n+" Fruits names in Array : ");
        for(int i=0 ; i<n ; i++){
            fruit[i] = sc.next();
        }

        sortFruits(fruit);
        //printStringArray(fruit);

        // Printing using for each method
        for(String val : fruit){
            System.out.print(val+" ");
        }

    }
}
