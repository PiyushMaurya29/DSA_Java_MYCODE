package Linked_List;
import java.util.*;
public class _3_LengthOf_LL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static int findLengthOfLL(Node head){
        int count = 0;
        while (head != null){
            count++;
            head = head.next;
        }
        return count;
    }
    public static int findLengthOfLLRecursively(Node head){
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q. Implement a method to find out length of a Linked List(Iterative and Recursive)

        Node a = new Node(3);
        Node b = new Node(7);
        Node c = new Node(9);
        Node d = new Node(1);
        Node e = new Node(8);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println(findLengthOfLL(a));
        System.out.println(findLengthOfLLRecursively(a));

    }
}
