package leetcode.linkedlist;
class NodeV3{
     NodeV3 next;
     NodeV3 prev;
    private String data;

    public NodeV3(String data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }

    public String getData(){
        return data;
    }
}
public class DoublyLinkedListV2 {
    NodeV3 head;
    NodeV3 tail;
    public void addList(String data){
        NodeV3 newNode = new NodeV3(data);
        if (head == null){
            head=newNode;
            tail=newNode;
            return;
        }
       else {

                newNode.prev=tail;
                tail.next=newNode;
                tail=newNode;

        }

    }

    public void printNext(){
        NodeV3 current = head;
        while (current!=null){
            System.out.println(current.getData());
            current=current.next;
        }
    }

    public void printPrev(){
        NodeV3 current = tail;
        while(current!=null){
            System.out.println(current.getData());
            current=current.prev;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedListV2 doublyLinkedListV2= new DoublyLinkedListV2();
        doublyLinkedListV2.addList("rimesh");
        doublyLinkedListV2.addList("sapkota");
        doublyLinkedListV2.addList("carthmandju");

        doublyLinkedListV2.printNext();
        System.out.println("-----------");
        doublyLinkedListV2.printPrev();
    }
}
