package HackerRank;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by sampathr on 27/7/17.
 */
public class GameOfTwoStacks {

    public static int gameOfStacks(int[] arr1, int[] arr2, int maxSum) {

        Stack stk1 = new Stack();
        Stack stk2 = new Stack();
        int removedEleCount = 0;
        int sumOfEleRemoved = 0;

        for (int n : arr1) {
            stk1.push(n);
        }

        for (int n : arr2) {
            stk2.push(n);
        }

        while (sumOfEleRemoved < maxSum) {
            int stk1TopEle = Integer.parseInt(stk1.peek().toString());
            int stk2TopEle = Integer.parseInt(stk2.peek().toString());

            if (stk1TopEle < stk2TopEle) {
                if ((stk1TopEle + sumOfEleRemoved) <= maxSum) {
                    sumOfEleRemoved += stk1TopEle;
                    stk1.pop();
                    removedEleCount++;
                } else {
                    return removedEleCount;
                }
            } else if (stk2TopEle < stk1TopEle) {
                if ((stk2TopEle + sumOfEleRemoved) <= maxSum) {
                    sumOfEleRemoved += stk2TopEle;
                    stk2.pop();
                    removedEleCount++;
                } else {
                    return removedEleCount;
                }
            } else {
                if (stk1.size() < stk2.size()) {
                    if ((stk2TopEle + sumOfEleRemoved) < maxSum) {
                        sumOfEleRemoved += stk2TopEle;
                        stk2.pop();
                        removedEleCount++;
                    }
                } else if (stk2.size() < stk1.size()) {
                    if ((stk2TopEle + sumOfEleRemoved) < maxSum) {
                        sumOfEleRemoved += stk1TopEle;
                        stk1.pop();
                        removedEleCount++;
                    }
                } else {
                    return removedEleCount;
                }
            }
        }

        return removedEleCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for (int a0 = 0; a0 < g; a0++) {
            int n = in.nextInt();
            int m = in.nextInt();
            int x = in.nextInt();
            int[] a = new int[n];
            for (int a_i = 0; a_i < n; a_i++) {
                a[a_i] = in.nextInt();
            }
            int[] b = new int[m];
            for (int b_i = 0; b_i < m; b_i++) {
                b[b_i] = in.nextInt();
            }
            // your code goes here
            System.out.println(gameOfStacks(a, b, x));
        }
    }

}
