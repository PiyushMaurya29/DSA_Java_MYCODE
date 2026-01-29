package Strings;
import java.util.*;
public class Interning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "Hello";
        String gtr = "Hello";
        // both str and gtr string will point to same memory location in heap memory and point same address in stack memory

        int arr[] = {1,2,3,4};
        int brr[] = {1,2,3,4};
        arr[3] = 44;
        System.out.println(brr[3]);

    }
}
