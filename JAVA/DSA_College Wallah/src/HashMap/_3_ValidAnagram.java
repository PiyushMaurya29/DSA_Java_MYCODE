package HashMap;

import java.util.HashMap;
import java.util.Objects;

public class _3_ValidAnagram {
    public static boolean isValidAnagramSelfWritten(String s1, String s2){
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(char ch : s1.toCharArray()){
            if(map1.containsKey(ch)) map1.put(ch, map1.get(ch)+1);
            else map1.put(ch, 1);
        }
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(char ch : s2.toCharArray()){
            if(map2.containsKey(ch)) map2.put(ch, map2.get(ch)+1);
            else map2.put(ch, 1);
        }
        for(char ch : s1.toCharArray()){
            if(!Objects.equals(map1.get(ch), map2.get(ch))) return false;
        }
        for(char ch : s2.toCharArray()){
            if(map1.containsKey(ch) != map2.containsKey(ch)) return false;
        }
        return true;
    }
    public static HashMap<Character, Integer> makeFreqMap(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0 ; i<s.length() ; i++){
            Character ch = s.charAt(i);
            if(!map.containsKey(ch)) map.put(ch, 1);
            else map.put(ch, map.get(ch)+1);
        }
//        for(var ch : s.toCharArray()){
//            if(map.containsKey(ch)) map.put(ch, map.get(ch)+1);
//            else map.put(ch, 1);
//        }
        return map;
    }
    public static boolean isValidAnagram1(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        HashMap<Character, Integer> map1 = makeFreqMap(s1);
        HashMap<Character, Integer> map2 = makeFreqMap(s2);
        return map1.equals(map2);
    }
    public static boolean isValidAnagram2(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        HashMap<Character, Integer> map = makeFreqMap(s1);
        for(int i=0 ; i<s2.length() ; i++){
            Character ch = s2.charAt(i);
            if(!map.containsKey(ch)) return false; // If map doesn't contains that character
            int currFreq = map.get(ch);
            if(currFreq == 0) map.remove(ch);
            else map.put(ch, currFreq-1);
        }
        // All values of map should be zero for s1 and s2 be an anagram
        for(Integer i : map.values()){
            if(i != 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";

        System.out.println(isValidAnagramSelfWritten(s1, s2));
        System.out.println(isValidAnagram1(s1, s2)); // Using Two Maps
        System.out.println(isValidAnagram2(s1, s2));
    }
}
