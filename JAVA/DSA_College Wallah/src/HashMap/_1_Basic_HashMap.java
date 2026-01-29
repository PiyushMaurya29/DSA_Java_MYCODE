package HashMap;

import java.util.HashMap;
import java.util.Map;

public class _1_Basic_HashMap {
    public static void main(String[] args) {
        // Q. Create a HashMap using Java HashMap class to store the following pairs(Person, Age)(Key, Value) and display them
        // Each entry contains pairs called (key, value) pair
        // Keys will be unique in HashMap

        /*
                Important Features of HashMap Class
                #To access a value one must know its key.
                #HashMap doesn't allow duplicate key but allow duplicate values
                #HashMap allows null key also but only once and multiple null values
                #Java HashMap maintains no order i.e Unordered.
         */
        /*
                Applications of HashMaps
                # Problems related to frequency of an item
                # Mapping problem
                # Storage optimization
                # Dictionary
                # Phonebook
         */
        HashMap<String, Integer> mp = new HashMap<>();
        mp.put("Akash", 21);
        mp.put("Yash", 16);
        mp.put("Lav", 17);
        mp.put("Rishika", 19);
        mp.put("Harry", 18);

        // Another way to put items in the HashMap using Loops
//        for(int i=1 ; i<=5 ; i++){
//            String name = sc.next();
//            int age = sc.nextInt();
//            person.put(name, age);
//        }
        System.out.println(mp.get("Yash")); // 16
        System.out.println(mp.get("Rahul")); // null

        mp.put("Akash", 25); // Update / Insertion
        System.out.println(mp.get("Akash")); // 25

        System.out.println(mp.remove("Akash")); // 25
        System.out.println(mp.remove("Pankaj")); // null
        // Removes the key, value pair removed and return null if key doesn't exist

        System.out.println(mp.containsKey("Akash")); // false
        System.out.println(mp.containsKey("Yash")); // true

        // Adding a new entry only if the new key doesn't exist already
//        if(!mp.containsKey("Yash")) mp.put("Yash", 30);
        mp.putIfAbsent("Yash", 30); // will not enter because yash already exist
        mp.put("Yashika", 30); // will enter this entry

        // Set of all keys in the HashMap
        System.out.println(mp.keySet());

        // Set of all value in the HashMap
        System.out.println(mp.values());

        // All the entries
        System.out.println(mp.entrySet());

        // Traversing all entries of HashMap - Multiple methods
        for(String key : mp.keySet()){ // write var instead of String
            System.out.printf("Age of %s is %d \n", key, mp.get(key));
        }
        System.out.println();
        for(Map.Entry<String , Integer> e : mp.entrySet()){
            System.out.printf("Age of %s is %d \n", e.getKey(), e.getValue());
        }
        System.out.println();
        for(var e : mp.entrySet()){
            System.out.printf("Age of %s is %d \n",e.getKey(), e.getValue());
        }
    }
}
