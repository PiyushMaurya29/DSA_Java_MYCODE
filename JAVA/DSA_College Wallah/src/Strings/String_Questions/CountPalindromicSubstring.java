package Strings.String_Questions;

public class CountPalindromicSubstring {
    static boolean isPalindrome(String str){
        int n = str.length();
        for(int i=0 ; i<n/2 ; i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    static boolean isPalindrome2(String str){
        int n = str.length();
        int s=0, e=n-1;
        while (s < e){
            if(str.charAt(s) != str.charAt(e)) return false;
            s++;
            e--;
        }
        return true;
    }
    static int countPalindromicSubString(String str){
        int count = 0;
        for(int i=0 ; i<str.length() ; i++){
            for(int j=i+1 ; j<str.length()+1 ; j++){
                String sub = str.substring(i,j);
                if(isPalindrome2(sub)){
                    System.out.print(str.substring(i,j)+" ");
                    count++;
                }
            }
        }
        System.out.println();
        return count;
    }
    public static void main(String[] args) {

        String str = "abcba";
        System.out.println(countPalindromicSubString(str));

    }
}
