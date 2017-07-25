package Kalamanchi.LinkedLists;

/**
 * Created by sampathr on 18/7/17.
 */
public class ListNode {

    private int data;
    private ListNode next;

    public ListNode(int data){
        this.data=data;
    }

    public void setData(int data){
        this.data=data;
    }

    public int getData(){
        return data;
    }

    public void setNext(ListNode node){
        this.next=node;
    }

    public ListNode getNext(){
        return next;
    }
}
