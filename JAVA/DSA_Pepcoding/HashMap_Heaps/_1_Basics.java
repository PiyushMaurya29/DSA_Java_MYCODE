import java.util.HashMap;
import java.util.Set;

public class _1_Basics {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 141);
        map.put("China", 130);
        map.put("America", 40);
        map.put("SriLanka", 11);
        map.put("NaPak", 24);
        map.put("China", 50);
        System.out.println(map);
        Set<String> set = map.keySet();
        System.out.println(set);

        for(String key : map.keySet()){
            Integer val = map.get(key);
            System.out.print(key+"->"+val+" ");
        }
    }
}
