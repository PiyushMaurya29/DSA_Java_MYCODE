package Linked_List.Questions;

public class _2_NthNodeFromLast {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static Node nthNode(Node head, int n){
        // n is the nth Node from the end of list
        int size = 0;
        Node temp = head;
        while (temp != null){
            size++;
            temp = temp.next;
        }
        // n the node from end is m node from start
        int m = size - n + 1;
        temp = head;
        for(int i=1 ; i<=m-1 ; i++){
            temp = temp.next;
        }
        return temp;
    }
    public static Node nthNode2(Node head, int n){
        Node slow = head;
        Node fast = head;
        for(int i=1 ; i<=n ; i++){
            fast = fast.next;
        }
        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        // List : 100, 13, 4, 5, 12, 10
        Node ans = nthNode(a, 5);
        System.out.println(ans.data);

        Node ansSlowFast = nthNode2(a, 5);
        System.out.println(ansSlowFast.data);
    }
}
