package HackerRank;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by sampathr on 25/7/17.
 */
public class BalancedBrackets {



    private static String isBalancedBrackets(String str) {
        Stack<Character> stack = new Stack<>();
        char upperElement = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!stack.isEmpty()) {
                upperElement = stack.peek();
            }
            stack.push(str.charAt(i));
            if (!stack.isEmpty() && stack.size() > 1) {
                if ((upperElement == '[' && stack.peek() == ']') ||
                        (upperElement == '{' && stack.peek() == '}') ||
                        (upperElement == '(' && stack.peek() == ')')) {
                    stack.pop();
                    stack.pop();
                }
            }
        }
        return stack.isEmpty() ? "YES" : "NO";
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            System.out.println(isBalancedBrackets(s));
        }
    }
}
