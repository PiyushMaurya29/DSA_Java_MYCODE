package Stacks.QuestionsOnStack;
import java.util.Stack;
public class _2_MinBracketRemoval {
    public static int minRemovals(String bracketSequence) {
        Stack<Integer> stack = new Stack<>();
        int removals = 0;

        for (int i = 0; i < bracketSequence.length(); i++) {
            char currentChar = bracketSequence.charAt(i);

            if (currentChar == '(') {
                stack.push(i);  // Push the index of the opening bracket
            } else if (currentChar == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();  // Matched a closing bracket with an opening bracket
                } else {
                    removals++;   // Unmatched closing bracket, need to remove
                }
            }
        }

        // Any remaining opening brackets are unmatched and need to be removed
        removals += stack.size();

        return removals;
    }
    static int minRemovals2(String str){
        int n = str.length();
        Stack<Character> st = new Stack<>();
        for(int i=0 ; i<n ; i++){
            char ch = str.charAt(i);
            if(ch=='(') st.push(ch);
            else{
                if(st.isEmpty()) st.push(ch);
                else if(st.peek()==')') st.push(ch);
                else if(st.peek()=='(') st.pop();
            }
        }
        return st.size();
    }
    public static void main(String[] args) {
        /*
           Find the minimum number of brackets that we need to remove to make the
           given bracket sequence balanced
         */
        String bracketSequence = ")(())()";
        int result = minRemovals(bracketSequence);
        System.out.println("Minimum number of bracket removals: " + result);
        String str = ")(())()";
        System.out.println("Minimum number of bracket removals: "+ minRemovals2(str));
    }
}
