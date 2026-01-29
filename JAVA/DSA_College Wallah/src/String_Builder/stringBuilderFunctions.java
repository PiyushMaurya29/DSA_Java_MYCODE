package String_Builder;
import java.util.*;
import java.lang.StringBuilder;
public class stringBuilderFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder str = new StringBuilder("hello");
        System.out.println(str);

        // .setCharAt is used to change a character in a string
        str.setCharAt(0,'m');
        System.out.println(str);

        //.append is used to add any character
        System.out.println(str.append(true));
        System.out.println(str.append(100));

        //.insert is used to insert character at a particular index
        System.out.println(str.insert(9,'z'));

        // .delete is used to delete element at index given
        System.out.println(str.deleteCharAt(10)); //delete index
        System.out.println(str.delete(10,12));

        // .reverse() and delete(i,j) an array
        str.reverse();
        System.out.println(str);

        // to print substring of string
        System.out.println(str.substring(4));
        System.out.println(str.substring(0,5));


    }
}
