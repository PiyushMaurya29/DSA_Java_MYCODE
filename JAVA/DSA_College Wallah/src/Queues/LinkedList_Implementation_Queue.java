package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedList_Implementation_Queue {
    public static class Node{ // User defined data type
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }

    }
    public static class Queue_LinkedList{
        Node head = null;
        Node tail = null;
        int size = 0;
        void add(int x){
            Node temp = new Node(x);
            if(size==0){
                head = tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        int peek(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return -1;
            }
            return head.val;
        }
        int remove(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return -1;
            }
            int x = head .val;
            head = head.next;
            size--;
            return x;
        }
        void display(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return;
            }
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
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
           Advantages of Linked List Implementation of queue over
           array implementation :
           1. Unlimited Size
           2. LL works like a queue

           Disadvantages :
           1. Size : LL has two members(Value,address of next Node)
         */
        Queue_LinkedList q = new Queue_LinkedList();
        System.out.println(q.isEmpty());
        q.display();
        q.add(4);
        q.add(6);
        q.add(8);
        q.add(12);
        q.add(45);
        q.display();
        System.out.println(q.peek());
        System.out.println(q.remove());
        q.display();
        System.out.println(q.isEmpty());
        System.out.println(q.size);

    }
}
