package OOPS_JAVA.Questions;

import java.sql.Array;
import java.util.Arrays;

public class _2_MakeArrayList {
    public static class ArrayList{
        int arr[] = new int[2];
        int idx = 0;
        int size = 0;
        public void add(int ele){
            if(size == arr.length){
                int brr[] = Arrays.copyOf(arr,arr.length*2);
//                arr = new int[brr.length];
//                arr = Arrays.copyOf(brr,brr.length);
                arr = brr;
            }
            arr[idx++] = ele;
            size++;
        }
        public int size(){
            return idx+1;
        }
        public void set(int idx, int val){
            arr[idx] = val;
        }
    }
    public static void main(String[] args) {

        ArrayList arr = new ArrayList();
        arr.add(2);
        arr.add(10);
        arr.add(4);
        arr.add(6);
        arr.add(5);
        arr.add(12);
        System.out.println(arr.size);

        arr.set(0,100);

    }
}
