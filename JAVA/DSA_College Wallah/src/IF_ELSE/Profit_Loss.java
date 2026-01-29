package IF_ELSE;
import java.util.Scanner;
public class Profit_Loss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double CP , SP , Profit , Loss ;
        System.out.print("Enter CP of item : ");
        CP = sc.nextDouble();
        System.out.print("Enter SP of item : ");
        SP = sc.nextDouble();

        Profit = SP - CP;
        Loss = CP - SP;
        if(SP==CP)
            System.out.println("NO profit NO Loss");
        else if(SP>CP)
            System.out.println("The Profit on item is "+Profit);
        else
            System.out.println("The Loss on item is "+Loss);
    }
}
