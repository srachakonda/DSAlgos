package HackerRank;

import java.util.Scanner;

/**
 * Created by sampathr on 19/12/16.
 */
public class QuickSortPartition1 {

     static void partition(int[] ar) {
        if (ar == null && ar.length == 0){
            return;
        }
        ar = quickSort(ar, 0, ar.length -1);
         printArray(ar);
    }

    static int[] quickSort(int[] arr, int lowerIndex, int higherIndex){
        int i = lowerIndex;
        int j = higherIndex;

        int pivot = arr[lowerIndex+(higherIndex-lowerIndex)/2];

        while (i<=j){
            while (arr[i]<pivot)
                i++;

            while (arr[j]>pivot)
                j--;

            if(i<=j){
                arr = exchangeNumbers(arr,i,j);
                i++;
                j--;
            }
        }

        if (lowerIndex<i)
            quickSort(arr, lowerIndex,i);

        if (j<higherIndex)
            quickSort(arr,j,higherIndex);

        return arr;

    }

    static int[] exchangeNumbers(int[] arr, int i , int j){
        int temp = arr[i];
        arr[j]=arr[i];
        arr[i]=temp;
        return arr;
    }

    static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }*/
        int ar[] = {7,5,2,4,3,9,8};
        partition(ar);
    }
}
