package Recursion_And_BackTracking;

import java.util.ArrayList;

public class _11_SubString {
    static ArrayList<String> getSubstring(String str){
        if(str.length() == 0){
            ArrayList<String> blankArrayList = new ArrayList<>();
            blankArrayList.add("");
            return blankArrayList;
        }
        char ch = str.charAt(0);
        String restOfString = str.substring(1);
        ArrayList<String> recursionResult = getSubstring(restOfString);
        ArrayList<String> myResult = new ArrayList<>();
        for(var val : recursionResult){
            myResult.add(""+val);
            myResult.add(ch+val);
        }
        return myResult;
    }
    public static void main(String[] args) {

        // For length n : Number of SubString => n(n+1)/2
        // For length n : Number of subsequence => 2^n
        // Substring is Continuous

        String str = "abc";
        ArrayList<String> ans = getSubstring(str);

        System.out.println(ans);
    }
}
