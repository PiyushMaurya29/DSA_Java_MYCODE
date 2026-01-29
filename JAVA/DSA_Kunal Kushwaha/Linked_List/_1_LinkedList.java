package Linked_List;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class _1_LinkedList {
    private Node head;
    private Node tail;
    private int size;
    public _1_LinkedList(){
        this.size = 0;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }
    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println();
    }
    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
//        ll.insert

    }
}
