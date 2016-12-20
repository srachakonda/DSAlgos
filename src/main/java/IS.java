/**
 * Created by sampathr on 19/12/16.
 */
public class IS {

    public static void insertionSort(int arr[]) {
        int len = arr.length;
        for (int j = 1; j < len; j++) {
            int key = arr[j];
            int i = j - 1;
            while (i > -1 && arr[i] > key) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = key;
        }
        printArray(arr);
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = {1,4,3,5,6,2};

        insertionSort(arr);
    }

}
