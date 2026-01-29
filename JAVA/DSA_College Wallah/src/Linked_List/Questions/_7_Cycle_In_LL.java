package Linked_List.Questions;

public class _7_Cycle_In_LL {
    public static class ListNode {
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
        }
    }
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null){
            if(slow==null) return false;
            slow = slow.next;
            if(fast.next==null) return false;
            fast = fast.next.next;
            if(fast == slow) return true;
        }
        return false;
    }
    public static void main(String[] args) {

        ListNode a = new ListNode(12);
        ListNode b = new ListNode(23);
        ListNode c = new ListNode(34);
        ListNode d = new ListNode(45);
        ListNode e = new ListNode(56);
        ListNode f = new ListNode(67);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

    }
}
