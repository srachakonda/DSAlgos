/**
 * Created by sampathr on 14/12/16.
 */
public class StackImpl {
    private int size;
    private long[] stackArray;
    private int top;

    public StackImpl(int s) {
        size = s;
        stackArray = new long[size];
        top = -1;
    }

    public void push(long j) {
        if (!isFull()) {
            stackArray[++top] = j;
        } else {
            System.out.print("Sorry stack is full. Try to pop some elements and push.");
        }
    }

    public long pop() {
        return stackArray[top--];
    }

    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == size - 1);
    }

    public static void main(String[] args) {
        StackImpl stackObj = new StackImpl(10);
        stackObj.push(10);
        stackObj.push(20);
        stackObj.push(30);
        stackObj.push(40);
        stackObj.push(50);
        System.out.println("Top most element now : " + stackObj.peek());
        System.out.println("Check whether stack is full : " + stackObj.isFull());
        while (!stackObj.isEmpty()) {
            long value = stackObj.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");
    }
}