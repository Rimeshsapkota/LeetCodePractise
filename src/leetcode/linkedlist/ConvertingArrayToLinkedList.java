package leetcode.linkedlist;
class Nodev7{
    Nodev7 next;
    private int data;
    public Nodev7(int data){
        this.data=data;
    }
    public int getData(){
        return data;
    }
}
public class ConvertingArrayToLinkedList {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        Nodev7 head;
         head = new Nodev7(arr[0]);
         Nodev7 mover=head;
        for (int i=1; i<arr.length; i++){
            Nodev7 temp= new Nodev7(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        Nodev7 tem= head;
        System.out.println(lengthOfTheLinkedList(tem));
        while (tem!=null){
            System.out.println(tem.getData());
            tem=tem.next;
        }
    }
    public static int lengthOfTheLinkedList(Nodev7 temp){
        int count=0;
        while (temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
}
