package Recursion.SubSeq_and_SubSets;

import java.util.ArrayList;

public class _3_subSequence {
    static void subSeq(String p , String up){
        // p-> Processed String
        // up -> Unprocessed String
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch = up.charAt(0);
        subSeq(p+ch , up.substring(1));
        subSeq(p , up.substring(1));
    }
    static ArrayList<String> subSeqRet(String p , String up){
        // p-> Processed String
        // up -> Unprocessed String
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSeqRet(p+ch , up.substring(1));
        ArrayList<String> right = subSeqRet(p , up.substring(1));

        left.addAll(right);
        return left;
    }
    static void subSeqAscii(String p , String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch = up.charAt(0);
        subSeqAscii(p+ch , up.substring(1));
        subSeqAscii(p + (ch+0) , up.substring(1));
    }
    static ArrayList<String> subSeqAsciiReturn(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subSeqAsciiReturn(p+ch, up.substring(1));
        ArrayList<String> second = subSeqRet(p, up.substring(1));
        ArrayList<String> third = subSeqRet(p+(ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
    public static void main(String[] args) {
        // Subsequence is used for string subsets.

        subSeq("" , "abc");
        System.out.println();
        subSeqAscii("" , "abc");
        System.out.println();
        System.out.println(subSeqAsciiReturn("", "abc"));
        System.out.println(subSeqRet("", "abc"));

    }
}
