package leetcode.linkedlist;

import java.util.LinkedList;

class Node{
    private double data;
    Node next;

    public Node(double data){
        this.data=data;
        this.next=null;
    }


}
public class LinkedListPractise {
     Node head;
    public boolean isEmpty(){
       return head==null;
    }

    public static void main(String[] args) {
        LinkedListPractise linkedListPractise = new LinkedListPractise();
        linkedListPractise.head=new Node(1.5);
        if (linkedListPractise.isEmpty()){
            System.out.println("linked list is empty");
        }
        else {
            System.out.println("linked list is not empty");
        }
    }
}
