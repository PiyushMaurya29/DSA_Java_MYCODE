package Strings.String_Questions;
import java.util.*;
public class FindShortestPath {
    static double calculateShortestPath(String path){
        int x = 0 , y = 0;
        for(int i=0 ; i<path.length() ; i++){
            char dir = path.charAt(i);
            //South
            if(dir=='S') y--;
            //North
            if(dir=='N') y++;
            //West
            if(dir=='W') x--;
            //East
            if(dir=='E') x++;
        }
        double X2 = x*x;
        double Y2 = y*y;
        return Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Given a route containing 4 directions (E,W,N,S)
           Find the shortest path to reach destination.

           Logic : *for North y = y + 1
                   *for South y = y - 1
                   *for West  x = x - 1
                   *for East  x = x + 1
         */

        String path = "WNEENESENNN";
        System.out.println(calculateShortestPath(path));
    }
}
