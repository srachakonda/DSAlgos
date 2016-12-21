package HackerRank;

import java.util.Scanner;

/**
 * Created by sampathr on 20/12/16.
 */
public class MergeSortHackerRank {
    int[] arr;
    int[] tMergeArr;
    int len;

    public void sort(int[] ar) {

        this.arr = ar;
        this.len = ar.length;
        this.tMergeArr = new int[ar.length];
        mergeSort(0,len-1);

    }

    public void mergeSort(int lIndex, int hIndex) {
        if (lIndex < hIndex) {
            int pivot = lIndex + (hIndex - lIndex) / 2;
            mergeSort(lIndex, pivot);
            mergeSort(pivot + 1, hIndex);
            mergeParts(lIndex, pivot, hIndex);
        }
    }

    public void mergeParts(int lindex, int pivot, int hindex) {
        for (int i = lindex; i <= hindex; i++) {
            tMergeArr[i] = arr[i];
        }
        int i = lindex;
        int j = pivot+1;
        int k = lindex;
        while (i<=pivot&& j<=hindex){
            if (tMergeArr[i]>tMergeArr[j]){
                arr[k]=tMergeArr[j];
                j++;
            }else if(tMergeArr[i]<=tMergeArr[j]){
                arr[k]=tMergeArr[i];
                i++;
            }
            k++;
        }
        while (i<=pivot){
            arr[k] = tMergeArr[i];
            k++;
            i++;
        }
    }

    public static void main(String args[]) {
        MergeSortHackerRank mergeSort = new MergeSortHackerRank();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        //int ar[] = {1,9,3,5,4,7};
        mergeSort.sort(ar);
        System.out.print("[");
        int len = ar.length;
        for (int i = 0; i<len;i++){
            System.out.print(ar[i]);
            if(i!=ar.length-1)
                System.out.print(",");
        }

        System.out.println("]");
    }

}
