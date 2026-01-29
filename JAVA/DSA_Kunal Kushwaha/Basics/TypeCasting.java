package Basics;

public class TypeCasting {
    public static void main(String[] args) {

        int num = (int)(65.99);

        System.out.println(num);

        int a = 257;
        byte b1 = (byte)(a);
        // The result is 1 because byte can store a number till 256
        System.out.println(b1);

        int number = 'a';
        System.out.println(number);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 5000;
        float f = 5.888f;
        double d = 0.37377;
        double result = (f*b)+(i/c)-(d*s);

        System.out.println((f*b)+" "+(i/c)+" "+(d*s));
        System.out.println(result);

        int count = 1;
        while (count != 5){
            System.out.println(count);
            count++;
        }
    }
}
