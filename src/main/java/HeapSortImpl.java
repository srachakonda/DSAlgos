/**
 * Created by sampathr on 13/12/16.
 */
public class HeapSortImpl {
    public static void main(String[] args) {
        int[] array = new int[]{7, 5, 2, 4, 3, 9, 8};
        new HeapSortImpl().sort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public void sort(int arr[]) {
        int size = arr.length;
        for (int i = size / 2 - 1; i >= 0; i--) {
            heapify(i, arr, size);
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            //reduce the heap window by 1
            size = size - 1;
            //call max heapify on the reduced heap
            heapify(0, arr, size);
        }
    }

    private int leftChild(int i) {
        return 2 * i + 1;
    }

    private int rightChild(int i) {
        return 2 * i + 2;
    }

    private void heapify(int i, int[] arr, int size) {
        int largestElementIndex = i;

        int leftChildIndex = leftChild(i);
        if (leftChildIndex < size && arr[leftChildIndex] > arr[largestElementIndex]) {
            largestElementIndex = leftChildIndex;
        }
        int rightChildIndex = rightChild(i);
        if (rightChildIndex < size && arr[rightChildIndex] > arr[largestElementIndex]) {
            largestElementIndex = rightChildIndex;
        }
        if (largestElementIndex != i) {
            int swap = arr[i];
            arr[i] = arr[largestElementIndex];
            arr[largestElementIndex] = swap;

            // Recursively heapify the affected sub-tree
            heapify(largestElementIndex, arr, size);
        }
    }
}
