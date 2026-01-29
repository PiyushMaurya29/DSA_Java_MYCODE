import java.util.*;
public class _1A_temp {
    static int count = 1;
    static void fun(){
        if(count == 5) return;
        System.out.println(count);
        count++;
        fun();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        fun();
        System.out.println(count);

    }
}
