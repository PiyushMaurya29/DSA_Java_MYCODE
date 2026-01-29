package HashMap;

import java.util.HashMap;

public class _4_IsomorphicStrings {
    public static boolean isIsomorphic(String s1, String s2){
        HashMap<Character, Character> map = new HashMap<>();
        for(int i=0 ; i<s1.length() ; i++){
            Character chS1 = s1.charAt(i);
            Character chS2 = s2.charAt(i);
            if(map.containsKey(chS1)){
                if(map.get(chS1) != chS2) return false;
            }
            else if(map.containsValue(chS2)){
                return false;
            }
            else map.put(chS1, chS2);
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "xxy";
        System.out.println(isIsomorphic(s1, s2));
    }
}
