package Loops;
import java.util.Scanner;
public class Sum_of_Series_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Question : Find sum => 1-2+3-4+5-6
        System.out.print("Enter nth number till you want sum : ");
        int num = sc.nextInt();
        int sum = 0;

//        for (int i=1 ; i<=num ; i++){
//            if(num%2==0) sum = -num/2;
//            else sum = (num/2)+1;
//        }
//        System.out.println("The sum of series is : "+sum);

        //2nd Method
        for(int i=1 ; i<=num ; i++){
            if(i%2==0) sum = sum + (-i);
            else sum = sum + i;
        }
        System.out.println("The sum of series is : "+sum);
    }
}
