package leetcode.linkedlist;

class NodeV2{
     NodeV2  next;
    private String data;

    public NodeV2(String data){
        this.data=data;
        this.next=null;
    }

    public String getData(){
        return data;
    }
}
public class SinglyLinkedList2 {
    NodeV2 head;
    public void addList(String data){
        NodeV2 newNode = new NodeV2(data);
        if (head==null){
            head=newNode;
            return;
        }
        NodeV2 current = head;
        while (current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }
    public void printNext(){
        NodeV2 current=head;
        while(current!=null){
            System.out.println(current.getData());
           current= current.next;
        }
    }
    public static void main(String[] args) {
       SinglyLinkedList2 singlyLinkedList = new SinglyLinkedList2();
       singlyLinkedList.addList("rimesh");
       singlyLinkedList.addList("sapkota");
        singlyLinkedList.addList("chaudhary");
        singlyLinkedList.addList("adhikari");

        singlyLinkedList.printNext();
    }
}
