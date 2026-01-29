package Linked_List.Questions;

public class _6_DeletingMidEleOfLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void displayLL(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node deleteMiddleEleOfLL_Right(Node head){
        Node slow = head;
        Node fast = head;
        while (fast.next.next != null && fast.next.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static Node deleteMiddleEleOfLL_Left(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next.next.next != null && fast.next.next.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static void main(String[] args) {

        Node a = new Node(12);
        Node b = new Node(23);
        Node c = new Node(34);
        Node d = new Node(45);
        Node e = new Node(56);
        Node f = new Node(67);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        displayLL(a);
        Node ansRightMidDelete = deleteMiddleEleOfLL_Left(a);
        displayLL(ansRightMidDelete);

        Node ansLeftMidDelete = deleteMiddleEleOfLL_Left(a);
        displayLL(ansLeftMidDelete);
    }
}
