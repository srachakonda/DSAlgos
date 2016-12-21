package HackerRank;

import java.util.Scanner;

/**
 * Created by sampathr on 20/12/16.
 */
public class InsertionSort {
    public static void insertionSort(int array[]) {
        int len = array.length;
        for (int j = 1; j < len; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && array[i] > key) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
        System.out.println("Data After insertion Sort: ");
        printArray(array);
    }

    public static void printArray(int ar[]) {
        System.out.print("[");
        int len = ar.length;
        for (int i = 0; i < len; i++) {
            System.out.print(ar[i]);
            if (i != ar.length - 1)
                System.out.print(",");
        }

        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
//        int ar[] = {1, 9, 3, 5, 4, 7};
        insertionSort(ar);
    }
}
