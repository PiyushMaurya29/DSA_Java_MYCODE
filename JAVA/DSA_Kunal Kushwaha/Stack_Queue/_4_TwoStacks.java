import java.util.ArrayList;

public class _4_TwoStacks {
    public static void helper(String p, String up, ArrayList<String> list){
        if(up.isEmpty()){
            list.add(p);
            return;
        }
        helper(p+up.charAt(0), up.substring(1), list);
        helper(p, up.substring(1), list);
    }
    public static ArrayList<String> findSubString(String str){
        ArrayList<String> list = new ArrayList<>();
        helper("", str, list);
        return list;
    }
    public static void main(String[] args) {
        System.out.println(findSubString("AVC"));
    }
}
