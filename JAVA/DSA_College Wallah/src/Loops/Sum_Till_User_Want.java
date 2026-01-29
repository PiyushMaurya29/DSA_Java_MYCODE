package Loops;
import java.util.Scanner;
public class Sum_Till_User_Want {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;

//        while(num!=-1){
//            sum += num;
//            num = sc.nextInt();
//        }
        //Using break Statement
        while (true){
            sum += num;
            num = sc.nextInt();
            if(num==-1) break;
        }
        System.out.println(sum);
    }
}
