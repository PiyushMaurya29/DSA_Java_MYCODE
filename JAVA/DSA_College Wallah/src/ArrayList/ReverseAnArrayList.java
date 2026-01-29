package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class ReverseAnArrayList {
    static void reverseList(ArrayList<Integer> list){
        int i=0 , j=list.size() - 1;
        while (j>i){
            /*Swap half of the list :
            int temp = a;
                 a = b;
                 b = temp;
             */
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q. Write a program to Reverse the given ArrayList.

        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(900);
        list.add(20);
        list.add(50);
        list.add(100);
        list.add(15);
        System.out.println("Original List "+list);
        //reverseList(list);
        Collections.reverse(list);
        System.out.println("Reversed List "+list);

        Collections.sort(list);
        System.out.println("Ascending Order "+list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Descending Order "+list);

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Piyush");
        l1.add("Maurya");
        l1.add("Shaurya");
        l1.add("Pratap");
        l1.add("Singh");
        System.out.println("Original List : "+l1);
        Collections.sort(l1);
        System.out.println("Sorted List : "+l1);
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println("Reverse Order : "+l1);

    }
}
