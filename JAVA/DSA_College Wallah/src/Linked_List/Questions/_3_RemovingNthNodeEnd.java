package Linked_List.Questions;

public class _3_RemovingNthNodeEnd {
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
    public static Node deleteNthNodeFromEnd(Node head, int n){
        Node slow = head;
        Node fast = head;
        for(int i=1 ; i<=n ; i++){
            fast = fast.next;
        }
        // If n is number of nodes
        if(fast == null){
            head = head.next;
            return head;
        }
        while (fast.next != null){
            slow = slow.next;
            fast = fast.next;
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
        Node ansNode = deleteNthNodeFromEnd(a, 4);
        displayLL(ansNode);

    }
}
