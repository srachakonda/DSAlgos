package HackerRank;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * Created by sampathr on 10/1/17.
 */
public class AndXorOr {

    /*
    Input: 10
    29272229 8752316 10025994 52398694 57994948 49609605 28150935 66061676 44865054 87041483
    9 6 3 5 2
    output: 127710165
    getting currently: 129808351
     */

    public static void andXorOr(int[] arr) {
        Deque<Integer> stack = new ArrayDeque<>();
        int maxResult = Integer.MIN_VALUE;
        for (int n1 : arr) {
            while (!stack.isEmpty()) {
                int n2 = stack.peek();
                int result = (n1 & n2) ^ (n1 | n2) & (n1 ^ n2);
                if (maxResult < result) {
                    maxResult = result;
                }
                if (n1 < n2) {
                    stack.pop();
                } else {
                    break;
                }
            }
            stack.push(n1);
        }
        System.out.println(maxResult);
//        System.out.println("fdf  " + (long)(87864180 ^ 65564584) );
    }

    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        int arrLen = scanner.nextInt();
        scanner.nextLine();

        int[] arr = new int[arrLen];
        for (int i = 0; i < arrLen; i++) {
            arr[i] = scanner.nextInt();
        }*/
        int[] testarr = {29272229, 8752316, 10025994, 52398694, 57994948, 49609605, 28150935, 66061676, 44865054, 87041483};

        andXorOr(testarr);
    }
}