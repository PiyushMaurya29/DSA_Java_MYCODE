package Linked_List.Questions;

public class _4_FindIntersectionOf2LL {
    public static class ListNode {
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
        }
    }
    public static ListNode MySelfFindIntersectionOf2LL(ListNode headA, ListNode headB){
        ListNode tempA = headA;
        ListNode tempB = headB;
        int sizeOfLL1 = 0, sizeOfLL2 = 0;
        while (tempA != null){
            sizeOfLL1++;
            tempA = tempA.next;
        }
        while (tempB != null){
            sizeOfLL2++;
            tempB =tempB.next;
        }
        tempA = headA;
        tempB = headB;
        int gapOfLL = Math.max(sizeOfLL1-sizeOfLL2,sizeOfLL2-sizeOfLL1);
        if(sizeOfLL1-sizeOfLL2>sizeOfLL2-sizeOfLL1){
            for(int i=1 ; i<=gapOfLL ; i++){
                tempA = tempA.next;
            }
            while (tempA != null){
                tempA = tempA.next;
                tempB = tempB.next;
                if(tempA == tempB) return tempA;
            }
        }else{
            for(int i=1 ; i<=gapOfLL ; i++){
                tempB = tempB.next;
            }
            while (tempB != null){
                tempA = tempA.next;
                tempB = tempB.next;
                if(tempA == tempB) return tempB;
            }
        }
        return null;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;

        int lengthOfLLA = 0;
        while(tempA != null){
            lengthOfLLA++;
            tempA = tempA.next;
        }
        int lengthOfLLB = 0;
        while(tempB != null){
            lengthOfLLB++;
            tempB = tempB.next;
        }

        tempA = headA;
        tempB = headB;
        if(lengthOfLLA > lengthOfLLB){
            int steps = lengthOfLLA - lengthOfLLB;
            for(int i=1 ; i<=steps ; i++){
                tempA = tempA.next;
            }
        }else{
            int steps = lengthOfLLB - lengthOfLLA;
            for(int i=1 ; i<=steps ; i++){
                tempB = tempB.next;
            }
        }
        while(tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
    }
    public static void main(String[] args) {

    }
}
