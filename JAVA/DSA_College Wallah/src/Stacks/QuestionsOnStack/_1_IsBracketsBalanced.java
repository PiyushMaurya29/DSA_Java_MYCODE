package Stacks.QuestionsOnStack;
import java.util.*;
public class _1_IsBracketsBalanced {
    public static boolean isBalanced1(String str){
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for(int i=0 ; i<n ; i++){
            char ch = str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }else{ // ch == ')'
                if(st.isEmpty()) return false; //OR st.size()==0
                if(st.peek()=='(') st.pop();
            }
        }
        if(st.isEmpty()!=true) return false; // OR st.size()>0
        return true;
    }
    public static boolean isBalanced2(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            if(ch==')' && st.isEmpty()) return false;
            else if(ch=='(') st.push(ch);
            else if(ch==')' && st.peek()=='(') st.pop();
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        // Q. Check whether a given bracket sequence is balanced or not
        /*
            Sequence is balanced if the inner sequences of string is also balanced
            Examples : * str = "()(())" True
                       * str = "(()()(" False
                       * str = "(()())" True
                       * str = "(())())" False
                       * str = ")()())" False
         */
        /*
            Rules :-
            1> Opening ( -> Push
            2> Closing )
                a> If stack top contains ( -> Pop opening bracket
                b> If stack is empty -> Return false

            At the end : If the stack is empty , sequence is balanced
         */

        String str = "()((()";

        System.out.println(isBalanced1(str));
        System.out.println(isBalanced2(str));

    }
}
