package String_Builder;

import java.util.Scanner;

public class ToggleStringBuilder {
    static java.lang.StringBuilder toggleStringBuilder(java.lang.StringBuilder str){
        int n = str.length();
        for(int i=0 ; i<n ; i++){
            char currChar = str.charAt(i);
            if(currChar == ' '){
                str.setCharAt(i,' ');
            }
            else if(currChar >= 'a' && currChar <= 'z'){
                str.setCharAt(i,(char)(str.charAt(i)-32));
            }
            else if(currChar >= 'A' && currChar <= 'Z'){
                str.setCharAt(i,(char)(str.charAt(i)+32));
            }
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        java.lang.StringBuilder str = new java.lang.StringBuilder(sc.nextLine());

        System.out.println("Before Toggle : "+str);
        System.out.println("After Toggle : "+toggleStringBuilder(str));
    }
}
