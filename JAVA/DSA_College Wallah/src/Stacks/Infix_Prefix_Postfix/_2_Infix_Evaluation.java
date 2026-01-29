package Stacks.Infix_Prefix_Postfix;

import java.util.Stack;

public class _2_Infix_Evaluation {
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        Stack<Integer> val = new Stack<>(); // Value stack
        Stack<Character> op = new Stack<>(); // Character Stack
        for(int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            int ascii = (int)ch; // Computing ascii value of characters
            // '0'->48 , '9'->57
            if(ascii>=48 && ascii<=57){
                val.push(ascii-48);
            }
            else if(op.size()==0 || ch=='(' || op.peek()=='('){
                op.push(ch);
            }
            else if(ch==')'){
                while (op.peek() != '('){
                    // work
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if(op.peek()=='+'){
                        val.push(v1+v2);
                    }
                    else if(op.peek()=='-'){
                        val.push(v1-v2);
                    }
                    else if(op.peek()=='*'){
                        val.push(v1*v2);
                    }
                    else if(op.peek()=='/'){
                        val.push(v1/v2);
                    }
                    op.pop();
                }
                op.pop(); // '(' Removal
            }
            else{
                if(ch=='+' || ch=='-'){
                    // work
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if(op.peek()=='+'){
                        val.push(v1+v2);
                    }
                    else if(op.peek()=='-'){
                        val.push(v1-v2);
                    }
                    else if(op.peek()=='*'){
                        val.push(v1*v2);
                    }
                    else if(op.peek()=='/'){
                        val.push(v1/v2);
                    }
                    op.pop();
                    // Push the character
                    op.push(ch);
                }
                if(ch=='*' || ch=='/'){
                    if(op.peek()=='*' || op.peek()=='/'){
                        // work
                        int v2 = val.pop();
                        int v1 = val.pop();
                        // We can remove Addition and Subtraction because not fall int this category
//                        if(op.peek()=='+'){
//                            val.push(v1+v2);
//                        }
//                        else if(op.peek()=='-'){
//                            val.push(v1-v2);
//                        }
                        if(op.peek()=='*'){
                            val.push(v1*v2);
                        }
                        else if(op.peek()=='/'){
                            val.push(v1/v2);
                        }
                        op.pop();
                        // Push the character
                        op.push(ch);
                    }
                    else{
                        op.push(ch);
                    }
                }
            }
        }
        while(val.size()>1){
            int v2 = val.pop();
            int v1 = val.pop();
            if(op.peek()=='+'){
                val.push(v1+v2);
            }
            else if(op.peek()=='-'){
                val.push(v1-v2);
            }
            else if(op.peek()=='*'){
                val.push(v1*v2);
            }
            else if(op.peek()=='/'){
                val.push(v1/v2);
            }
            op.pop();
        }
        System.out.println("Answer : "+val.peek());
    }
}
