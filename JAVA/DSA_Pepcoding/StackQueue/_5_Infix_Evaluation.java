package StackQueue;

import java.util.Stack;

public class _5_Infix_Evaluation {
    public static int precedence(char operator){
        if(operator == '+') return 1;
        else if(operator == '-') return 1;
        else if(operator == '*') return 2;
        else return 2;
    }
    public static int operation(int v1, int v2, char operator){
        if(operator == '+') return v1 + v2;
        else if(operator == '-') return v1 - v2;
        else if(operator == '*') return v1 * v2;
        else return v1 / v2;
    }
    public static int prefixEvaluate(String str){
        Stack<Integer> operand = new Stack<>();
        Stack<Character> operators = new Stack<>();
        for(int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            if(ch=='('){
                operators.push(ch);
            }
            else if(Character.isDigit(ch)){
                operand.push(ch-'0'); // Give integer of that character
            }else if(ch==')'){
                while(operators.peek() != '('){
                    char op = operators.pop();
                    int v2 = operand.pop();
                    int v1 = operand.pop();
                    int opOut = operation(v1, v2, op);
                    operand.push(opOut);
                }
                operators.pop();
            }
            else if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                while (operators.size()>0 && operators.peek() != '('
                    && precedence(ch) <= precedence(operators.peek())){
                    char op = operators.pop();
                    int v2 = operand.pop();
                    int v1 = operand.pop();

                    int opOut = operation(v1, v2, op);
                    operand.push(opOut);
                }
                operators.push(ch);
            }
        }
        while (operators.size() != 0){
            char op = operators.pop();
            int v2 = operand.pop();
            int v1 = operand.pop();
            int opOut = operation(v1, v2, op);
            operand.push(opOut);
        }
        return operand.pop();
    }
    public static void main(String[] args) {
        /*
            Infix => a * b + c / d
            Precedence => * and / > + and -

            Steps :-
            1. Operand => Push in operand Stack
            2. ( => Push in operator Stack
            3. ) => Pop till we get )
            4. Operator => If lees priority operator come more priority task will perform first
               For Example => If - come on top of * . * function will perform first
               For Example => - will pop * and + both
         */

        String exp = "2+3/4-(5*6)";
        System.out.println(prefixEvaluate(exp));

    }
}
