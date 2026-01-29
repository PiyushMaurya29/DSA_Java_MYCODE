import java.util.HashMap;

public class _2_Char_MaxFreq {
    public static char maxFreqChar(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0 ; i<str.length() ; i++){
            Character ch = str.charAt(i);
            if(map.containsKey(ch)) map.put(ch, map.get(ch)+1);
            else map.put(ch, 1);
        }
        char maxChar = '\0';
        int maxFreq = 0;
        for(Character key : map.keySet()){
            if(map.get(key) > maxFreq){
                maxFreq = map.get(key);
                maxChar = key;
            }
        }
        return maxChar;
    }
    public static void main(String[] args) {
        String str = "testsample";
        System.out.println(maxFreqChar(str));
    }
}
