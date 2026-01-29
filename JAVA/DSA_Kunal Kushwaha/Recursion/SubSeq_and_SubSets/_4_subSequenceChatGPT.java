package Recursion.SubSeq_and_SubSets;

import java.util.ArrayList;

public class _4_subSequenceChatGPT {
    public static void helper2(String input, int index, String current, ArrayList<String> subSequences){
        if(index == input.length()){
            subSequences.add(current);
            return;
        }
        helper2(input, index+1, current, subSequences);
        helper2(input, index+1, current+input.charAt(index), subSequences);
    }
    public static ArrayList<String> findSubSequence2(String str){
        ArrayList<String> subSequences = new ArrayList<>();
        helper2(str, 0, "", subSequences);
        return subSequences;
    }
    public static void helper1(String input, String output, ArrayList<String> subSequences){
        if(input.isEmpty()){
            subSequences.add(output);
            return;
        }
        helper1(input.substring(1), output, subSequences);
        helper1(input.substring(1), output + input.charAt(0), subSequences);
    }
    public static ArrayList<String> findSubSequence1(String str){
        ArrayList<String> subSequence = new ArrayList<>();
        helper1(str, "", subSequence);
        return subSequence;
    }
    public static void main(String[] args) {

        ArrayList<String> result1 = findSubSequence1("abc");
        System.out.println(result1);

        ArrayList<String> result2 = findSubSequence2("abc");
        System.out.println(result2);
    }
}
