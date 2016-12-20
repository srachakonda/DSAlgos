/**
 * Created by sampathr on 12/12/16.
 */
public class InsertionSortImpl {

    /*
    Time Complexity and Space Complexity:
    Best: O(n)
    Worst: O(n2)
    Average: O(n2)
    Space O(n)
     */
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

    public static void printArray(int arrayData[]) {
        for (int i = 0; i < arrayData.length; i++) {
            System.out.print(arrayData[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arrayToSort[] = {7, 5, 2, 4, 3, 5, 9};
        printArray(arrayToSort);
        System.out.println();
        insertionSort(arrayToSort);
    }
}
