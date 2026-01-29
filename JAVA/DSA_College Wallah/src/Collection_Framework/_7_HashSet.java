package Collection_Framework;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class _7_HashSet {
    static void HashSetExample(){
        HashSet<Integer> st = new HashSet<>();
        // LinkedHashSet preserve the order of element of list
//        LinkedHashSet<Integer> st = new LinkedHashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        System.out.println(st); // 1 2 3
        st.add(1);
        st.add(2);
        System.out.println(st); // 1 2 3
        st.remove(2);
        System.out.println(st); // 1 3
        System.out.println(st.contains(2)); // false
        System.out.println(st.size()); // 2

        st.add(48);
        st.add(15);
        st.add(10);
        System.out.println(st); // Unordered List
    }
    public static void main(String[] args) {
        // Set is collection of unique elements no duplicate elements exist
        // HashSet is unordered
        // HashSet apply hashing internally
        HashSetExample();
    }
}
