package Methods_OR_Functions;
import java.util.*;
public class BinaryToDecimal_Method {
    static int binToDec(int binNum){
        int powOf2 = 0;
        int decNum = 0;
        while (binNum>0){
            int lastDigit = binNum % 10;
            decNum += (lastDigit * Math.pow(2,powOf2));
            // Or use powOf2 = 1 and multiply it everyIteration with 2
            powOf2++;
            binNum /= 10;
        }
        return decNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter binary Number : ");
        int binNum = sc.nextInt();

        System.out.println("Decimal Number of "+binNum+" : "+binToDec(binNum));
    }
}
