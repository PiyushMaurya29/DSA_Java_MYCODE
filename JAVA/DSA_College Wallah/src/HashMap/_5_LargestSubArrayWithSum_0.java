package HashMap;

import java.util.HashMap;

public class _5_LargestSubArrayWithSum_0 {
    public static int largestSubArrayLengthWithSum_0(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0, prefixSum = 0;
        map.put(0, -1);
        for(int i=0 ; i<arr.length ; i++){
            prefixSum += arr[i];
            if(map.containsKey(prefixSum)){
                maxLen = Math.max(maxLen, i-map.get(prefixSum));
            }
            else map.put(prefixSum, i);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr = {15,-2,2,-8,1,7,10,23};
        System.out.println(largestSubArrayLengthWithSum_0(arr));
    }
}
