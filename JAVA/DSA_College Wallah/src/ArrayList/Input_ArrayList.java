package ArrayList;
import java.util.*;
public class Input_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter size of ArrayList : ");
        int n = sc.nextInt();

        System.out.println("Enter elements of ArrayList : ");
        // Taking Input
        for(int i=0 ; i<n ; i++){
            list.add(sc.nextInt());
        }

        // Printing ArrayList
        for(int i=0 ; i<n ; i++){
            System.out.print(list.get(i)+" ");
        }
        // Printing using print statement
        System.out.println();
        System.out.println(list);

        System.out.println(list.get(1));
    }
}
