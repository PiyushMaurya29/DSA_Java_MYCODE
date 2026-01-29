package Recursion;

public class _2_StringPalindrome {
    public static boolean isPalindrome(String str, int s, int e){
        if(s >= e) return true;
        if(str.charAt(s) != str.charAt(e)) return false;
        return isPalindrome(str, s+1, e-1);
    }
    public static boolean isPalindrome2(String str, int idx){
        if(idx > str.length()/2) return true;
        if(str.charAt(idx) != str.charAt(str.length()-idx-1)) return false;
        return isPalindrome2(str, idx+1);
    }
    public static void main(String[] args) {
        String str = "madam";
        // TC and SC = O(n/2)
        System.out.println(isPalindrome(str, 0, str.length()-1));
        System.out.println(isPalindrome2(str, 0));
    }
}
