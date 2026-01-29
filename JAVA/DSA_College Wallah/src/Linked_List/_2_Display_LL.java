package Linked_List;
import java.util.*;
public class _2_Display_LL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void displayLinkedList(Node head){
        Node temp = head;
        // We make temp so that head of Node always point firstNode
        // Tail of LL points to null
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    static void displayLLReverseRecursively(Node head){
        if(head == null) return;
        displayLLReverseRecursively(head.next);
        System.out.print(head.data+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Displaying a Linked List

        Node a = new Node(4);
        Node b = new Node(6);
        Node c = new Node(9);
        Node d = new Node(1);
        Node e = new Node(12);
        Node f = new Node(16);

        // Linking each node with the next node
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        // Pointing temp Node to a
//        Node temp = a;
        // Using for loop not efficient because knowing size is compulsory in for loop
//        for(int i=1 ; i<=6 ; i++){
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }

        displayLinkedList(a);
        System.out.println();
        displayLLReverseRecursively(a);

    }
}
