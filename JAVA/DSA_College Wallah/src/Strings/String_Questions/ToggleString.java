package Strings.String_Questions;

import java.util.Scanner;

public class ToggleString {
    static String toggleString(String str){
        int n = str.length();
        String ans = "";
        for(int i=0 ; i<n ; i++){
            char currChar = str.charAt(i);
            if(currChar == ' '){
                ans += ' ';
            }
            else if(currChar >= 'a' && currChar <= 'z'){
                ans += (char)(currChar-32);
            }
            else if(currChar >= 'A' && currChar <= 'Z'){
                ans += (char)(currChar+32);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println("String before Toggle : "+str);
        String ans = toggleString(str);
        System.out.println("String after Toggle : "+ans);
    }
}
