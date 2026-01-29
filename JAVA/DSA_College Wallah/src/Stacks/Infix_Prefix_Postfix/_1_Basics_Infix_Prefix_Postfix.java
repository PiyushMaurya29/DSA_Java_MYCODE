package Stacks.Infix_Prefix_Postfix;

public class _1_Basics_Infix_Prefix_Postfix {
    public static void main(String[] args) {
        /*
            Precedence/Priority Order
            / , * > + , -
         */
        /*
            Steps for evaluation using 2 stack one is for value and second for operators
            * Put value in stack for values directly
            * If operator stack is empty insert operator directly
            * If operator stack is non-empty enter value of operator but first think
            * If priority of operator already present on top of stack is grater than or equal
              >= to the operator entering . Then first solve the already present operator with
              two values
         */

        /*
          Infix = a + b
          Prefix = +ab
          Postfix = ab+
         */
        /*
          Convert this in prefix and postfix
          "9 - 5 + 3 * 4 / 6"
         */

    }
}
