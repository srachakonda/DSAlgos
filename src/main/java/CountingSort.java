/**
 * Created by sampathr on 14/12/16.
 */
class CountingSort {
    public int[] sort(int[] arr) {
        int[] Result = new int[arr.length + 1];
        int[] Count = new int[arr.length + 1];

        for (int i = 0; i < Count.length; i++) {
            Count[i] = 0; // put count for every element as 0
        }
        // Count[] will store the counts of each integer in the given array
        for (int i = 0; i < arr.length; i++) {
            int x = Count[arr[i]];
            x++;
            Count[arr[i]] = x;
        }
        // • Update the Count[] so that each index will store the sum till
        // previous step. (Count[i]=Count[i] + Count[i-1]).
        // Now updated Count[] array will reflect the actual position of each
        // integer in Result[].
        for (int i = 1; i < Count.length; i++) {
            Count[i] = Count[i] + Count[i - 1];
        }
        // • Now navigate the input array taking one element at a time,
        // Count[input[i]] will tell you the index position of input[i] in
        // Result[]. When you do that, decrease the count in Count[input[i]] by
        // 1.
        for (int i = arr.length - 1; i >= 0; i--) {
            int x = Count[arr[i]];
            Result[x] = arr[i];
            x--;
            Count[arr[i]] = x;
        }
        return Result;
    }

    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }

    public static void main(String args[]) {
        CountingSort ob = new CountingSort();
        int arr[] = { 1,4,1,2,7,5,2};
        printArr(arr);
        int[] resultArr =ob.sort(arr);
        System.out.println();
        System.out.println("Array after sort: ");
        printArr(resultArr);
    }
}