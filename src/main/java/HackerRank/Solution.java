package HackerRank;

import java.util.Scanner;

/**
 * Created by sampathr on 19/12/16.
 */

public class Solution {

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function
        int len = ar.length;
        int count = 0;
        for (int j = 1; j < len; j++) {
            int i = j - 1;
            int key = ar[j];
            while (i > -1 && ar[i] > key) {
                ar[i + 1] = ar[i];
                i--;
                count++;
            }
            ar[i + 1] = key;
        }
        System.out.println(count);
    }


    /* Tail starts here */
    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < s; i++) {
            ar[i] = in.nextInt();
        }*/

        int ar[] = {1 ,1, 2, 2, 3, 3, 5, 5, 7, 7, 9, 9};
        insertIntoSorted(ar);
    }


    private static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}

