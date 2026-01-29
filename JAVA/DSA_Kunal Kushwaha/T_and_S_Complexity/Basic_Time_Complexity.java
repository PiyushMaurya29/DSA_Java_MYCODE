package T_and_S_Complexity;

public class Basic_Time_Complexity {
    public static void main(String[] args) {

        /*
            Time Complexity != Time taken

            Function that gives us the relationship about how the
            time will grow as the input grows is called TC

            Comparison b/w constant , linear and binarySearch
            O(1) < O(logN) < O(N)

            //Q. What do we consider when thinking about complexity :-
            * Always look for worst case TC and SC
            * Always look at complexity for large/infinite data
            * Always ignore less dominating terms

            O(1) < O(logN) < O(N) < O(N*logN) < O(2^N)

            * The worst TC gives the Upper Bound . It means TC never exceed to UB it may be less than that


           # Big Omega (Best TC) : Opposite of Big O Notation
           * Big Omega is the lower bound

           # Theta Notation (Average TC)
         */

        /*
                 Recursive Algorithms :-
             * The space complexity of recursive tree is O(N) , where N is height of tree

             Two types of recursion :-
             1. Linear : F(n) = F(n-1) + F(n-2) // For fibonacci series
             2. Divide and conquer : F(n) = F(n/2) + O(1)
         */

        /*
              Akra Bazzi :-

             T(x) = Theta( x^p + x^p * IntegrationOf(g(x)/x^p+1) with limits 1 to x dx)

             What is P ?
             a1*b1^p + a2*b2^p + a3*b3^p + a4*b4^p ...... = 1
         */
    }
}
