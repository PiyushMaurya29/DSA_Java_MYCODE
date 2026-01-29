package Linked_List;
import java.util.*;
public class _1_Basic_LinkedList {
    public static class Node{
        int data;  // Value
        Node next; // Address of next Node
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        /*
              Array Limitations
            # Fixed Size
            # Continuous Memory
            # Insertion in between
         */

        // Creating new Nodes
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        Node f = new Node(12);

        // Connecting each Node with the next Node
        // 5 -> 3 -> 9 -> 8 -> 16 -> 12
        a.next = b; // 5 -> 3 9 8 16 12
        b.next = c; // 5 -> 3 -> 9 8 16 12
        // Or a.next.next = c;
        c.next = d; // 5 -> 3 -> 9 -> 8 16 12
        // Or a.next.next.next = d;
        d.next = e; // 5 -> 3 -> 9 -> 8 -> 16 12
        e.next = f; // 5 -> 3 -> 9 -> 8 -> 16 -> 12

        // Printing Nodes Normally
        System.out.println(a.data);
        System.out.println(b.data);
        System.out.println(c.data);
        System.out.println(d.data);
        System.out.println(e.data);
        System.out.println(f.data);

        System.out.println();
        // Printing each data using first Node means Node a
        System.out.println(a.data);  // a = 5
        System.out.println(a.next.data); // b = 3
        System.out.println(a.next.next.data); // c = 9
        System.out.println(a.next.next.next.data); // d = 8
        System.out.println(a.next.next.next.next.data); // e = 16
        System.out.println(a.next.next.next.next.next.data); // f = 12



    }
}
