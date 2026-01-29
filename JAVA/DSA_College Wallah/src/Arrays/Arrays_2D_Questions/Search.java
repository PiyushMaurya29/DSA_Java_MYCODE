package Arrays.Arrays_2D_Questions;
import java.util.*;
public class Search {
    static int[] search(int arr[][] , int target){
        for(int row=0 ; row<arr.length ; row++){
            for(int col=0 ; col<arr[row].length ; col++){
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = {
                {1,2,45,778},
                {42,12,34,97},
                {11,45,87,987},
                {23,29,345,266}
        };
        int target = 987;
        int ans[] = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
}
