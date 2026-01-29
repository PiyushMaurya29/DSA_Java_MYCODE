package Collection_Framework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class _8_HashMaps {
    static void HashMapExample(){
//        Map<Integer,String> mp = new HashMap(); // Both are same way to initialize
        HashMap<Integer,String> mp = new HashMap<>();
//        TreeMap<Integer,String> tmp = new TreeMap(); // Order is Maintained in increasing Order acc to keys
//        LinkedHashMap<Integer,String> mp = new LinkedHashMap<>()
        // Linked HashMap is used for preserving the order
        mp.put(3, "Aman");
        mp.put(1, "Rohan");
        mp.put(2, "Riya");
        mp.put(1,"Priya"); // Update the value present at 1
        mp.putIfAbsent(1,"Karl"); // Don't update

        // Iterating over keys in a map
        for(var i : mp.keySet()){
            // Instead of var you can write datatype like Integer
            System.out.print(i+" ");
        }
        // Iterating over values in a map
        for(String i : mp.values()){
            System.out.print(i+" ");
        }
        // Iterating over the key, value mapping
        for(var e : mp.entrySet()){
            System.out.print(e+" ");
            // Can write e.getKey() and e.getValue()
            // For printing key and value
        }

//        System.out.println(mp);
//        System.out.println(mp.entrySet());
//        System.out.println(mp.keySet());
//        System.out.println(mp.values());
//        System.out.println(mp.get(2)); // Riya
//        System.out.println(mp.containsKey(4)); // false
//        System.out.println(mp.containsValue("Riya")); // true
    }
    public static void main(String[] args) {
        HashMapExample();
    }
}
