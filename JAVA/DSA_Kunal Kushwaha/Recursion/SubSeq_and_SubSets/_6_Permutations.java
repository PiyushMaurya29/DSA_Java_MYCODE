package Recursion.SubSeq_and_SubSets;

import java.util.ArrayList;

public class _6_Permutations {
    static void printPermutations(String p, String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch = up.charAt(0);
        for(int i=0 ; i<=p.length() ; i++){
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            printPermutations(first+ch+second, up.substring(1));
        }
    }
    public static ArrayList<String> permutationsList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0 ; i<=p.length() ; i++){
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            ans.addAll(permutationsList(first+ch+second, up.substring(1)));
        }
        return ans;
    }
    public static void main(String[] args) {
        printPermutations("", "abc");
        System.out.println();
        System.out.println(permutationsList("", "abc"));
    }
}
