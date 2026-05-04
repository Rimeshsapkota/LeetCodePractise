package leetcode.linkedlist;

/**
 * https://leetcode.com/problems/add-two-numbers/description/?envType=problem-list-v2&envId=linked-list
 */
class ListNode1 {
    int val;
    ListNode1 next;

    ListNode1() {
    }

    ListNode1(int val) {
        this.val = val;
    }

    ListNode1(int val, ListNode1 next) {
        this.val = val;
        this.next = next;
    }
}

public class AddTwoNumberInLinkedList {
    public static void main(String[] args) {
        ListNode1 listNode1 = addTwoNumbers(createLinkedList(), createLinkedList());
        while (listNode1 != null) {
            System.out.println(listNode1.val);
            listNode1 = listNode1.next;
        }
    }

    public static ListNode1 addTwoNumbers(ListNode1 l1, ListNode1 l2) {
        ListNode1 head;
        ListNode1 head1;
        ListNode1 head2;
        head1 = l1;
        head2 = l2;
        ListNode1 move1 = head1;
        ListNode1 move2 = head2;
        int val = 0;
        head = new ListNode1(val);
        ListNode1 dummmNode = head;
        int carryOver=0;

        ListNode1 mover = head;
        while (move1 != null && move2 != null) {
            int move1data = move1.val;
            int move2data = move2.val;
            val = move1data + move2data;
            String newValue="";
            if (carryOver!=0){
                val=val+carryOver;
            }
            if (val>9){
                String string= Integer.toString(val);
                char c2=string.charAt(0);
                char c1=string.charAt(1);
                newValue=newValue+c1;
                val= Integer.parseInt(newValue);
                carryOver=Integer.parseInt(newValue+c2);
            }
            ListNode1 temp = new ListNode1(val);
            mover.next = temp;
            mover = temp;
            move1 = move1.next;
            move2 = move2.next;
        }

        return dummmNode.next;
    }

    public static ListNode1 createLinkedList() {
        ListNode1 head;
        head = new ListNode1(1);
        ListNode1 mov = head;
        mov.next = new ListNode1(15);
        mov.next.next = new ListNode1(3);
        ListNode1 tem = mov;
        while (mov != null) {
            mov = mov.next;
        }
        return tem;
    }
}

