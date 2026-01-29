package Queues;
import java.util.*;
public class Print_Queue {
    public static void displayQueue(Queue<Integer> q){
        Queue<Integer> temp = new LinkedList<>();
        while (q.size()>0){
            System.out.print(q.peek()+" "); // Print front element of queue
            temp.add(q.remove()); // Or q.poll();
        }
        while (temp.size()>0){
            q.add(temp.remove()); // Or temp.poll();
        }
        System.out.println();
    }
    public static void main(String[] args) {

        /*
           Print all the elements present in given queue
           only using add() , remove() , size() and extra queue
         */

        Queue<Integer> q = new LinkedList<>();
        q.add(5);
        q.add(8);
        q.add(7);
        q.add(9);
        q.add(0);
        q.add(1);

        //  rear -> 1 0 9 7 8 5 <- front

        displayQueue(q);
        System.out.println(q);

    }
}
