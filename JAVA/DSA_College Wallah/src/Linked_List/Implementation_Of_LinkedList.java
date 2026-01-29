package Linked_List;

public class Implementation_Of_LinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedList{
        Node head = null;
        Node tail = null;
        int sizeOfLL = 0;  // For calculating size/length of LL
        void insertAtHead(int val){ // Or insertAtStart
            // TC = O(1)
            Node temp = new Node(val);
            if(head==null){ // list is empty
//                head = temp;
//                tail = temp;
                // Or write
                insertAtTail(val);
            }
            else {          // list is not empty
                temp.next = head;
                head = temp;
            }
            sizeOfLL++;
        }
        void insertAtTail(int val){ // Or insertAtEnd
            // TC = O(1)
            Node temp = new Node(val);
            if(head==null){ // If list is empty
                head = temp;
                tail = temp;
            }
            else {          // If list is not empty
                tail.next = temp;
                tail = temp;
            }
            sizeOfLL++;
        }
        void insertAt(int idx , int val){
            // TC = O(n)
            if(idx==sizeOfLL()){  // if given index is last index pf list
                insertAtTail(val);
                return;
            }
            else if(idx==0){ // If we add node at index 0
                insertAtHead(val);
                return;
            }
            else if(idx<0 || idx>sizeOfLL()) {
                System.out.println("Wrong / Invalid Index!");
                return;
            }
            Node tVal = new Node(val);
            Node temp = head; // this temp is used to traversing the LL
            for(int i=1 ; i<=idx-1 ; i++){
                temp = temp.next;
            }
            tVal.next = temp.next;
            temp.next = tVal;
            sizeOfLL++;
        }
        void deleteElementAt(int idx){
            if(idx==0){
                head = head.next;
                sizeOfLL--;
                return;
            }
            else if(idx<0 || idx>=sizeOfLL()){
                System.out.println("Invalid Index Entered");
                return;
            }
            Node temp = head;
            for(int i=1 ; i<=idx-1 ; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(idx == sizeOfLL-1){
                tail = temp;  // If we delete last index then tail should be changed
            }
            sizeOfLL--;
        }
        int getElementAt(int idx){
            // TC = O(n)
            if(idx<0 || idx>=sizeOfLL()){
                System.out.println("Wrong Index!");
                return -1;
            }
            Node temp = head;
            for(int i=1 ; i<=idx ; i++){
                temp = temp.next;
            }
            return temp.data;
        }
        void displayLL(){
            if(head==null){
                System.out.println("Empty List!");
                return;
            }
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
        int sizeOfLL(){ // Return size/length of LL
//            Node temp = head;
//            int count = 0;
//            while (temp != null){
//                count++;
//                temp = temp.next;
//            }
//            return count;
            return sizeOfLL; // returning the size declared at starting
        }
        Node reverseLL(){
            Node prevNode = null;
            Node currNode = head;
            while (currNode!=null){
                Node nextNode = currNode.next;
                currNode.next = prevNode;
                prevNode = currNode;
                currNode = nextNode;
            }
            // Now swap head and tail
            Node temp = head;
            head = tail;
            tail = temp;
            return head;
        }

        // Extras -> Kunal Kushwaha
        Node get(int index){
            Node node = head;
            for(int i=0 ; i<index ; i++){
                node = node.next;
            }
            return node;
        }
        int deleteHeadNode(){
            int val = head.data;
            head = head.next;
            if(head==null){
                tail = null;
            }
            sizeOfLL--;
            return val;
        }
        int deleteTailNode(){
            if(sizeOfLL<=1){
                return deleteHeadNode();
            }
            Node secondLast = get(sizeOfLL-2);
            int val = tail.data;
            tail = secondLast;
            tail.next = null;
            return val;
        }
    }
    public static void main(String[] args) {

        // Implementation of a Singly Linked List

        linkedList ll = new linkedList();
        ll.displayLL();
        ll.insertAtTail(3); // 3
        ll.insertAtTail(4); // 3 -> 4
        ll.insertAtTail(5); // 3 -> 4 -> 5
        ll.displayLL();

        System.out.println(ll.sizeOfLL()); // Prints length of LL

        ll.insertAtTail(9); // 3 -> 4 -> 5 -> 9
        ll.insertAtHead(43); // 43 -> 3 -> 4 -> 5 -> 9
        ll.insertAt(2,99); // 43 -> 3 -> 99 -> 4 -> 5 -> 9
        ll.insertAtHead(12); // 12 -> 43 -> 3 -> 99 -> 4 -> 5 -> 9
        ll.displayLL();

        System.out.println(ll.getElementAt(3));
        ll.deleteElementAt(1);
        ll.displayLL(); // 12 -> 3 -> 99 -> 4 -> 5 -> 9

        System.out.println(ll.sizeOfLL); // Printing size/Length of LL
        System.out.println(ll.getElementAt(5));

        // Printing reversed LL
//        Node newHead = ll.reverseLL();
//        Node temp = newHead;
//        while (temp!=null){
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }
        ll.displayLL();


    }
}
