package StackQueue;

import java.util.Stack;

public class _2_DuplicateBracket {
    public static boolean isDuplicate(String str){
        int n = str.length();
        Stack<Character> st = new Stack<>();
        for(int i=0 ; i<n ; i++){
            char ch = str.charAt(i);
            if(ch == ')'){
                if(st.peek() == '(') return true;
                else{
                    while (st.peek() != '(') st.pop();
                    st.pop();
                }
            }
            else st.push(ch);
        }
        return false;
    }
    public static boolean isDuplicate2(String str){ // Self Written
        int n = str.length();
        Stack<Character> st = new Stack<>();
        for(int i=0 ; i<n ; i++){
            char ch = str.charAt(i);
            if(ch==')'){
                if(!st.isEmpty() && st.peek()=='(') return true;
                while(!st.isEmpty() && st.peek() != '(') st.pop();
                if(!st.isEmpty()) st.pop();
            }
            else st.push(ch);
        }
        return false;
    }
    public static void main(String[] args) {
        /*
            Example :
            ((a+b)+(c+d)) -> False
            (a+b)+((c+d)) -> True
         */
        String str = "(a+b)+((c+d))";
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate2(str));
    }
}
