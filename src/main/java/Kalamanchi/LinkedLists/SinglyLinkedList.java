package Kalamanchi.LinkedLists;

import java.util.Scanner;

/**
 * Created by sampathr on 18/7/17.
 */
public class SinglyLinkedList {


    public static void insert(int data) {
        int length = 0;
        ListNode head = null;
        if (head == null) {
            ListNode dataNode = new ListNode(data);
            dataNode.setNext(null);
            head = dataNode;
            length++;
        }else{
            ListNode temp;
            temp = head;
            if(temp.getNext() == null){
                ListNode dataNode = new ListNode(data);
                head.setNext(dataNode);
                dataNode.setNext(null);
            }else{
                for (int i=0;i<length-1;i++){
                    temp=temp.getNext();
                    if(temp.getNext()==null) {
                        ListNode dataNode = new ListNode(data);
                        temp.setNext(dataNode);
                        dataNode.setNext(null);
                    }
                }
            }
            length++;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] ar = new int[length];
        for (int i = 0; i < length; i++) {
            ar[i] = in.nextInt();
        }
        insert(1);
    }

}
