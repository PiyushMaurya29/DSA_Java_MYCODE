package Recursion_And_BackTracking;

import java.util.Scanner;

public class _5_TowerOfHanoi {
    static void towerOfHanoi(int n, int t1id, int t2id, int t3id){
        if(n == 0) return;
        // will print the instructions to move n-1 disks from t1 t3 using t2
        towerOfHanoi(n-1, t1id, t3id, t2id);
        System.out.println(n+"["+t1id+" -> "+t2id+"]");
        towerOfHanoi(n-1, t3id, t2id, t1id);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
                Tower Of Hanoi
                # Print the instructions to move the disks.
                # From tower 1 to tower 2 using tower 3

                Rules :-
                # Move one disk at a time
                # Never place a smaller disk under a larger disk
                # You can only move a disk at the top
         */
        System.out.print("Enter number of disks : "); //3
        int n = sc.nextInt();
        System.out.println("Enter tower names : "); // 10 11 12
        int t1d = sc.nextInt(); // tower 1 source
        int t2d = sc.nextInt(); // tower 2 destination
        int t3d = sc.nextInt(); // tower 3 helper

        towerOfHanoi(n, t1d, t2d, t3d);
    }
}
