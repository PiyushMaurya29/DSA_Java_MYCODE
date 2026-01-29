package Linked_List.Questions;

public class _1_InsertAtEnd {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    static void displayLL(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    static void insertAtEnd(Node head, int val){
        Node temp = head;
        Node tVal = new Node(val);
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = tVal;
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(9);
        Node d = new Node(12);
        Node e = new Node(16);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        insertAtEnd(a, 20);
        displayLL(a);
    }
}
