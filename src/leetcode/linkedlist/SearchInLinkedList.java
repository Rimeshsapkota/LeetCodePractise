package leetcode.linkedlist;

import java.util.Scanner;

class Nodev8{
    Nodev8 next;
    private int data;

    public Nodev8(int data){
        this.data=data;
        this.next=null;
    }

    public int getData(){
        return data;
    }
}
public class SearchInLinkedList {
    public static void main(String[] args) {
        Nodev8 linkedList = createLinkedList();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number :");
        int val=scanner.nextInt();

        System.out.println(searchElementInLinkedList(linkedList,val));
    }
    public static Nodev8 createLinkedList(){
        Nodev8 head;
        head=new Nodev8(5);
        Nodev8 mov=head;
        mov.next=new Nodev8(6);
        mov.next.next=new Nodev8(7);
        mov.next.next.next=new Nodev8(8);
        Nodev8 tem=mov;
        while (mov!=null){
            System.out.println(mov.getData());
            mov=mov.next;
        }
        return tem;
    }
    private static boolean searchElementInLinkedList(Nodev8 v, int val){
        while (v!=null){
            int data = v.getData();
            if (data==val){
                return true;
            }
            v=v.next;
        }
        return false;
    }
}
