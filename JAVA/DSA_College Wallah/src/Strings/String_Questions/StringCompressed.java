package Strings.String_Questions;

public class StringCompressed {
    static String compressString(String str){
        int n = str.length();
        String ans = "" + str.charAt(0);
        int count = 1;
        for(int i=1 ; i<n ; i++){
            char currChar = str.charAt(i);
            char prevChar = str.charAt(i-1);
            if(currChar == prevChar){
                count++;
            }
            else{
                if(count>1) ans += count;
                count = 1;
                ans += currChar;
            }
        }
        if(count>1) ans += count;
        return ans;
    }
    public static void main(String[] args) {

        String str = "aaabbbbcdddeee";
        /*
            Input = "aaabbbbccddde";
            Output = a3b4c2d3e
         */

        System.out.println(compressString(str));

    }
}
