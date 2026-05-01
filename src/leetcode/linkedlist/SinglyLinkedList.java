package leetcode.linkedlist;

class SingleNode {
    SingleNode next;
    private String data;

    public SingleNode(String data) {
        this.data = data;
        this.next = null;
    }

    public SingleNode() {
    }

    public String getData() {
        return data;
    }
}

public class SinglyLinkedList {
    SingleNode head;
    public void addList(String data) {
        SingleNode newNode = new SingleNode(data);
        if (head == null) {
            head = newNode;
        } else {
            SingleNode temp = head;
            while (temp.next != null) {  // ✅ walk to the last node
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void printForward() {
        SingleNode current = head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addList("rimesh");
        singlyLinkedList.addList("ramesh");
        singlyLinkedList.addList("kaji");
        singlyLinkedList.printForward();
    }
}
