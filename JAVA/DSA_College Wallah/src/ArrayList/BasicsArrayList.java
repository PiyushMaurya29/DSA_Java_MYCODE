package ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
public class BasicsArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Wrapper Classes
         *A class whose object contains or wraps PDT
         * Object of a wrapper class contains a field which stores PDT
         */

        /* PDT(Primitive Data Type)    WrapperClass
         *       int          ->            Integer
         *       float        ->            Float
         *       char         ->            Character
         *       boolean      ->            Boolean
         *       long         ->            Long
         */

        //Wrapper class
//        Integer i = new Integer(10); // This method of initializing objects is now not in use
        Integer x = Integer.valueOf(4);
        System.out.println(x);
        Float y = Float.valueOf(9.88f);
        System.out.println(y);


        /*ArrayList Syntax
        List<AntClass>list = new ArrayList < AnyClass>();
         */
        ArrayList<Integer> l1 = new ArrayList<>();  //Again we can write <Integer> but no need to do this
//        ArrayList<Boolean> l2 = new ArrayList<>();
//        ArrayList<Float>   l3 = new ArrayList<>();


        //Functions on ArrayList

        //Add new element
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(9);

        //Get an element at index i
        System.out.println(l1.get(1));

        //Print with for loop
//        for(int i=0 ; i<l1.size() ; i++){  // .size() used to find length of an array
//            System.out.print(l1.get(i)+" ");
//        }

        //Print the arraylist directly
        System.out.println(l1);

        //Adding element at some index i
        l1.add(1,100);
        l1.add(2,200);
        System.out.println(l1);

        //Modifying element at index i
        l1.set(1,300);
        System.out.println(l1);

        //Removing an element at index i
        l1.remove(1);
        System.out.println(l1);

        //Removing an element e
//        l1.remove(2); // Remove value at that index
        l1.remove(Integer.valueOf(200));
        System.out.println(l1);
        System.out.println(l1.remove(Integer.valueOf(200))); //return boolean value

        //checking if an element exists
        boolean ans = l1.contains(Integer.valueOf(9));
        System.out.println(ans);

        //if you do not specify class, you can not put anything inside l
        ArrayList l = new ArrayList();
        l.add("Piyush");
        l.add(34);
        l.add(77.9);
        System.out.println(l);
    }
}
