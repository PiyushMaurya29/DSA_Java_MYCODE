package Function_OR_Methods_Java;

public class Shadowing {
    static int x = 100; // This will be shadowed at line 11
    static void fun(){
        System.out.println(x);
    }
    public static void main(String[] args) {
        System.out.println(x); // 100
        int x = 50;
        System.out.println(x); // 50
        fun();

    }
}
