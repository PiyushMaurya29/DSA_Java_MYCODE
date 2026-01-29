package Recursion.SubSeq_and_SubSets;

public class _2_Skip_CharAndString {
    static void skipChar(String p , String up){
        // p -> Processed String
        // up -> Unprocessed String (Original String)
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skipChar(p , up.substring(1));
        }else {
            skipChar(p+ch , up.substring(1));
        }
    }
    static String skip(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            return skip(up.substring(1));
        }
        else{
            return ch + skip(up.substring(1));
        }
    }
    static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }
        else{
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }
    static String skipAppNotApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        }
        else{
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }

    public static void main(String[] args) {

        skipChar("" , "baccdab");

        System.out.println(skip("baccdab"));
        System.out.println(skipAppNotApple("appappleappapple"));
    }
}
