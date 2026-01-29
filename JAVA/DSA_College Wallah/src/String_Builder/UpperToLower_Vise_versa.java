package String_Builder;
import java.util.*;
import java.lang.StringBuilder;
public class UpperToLower_Vise_versa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Q. Given a string , the task is to toggle all the characters of
        the string i.e. to convert Upper case to Lower case and vise versa
        Input : Physics
        Output : pHYSICS
        ASCII Values : A->65  , a->97 , 0->48
        Difference b/w small and capital alphabet is 32 of same value
         */

        System.out.print("Enter String : ");
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);

        // toggle
        // PHysiCs -> phYSIcS

        for(int i=0 ; i<str.length() ; i++){
            // P -> p
            // check -> alphabet - small , capital
            boolean flag = true;  // true -> capital
            char ch = str.charAt(i);
            if(ch==' ') continue;
            int ascii = (int)ch;
            if(ascii>=97) flag = false; // false -> small
            if(flag == true){  // capital
                ascii += 32;
                char dh = (char)ascii;
                str.setCharAt(i,dh);
            }
            else{ // small
                ascii -= 32;
                char dh = (char)ascii;
                str.setCharAt(i,dh);
            }
        }

        System.out.println("Toggled String : "+str);

        //When we have given a normal string

        System.out.print("Enter second string : ");
        String gtr = sc.nextLine();
        for(int i=0 ; i<gtr.length() ; i++){
            // P -> p
            // check -> alphabet - small , capital
            boolean flag = true;  // true -> capital
            char ch = gtr.charAt(i);
            if(ch==' ') continue;
            int ascii = (int)ch;
            if(ascii>=97) flag = false; // false -> small
            if(flag == true){  // capital
                ascii += 32;
                char dh = (char)ascii;
                gtr = gtr.substring(0,i) + dh + gtr.substring(i+1);
            }
            else{ // small
                ascii -= 32;
                char dh = (char)ascii;
                gtr = gtr.substring(0,i) + dh + gtr.substring(i+1);
            }
        }
        System.out.println("Toggled gtr string : "+gtr);
    }
}
