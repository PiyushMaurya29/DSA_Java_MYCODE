package Queues;
import java.util.*;
public class Array_Implementation_Of_Queue {
    public static class QueueArray{
        int f = -1; // front of queue
        int r = -1; // rear of queue
        int arr[] = new int[100];
        int size = 0;
        void add(int val){
            if(r==arr.length-1){
                System.out.println("Queue is Full!");
                return;
            }
            if(f==-1){
                f = r = 0;
                arr[0] = val;
            }
            else {
                arr[r+1] = val; // Or write arr[r++] directly
                r++;
            }
            size++;
        }
        int remove(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return -1;
            }
            int x = arr[f];
            f++;
            size--;
            return x; // Or return arr[f-1]
        }
        int peek(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return -1;
            }
            return arr[f];
        }
        void display(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return;
            }
            for(int i=f ; i<=r ; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        boolean isEmpty(){
            if(size==0) return true;
            return false;
        }
    }
    public static void main(String[] args) {

        /*
           Elements enter from rear and gets out from front
         */

        QueueArray q = new QueueArray();
        q.display();
        q.add(4);
        q.add(7);
        q.add(9);
        System.out.println(q.peek());
        System.out.println(q.remove());
        q.add(2);
        q.add(5);
        q.display();
        System.out.println(q.size);


    }
}
