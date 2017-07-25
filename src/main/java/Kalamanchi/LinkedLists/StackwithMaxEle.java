package Kalamanchi.LinkedLists;

import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by sampathr on 25/7/17.
 */

public class StackwithMaxEle {

    private static StackNode head=null;

    private static class StackNode {
        int data;
        StackNode next;

        public StackNode(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public void setNext(StackNode nextNode) {
            this.next = nextNode;
        }
    }

    private static void push(int data) {
        if(head==null){
            StackNode node = new StackNode(data);
            node.setNext(null);
            head = node;
        }else{
            StackNode newNode = new StackNode(data);
            newNode.setNext(head);
            head = newNode;
        }
    }

    private static void pop() {
        head = head.next;
    }

    private static int peek() {
        return head.data;
    }

    private static void displayData(){
        StackNode tmp  = head;
        while(tmp!=null){
            System.out.print(tmp.data);
            System.out.print(" ");
            tmp=tmp.next;
        }
    }


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int max = 0;
        int input = in.nextInt();
        for (int i = 0; i < input; i++) {
            int option = in.nextInt();
            if (option == 1) {
                int dataPoint = in.nextInt();
                max = Math.max(max,dataPoint);
                push(dataPoint);
            } else if (option == 2) {
                pop();
            } else if (option == 3) {
                System.out.println(peek());
                System.out.println("Max Value: " + max);
            }else if(option ==4){
                displayData();
            }
        }

    }
}