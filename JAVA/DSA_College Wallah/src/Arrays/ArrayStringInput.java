package Arrays;
import java.util.*;
public class ArrayStringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        String str[] = new String[n];

        System.out.println("Enter "+n+" strings of array : ");
        for(int i=0 ; i<str.length ; i++){
            str[i] = sc.next();
        }

        str[1] = "Hey Raghav";

        System.out.println(Arrays.toString(str));
        for(int i=0 ; i<str.length ; i++){
            System.out.print(str[i]+" ,");
        }
    }
}
