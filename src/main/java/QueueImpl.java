/**
 * Created by sampathr on 14/12/16.
 */
public class QueueImpl {
    private static final int len = 10;
    int arr[] = new int[len];
    int top = -1;
    int rear = 0;

    public void push(int pushedElement) {
        if (top < len - 1) {
            arr[++top] = pushedElement;
            System.out.println("Element " + pushedElement
                    + " is pushed to Queue !");
            display();
        } else {
            System.out.println("Overflow !");
        }

    }

    public void pop() {
        if (top >= rear) {
            rear++;
            System.out.println("Pop operation done !");
            display();
        } else {
            System.out.println("Underflow !");
        }
    }

    public void display() {
        if (top >= rear) {
            System.out.println("Elements in Queue : ");
            for (int i = rear; i <= top; i++) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        QueueImpl queueDemo = new QueueImpl();
        queueDemo.pop();
        queueDemo.push(23);
        queueDemo.push(2);
        queueDemo.push(73);
        queueDemo.push(21);
        queueDemo.pop();
        queueDemo.pop();
        queueDemo.pop();
        queueDemo.pop();
    }

}