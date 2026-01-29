import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _1_ArrayList {
    public static void main(String[] args) {

        ArrayList<String> studentsName = new ArrayList<>();
        studentsName.add("Mukesh");

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(4);
        System.out.println(list);
        list.add(2, 40);
        System.out.println(list);

        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(150);
        newList.add(200);
        // Adding new List in newList
        list.addAll(newList);
        System.out.println(list);
        System.out.println(list.get(5));
        list.remove(1);
        System.out.println(list);
        // If you want to remove an Integer type element
        list.remove(Integer.valueOf(200));
        System.out.println(list);

        // Updating the element of the list
        list.set(3, 100);
        System.out.println(list);

        System.out.println(list.contains(150));

        for(int i=0 ; i<list.size() ; i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        // For each loop
        for(Integer ele : list){ // You can write "var" instead of int dataType
            System.out.print(ele+" ");
        }
        System.out.println();
//        list.clear(); // Clear the whole list
//        System.out.println(list);

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

    }
}
