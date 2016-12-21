package HackerRank;

import java.util.Scanner;

/**
 * Created by sampathr on 20/12/16.
 */
public class QuickSortProblem1 {
    static void partition(int[] ar) {
        int len = ar.length;
        int equal[] = new int[len], left[] = new int[len], right[] = new int[len];
        int i = 0, j = len - 1, pivot = ar[0];
        int lindex = 0, rindex = 0, eindex = 0;
        int modifiedAr[] = new int[len];

        while (i <= j) {
            while (i <= j && ar[i] == pivot) {
                equal[eindex] = ar[i];
                i++;
                eindex++;
            }
            while (i <= j && ar[i] < pivot) {
                left[lindex] = ar[i];
                lindex++;
                i++;
            }
            while (i <= j && ar[i] > pivot) {
                right[rindex] = ar[i];
                rindex++;
                i++;
            }

        }
        int k = 0;

        if (k <= len - 1) {
            for (int l = 0; l < lindex; l++) {
                modifiedAr[k] = left[l];
                k++;
            }
            for (int l = 0; l < eindex; l++) {
                modifiedAr[k] = equal[l];
                k++;
            }
            for (int l = 0; l < rindex; l++) {
                modifiedAr[k] = right[l];
                k++;
            }
        }
        printArray(modifiedAr);

    }

    static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        //int ar[] = {0, -3, 6, 4, -10, 8, -5, 2, -7};
        partition(ar);
    }
}
