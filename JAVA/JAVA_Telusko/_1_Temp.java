import java.util.*;
class Complex{
    int a, b;
    public Complex(int a, int b){
        this.a = a;
        this.b = b;
    }
    Complex add(Complex c2){
        return new Complex(a+c2.a, b+c2.b);
    }
    void printComplex(){
        System.out.println(a+"+"+b+"i");
    }

}
public class _1_Temp {
    public static void main(String[] args) {
        Complex c1 = new Complex(5, 3);
        c1.printComplex();
        Complex c2 = new Complex(3, 2);
        c2.printComplex();
        Complex c3 = c1.add(c2);
        c3.printComplex();
    }
}
