/**
 * Created by sampathr on 20/12/16.
 */
public class ISTest {
    public static void main(String args[]) {
        int[] arr = {7, 5, 2, 4, 3, 5, 9};
        insertionSort(arr);

    }

    public static void insertionSort(int[] arr) {
        if (arr == null && arr.length == 0)
            return;

        int len = arr.length;

        for (int i = 1; i < len; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j > -1 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1]=key;
        }

        for (int n: arr){
            System.out.print(n+" ");
        }
    }

}