package Kalamanchi.LinkedLists;

import java.util.List;
import java.util.Scanner;

/**
 * Created by sampathr on 19/7/17.
 */
public class StackUsingLL {

    private static ListNode head=null;
    private static int length=0;

    public static void push(int data){
        if(head==null){
            ListNode dataNode = new ListNode(data);
            dataNode.setNext(null);
            head=dataNode;
            length++;
        }else{
            ListNode temp = new ListNode(data);
            temp.setNext(head);
            head=temp;
            length++;
        }
    }

    public static void pop(){
        if(head!=null) {
            ListNode temp = head;
            int poppedEle = temp.getData();
            head = head.getNext();
            System.out.print("Popped Element: " + poppedEle);
            temp = null;
        }else{
            System.out.println("Stack is Empty");
        }
    }

    public static void peek(){
        if(head!=null){
            System.out.print("Data at current peek position: " + head.getData());
        }else
            System.out.println("Stack is Empty");
    }

    public static void displayStackData(){
        if (head != null) {
            ListNode temp = head;
            while (temp!= null) {
                System.out.print(temp.getData() + " ");
                temp = temp.getNext();
            }
        }else
            System.out.println("Stack is Empty");
    }


    public static ListNode reverseLinkedList(ListNode head)
    {
    // For first node, previousNode will be null
        ListNode previousNode=null;
        ListNode nextNode;
        ListNode currentNode = head;
        while(currentNode!=null)
        {
            nextNode=currentNode.getNext();
            // reversing the link
            currentNode.setNext(previousNode);
            // moving currentNode and previousNode by 1 node
            previousNode=currentNode;
            currentNode=nextNode;
        }
        return previousNode;
    }


    /*stack implementation using linked list*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println();
            System.out.println("-----------Stack Implementation-------------");
            System.out.println("1. Insertion of element.");
            System.out.println("2. Pop(Remove Element.");
            System.out.println("3. Display Top Element on stack.");
            System.out.println("4. Display Elements on stack.");
            System.out.println("5. Exit.");
            System.out.println("6. Reverse Linked List");
            int option = in.nextInt();
            if (option == 1) {
                System.out.print("Enter element to be pushed onto stack: ");
                push(in.nextInt());

            } else if (option == 2) {
                pop();
            } else if (option == 3) {
                peek();
            } else if (option == 4) {
                displayStackData();
            }else if(option == 5){
                System.exit(0);
            } else if (option == 6) {
                reverseLinkedList(null);
                displayStackData();
            } else {
                System.out.println("Please enter a valid option.");
            }
        }
    }



}
