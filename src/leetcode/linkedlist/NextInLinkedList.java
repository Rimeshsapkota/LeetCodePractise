package leetcode.linkedlist;

class Nodes{
     String name;
     Nodes next;

    public Nodes(String name){
        this.name=name;
        this.next=null;
    }
}
public class NextInLinkedList {


    public static void main(String[] args) {
        Nodes head= new Nodes("rimesh");
        Nodes second=new Nodes("rimesh");
        Nodes third=new Nodes("karki");

        head.next=second;
        second.next=third;
        Nodes temp = head;
        while (temp != null) {
            System.out.print(temp.name + " -> ");
            temp = temp.next; // moving using 'next'
        }

    }

}
