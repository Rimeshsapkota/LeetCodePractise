package leetcode.linkedlist;

import java.util.LinkedList;

public class DoubleNode {
    private double data; //the actual value store
    private DoubleNode next; //pointer to the next node
    private DoubleNode prev; //pointer to the previous node
    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public DoubleNode getPrev() {
        return prev;
    }

    public void setPrev(DoubleNode prev) {
        this.prev = prev;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }

    public DoubleNode(double data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
