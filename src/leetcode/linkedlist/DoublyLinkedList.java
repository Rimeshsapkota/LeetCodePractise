package leetcode.linkedlist;

class Node1 {
    private String data;
    Node1 next;
    Node1 prev;

    public Node1(String data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public String getData() {
        return data;
    }
}

public class DoublyLinkedList {
    Node1 head;
    Node1 tail;

    public void addList(String data){
        Node1 newNode= new Node1(data);
        if (head==null){
            head=newNode;
            tail=newNode;
        }
        else
        {
          newNode.prev=tail;
          tail.next=newNode;
          tail=newNode;
        }
    }
    public void printForward(){
        Node1 current=head;
        while(current!=null){
            System.out.println(current.getData());
            current=current.next;
        }
    }

    public void printBackward(){
        Node1 current=tail;
        while (current!=null){
            System.out.println(current.getData());
            current=current.prev;
        }
    }

    public static void main(String[] args) {
      DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
      doublyLinkedList.addList("rimesh");
      doublyLinkedList.addList("sapkota");
      doublyLinkedList.addList("adhikari");

      doublyLinkedList.printForward();
        System.out.println("------------------------------");
      doublyLinkedList.printBackward();
    }


}
