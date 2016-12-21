/**
 * Created by sampathr on 12/12/16.
 */
public class MergeSortImpl {
    /*
   Time Complexity and Space Complexity:
   Best: O(nlogn)
   Worst: O(nlogn)
   Average: O(nlogn)
   Space O(n)
    */
    private int[] array;
    private int[] tempMergArr;
    private int length;

    public static void main(String a[]) {
        int[] inputArr = {5, 8, 1, 3, 7, 9, 2};
        MergeSortImpl mms = new MergeSortImpl();
        mms.sort(inputArr);
        for (int i : inputArr) {
            System.out.print(i);
            System.out.print(" ");
        }
    }

    public void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }

    private void doMergeSort(int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {
            int pivot = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, pivot);
            // Below step sorts the right side of the array
            doMergeSort(pivot + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, pivot, higherIndex);
        }
    }

    private void mergeParts(int lowerIndex, int pivot, int higherIndex) {
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        int i = lowerIndex;
        int j = pivot + 1;
        int k = lowerIndex;
        while (i <= pivot && j <= higherIndex) {
            if (tempMergArr[i] > tempMergArr[j]) {
                array[k] = tempMergArr[j];
                j++;
            } else if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            }
            k++;
        }
        while (i <= pivot) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
    }
}
