package Strings.String_Questions;

import java.util.Scanner;
public class ReverseEachWordInString {
    static String reverseEachWord(String str){
        int n = str.length();
        String ans = "";
        StringBuilder sb = new StringBuilder("");
        for(int i=0 ; i<n ; i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                sb.append(ch);
            }
            else{
                sb.reverse();
                ans += sb;
                ans += " ";
//            sb.delete(0,sb.length()); Or
                sb = new StringBuilder("");
            }
        }
        // We are doing this because of the last word of String
        sb.reverse();
        ans += sb;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = sc.nextLine();

        System.out.println(str);
        String ans = reverseEachWord(str);
        System.out.println(ans);

    }
}
