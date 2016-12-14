/**
 * Created by sampathr on 12/12/16.
 */
public class SelecionSortJ {

    /*
   Time Complexity and Space Complexity:
   Best: O(n2)
   Worst: O(n2)
   Average: O(n2)
   Space O(n)
    */
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;

            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        System.out.println("Data After insertion Sort: ");
        printArray(arr);
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
        selectionSort(arrayToSort);
    }
}
