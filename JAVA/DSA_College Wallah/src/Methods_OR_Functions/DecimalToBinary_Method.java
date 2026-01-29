package Methods_OR_Functions;
import java.util.*;
public class DecimalToBinary_Method {
    static int decToBin(int decNum){
        int powOf10 = 0;
        int binNum = 0;
        while (decNum>0){
            int rem = decNum % 2;
            binNum += (rem * Math.pow(10,powOf10));
            powOf10++;
            decNum /= 2;
        }
        return binNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter decimal Number : ");
        int deciNum = sc.nextInt();

        System.out.print("Binary Number of "+deciNum+" : "+decToBin(deciNum));

    }
}
