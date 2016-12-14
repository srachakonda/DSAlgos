/**
 * Created by sampathr on 12/12/16.
 */
public class BubbleSortJ {
    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println("Data After Bubble Sort: ");
        printArray(arr);
    }

    public static void printArray(int arrayData[]){
        for (int i=0;i<arrayData.length;i++){
            System.out.print(arrayData[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arrayToSort[] = {7, 5, 2, 4, 3, 9};
        printArray(arrayToSort);
        System.out.println();
        bubbleSort(arrayToSort);
    }
}
