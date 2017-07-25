package HackerRank;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by sampathr on 25/7/17.
 */
public class StackMaxEle {


    private static class StackNode{
        int data;
        int currMax;

        public StackNode(int data, int max){
            this.data = data;
            this.currMax = max;
        }
    }

    public static void main(String args[]){

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int inputCount = in.nextInt();
        Stack<StackNode> stackData = new Stack<StackNode>();
        int max = Integer.MIN_VALUE;

        for(int i=0;i<inputCount;i++){
            int option = in.nextInt();
            if(option == 1){
                int value = in.nextInt();
                max = Math.max(max,value);
                    stackData.push(new StackNode(value,max));
            }else if(option == 2){
                stackData.pop();
                if (stackData.isEmpty()){
                    max = Integer.MIN_VALUE;
                }else{
                    max = stackData.peek().currMax;
                }
            }else if(option ==3){
                System.out.println(stackData.peek().currMax);
            }

        }
        in.close();
    }
}
