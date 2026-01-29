package HashMap;

import java.util.HashMap;

public class _2_Question_MaxFreq {

    public static void main(String[] args) {
        /*
               Q. Given an array, find the most frequent element in it
               If there are multiple elements that appear a maximum number of times
               Print any of them

               Input :
               n = 6
               arr[] = {1, 3, 2, 1, 4, 1}
               Output : 1
         */

        int arr[] = {1, 4, 2, 5, 1, 4, 4, 6, 4, 4, 4, 6, 2, 2};
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int ele : arr){
            if(!freq.containsKey(ele)){ // if element not exist
                freq.put(ele,1);
            }else{
                freq.put(ele,freq.get(ele)+1);
            }
        }
        System.out.print("Frequency Map : ");
        System.out.println(freq.entrySet());

        int maxFreq = 0, ansKey = -1;

        // 1st way => EntrySet traversing
        for(var e : freq.entrySet()){
            if(e.getValue() > maxFreq){
                maxFreq = e.getValue();
                ansKey = e.getKey();
            }
        }
        // 2nd way => KeySet traversing
        for(var key : freq.keySet()){
            if(freq.get(key) > maxFreq){
                maxFreq = freq.get(key);
                ansKey = key;
            }
        }
        System.out.printf("%d has max frequency and it occurs %d times",ansKey, maxFreq);
    }
}
