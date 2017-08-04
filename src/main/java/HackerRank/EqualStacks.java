package HackerRank;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by sampathr on 26/7/17.
 */
public class EqualStacks {


    public static int equalStacks(int[] arr1, int[] arr2, int[] arr3) throws  ArrayIndexOutOfBoundsException{

        Stack stk1 = new Stack();
        Stack stk2 = new Stack();
        Stack stk3 = new Stack();

        int stk1Sum = 0;
        int stk2Sum = 0;
        int stk3Sum = 0;

        int arr1Len = arr1.length;
        int arr2Len = arr2.length;
        int arr3Len = arr3.length;

        for (int i = arr1Len-1; i >= 0; i--) {
            stk1.push(arr1[i]);
            stk1Sum += arr1[i];
        }

        for (int i = arr2Len-1; i >= 0; i--) {
            stk2.push(arr2[i]);
            stk2Sum += arr2[i];
        }

        for (int i = arr3Len-1; i >= 0; i--) {
            stk3.push(arr3[i]);
            stk3Sum += arr3[i];
        }

        String str = "test";
        while (str != null) {
            int max1 = Math.max(stk1Sum, stk2Sum);
            int max2 = Math.max(max1, stk3Sum);

            if (stk1Sum == max2) {
                int pop = Integer.parseInt(stk1.pop().toString());
                stk1Sum = stk1Sum - pop;
            } else if (stk2Sum == max2) {

                int pop = Integer.parseInt(stk2.pop().toString());
                stk2Sum = stk2Sum - pop;
            } else if (stk3Sum == max2) {
                int pop = Integer.parseInt(stk3.pop().toString());
                stk3Sum = stk3Sum - pop;
            }

            if (stk1Sum == stk2Sum && stk1Sum == stk3Sum) {
                return stk2Sum;
            }
        }

        return 0;

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int h1[] = new int[n1];
        for (int h1_i = 0; h1_i < n1; h1_i++) {
            h1[h1_i] = in.nextInt();
        }
        int h2[] = new int[n2];
        for (int h2_i = 0; h2_i < n2; h2_i++) {
            h2[h2_i] = in.nextInt();
        }
        int h3[] = new int[n3];
        for (int h3_i = 0; h3_i < n3; h3_i++) {
            h3[h3_i] = in.nextInt();
        }

        System.out.println(equalStacks(h1, h2, h3));

    }
}
