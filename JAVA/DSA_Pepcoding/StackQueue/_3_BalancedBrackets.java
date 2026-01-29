package StackQueue;

import java.util.Stack;

public class _3_BalancedBrackets {
    public static boolean isBalanced(String str){
        int n = str.length();
        Stack<Character> st = new Stack<>();
        for(int i=0 ; i<n ; i++){
            char ch = str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else if(ch==')'){
                handleClosing(st, '(');
            }
            else if(ch=='}'){
                handleClosing(st, '{');
            }
            else if(ch==']'){
                handleClosing(st, '[');
            }
        }
        return true;
    }
    public static boolean handleClosing(Stack<Character> st, char corrOpenChar){
        if(st.isEmpty()) return false;
        else if(st.peek() != corrOpenChar) return false;
        else{
            st.pop();
            return true;
        }
    }
    public static boolean isBalanced2(String str){
        int n = str.length();
        Stack<Character> st = new Stack<>();
        for(int i=0 ; i<n ; i++){
            char ch = str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[') st.push(ch);
            else if(ch==')'){
                if(st.isEmpty() || st.peek()!='(') return false;
                st.pop();
            }
            else if(ch=='}'){
                if(st.isEmpty() || st.peek()!='{') return false;
                st.pop();
            }
            else if(ch==']'){
                if(st.isEmpty() || st.peek()!='[') return false;
                st.pop();
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        /*
            [(a+b)+{(c+d)*(e/f)}] => True
            [(a+b)+{(c+d)*(e/f)]} => False
            [(a+b)+{(c+d)*(e/f)}  => False
            ([(a+b)+{(c+d)*(e/f)}] => False
            (a+b)] => False
            [(a+b) => False
         */
        String str = "([(a+b)+{(c+d)*(e/f)}]";
        System.out.println(isBalanced(str));
        System.out.println(isBalanced2(str));
    }
}
