import java.util.HashMap;

public class _3_GetCommonEle {
    public static void printCommonElements1(int[] a, int[] b){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int key : a){
            if(map.containsKey(key)){
                map.put(key, map.get(key)+1);
            }
            else map.put(key, 1);
        }
        for(var key : b){
            if(map.containsKey(key)){
                System.out.print(key+" ");
                map.remove(key);
            }
        }
    }
    public static void printCommonElements2(int[] a, int[] b){
        // Giving wrong answer
        HashMap<Integer, Integer> map = new HashMap<>();
        for(var key : a){
            if(map.containsKey(key)) map.put(key, map.get(key)+1);
            else map.put(key, 1);
        }
        for(int key : b){
            if(map.containsKey(key) && map.get(key) > 0){
                System.out.print(key+" ");
                map.put(key, map.get(key)-1);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 2, 2, 3, 5};
        int[] arr2 = {1, 1, 1, 2, 2, 4, 5};

        printCommonElements1(arr1, arr2); // Contains Unique
        printCommonElements2(arr1, arr2); // Contains All elements

    }
}
