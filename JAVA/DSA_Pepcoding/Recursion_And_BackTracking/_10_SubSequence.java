package Recursion_And_BackTracking;

import java.util.ArrayList;

public class _10_SubSequence {
    // Faith :- bc => [--, -c, b-, bc]
    // Adding and not adding result to faith to get expectations
    // Expectation :- abc => [---, --c, -b-, --bc, a--, a-c, ab-, abc]
    public static ArrayList<String> getSubSeq(String str){
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0); // a
        String ros = str.substring(1); // bc Rest of String
        ArrayList<String> rres = getSubSeq(ros); // Recursion Result
        ArrayList<String> mres = new ArrayList<>(); // myResult
        for(String rstr : rres){
            mres.add(""+rstr);  // not take
            mres.add(ch+rstr); // take
        }
        return mres;
    }
    public static void main(String[] args) {
        // For length n : Number of subsequence => 2^n
        // abc => null, c, b, bc, a, ab, ac, abc

        String str = "abc";
        ArrayList<String> ans = getSubSeq(str);
        System.out.println(ans);
    }
}
