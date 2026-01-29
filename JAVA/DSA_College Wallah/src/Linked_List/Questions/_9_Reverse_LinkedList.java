package Linked_List.Questions;

public class _9_Reverse_LinkedList {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static void displayLL(Node head){
        if(head == null){
            System.out.println();
            return;
        }
        System.out.print(head.val+" ");
        displayLL(head.next);
    }
    public static Node reverseLL_Recursively(Node head){
        if(head.next==null) return head;
        Node newHead = reverseLL_Recursively(head.next);
        head.next.next = head;  // interchanging the connections
        head.next = null;
        return newHead;
    }
    public static Node reverseLL_Iteratively(Node head){
        Node currNode = head;
        Node prevNode = null;
        Node nextNode = null;
        while (currNode != null){
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        return prevNode;
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(1);
        Node d = new Node(2);
        Node e = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        displayLL(a);
//        Node rev1 = reverseLL_Recursively(a);
//        displayLL(rev1);
        Node rev2 = reverseLL_Iteratively(a);
        displayLL(rev2);

    }
}
