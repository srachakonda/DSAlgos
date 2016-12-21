/**
 * Created by sampathr on 20/12/16.
 */
public class SSTest {
    public static void main(String args[]) {
        int[] arr = {7, 5, 2, 4, 3, 5, 9};
        selectionSort(arr);

    }

    public static void selectionSort(int[] arr) {
        if (arr == null && arr.length == 0)
            return;

        int len = arr.length;
        for (int i = 0; i < len; i++) {

            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;

            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }


        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
