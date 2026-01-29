package Leet_Code.BinarySearch;
//Q. https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class Smallest_Letter {
    public static char nextGreatestLetter(char letters[] , char target){

        int start = 0 , end = letters.length-1;
        while (start<=end){
            int mid = start + (end - start)/2;

            if(letters[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        // return the index of smallest number >= target
        return letters[start%letters.length];
    }
    public static void main(String[] args) {

        char letters[] = {'c','f','j'};
        char target = 'a';

        System.out.println(nextGreatestLetter(letters,target));
    }
}
