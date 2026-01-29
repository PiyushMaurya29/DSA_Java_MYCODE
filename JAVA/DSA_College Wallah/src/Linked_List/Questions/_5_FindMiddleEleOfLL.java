package Linked_List.Questions;

import java.util.List;

public class _5_FindMiddleEleOfLL {
    public static class ListNode {
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
        }
    }
    public static ListNode findMiddleEleOfLL(ListNode head){
        ListNode temp = head;
        int lengthOfLL = 0;
        while (temp != null){
            lengthOfLL++;
            temp = temp.next;
        }
        int mid = 0;
        if(lengthOfLL%2 == 0){
            mid = lengthOfLL/2;
        }else{
            mid = lengthOfLL/2 + 1;
        }
        temp = head;
        for(int i=1 ; i<=mid-1 ; i++){
            temp = temp.next;
        }
        return temp;
    }
    public static ListNode findMiddleEleOfLL2(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            // Returns rightMid in even number of list
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static ListNode findMiddleEleOfLL3(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next!=null && fast.next.next!=null){
            // Returns leftMid in even number of list
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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

        System.out.println(findMiddleEleOfLL(a).data); // BruteForce Method
        System.out.println(findMiddleEleOfLL2(a).data); // RightMiddle in Even List
        System.out.println(findMiddleEleOfLL3(a).data); // LeftMiddle in Even List
    }
}
