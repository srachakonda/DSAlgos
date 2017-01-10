package HackerRank;

/**
 * Created by sampathr on 2/1/17.
 */
public class SubArrays {
    public static void main(String[] args) {
        int[] inputArr = {1, 2, 3, 4};
        printCombinations(inputArr);
    }

    public static void printCombinations(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean[] printFlag = new boolean[arr.length];
            printPossibleSubArrays(arr, printFlag, 0, i);
        }
    }

    public static void printPossibleSubArrays(int[] arr, boolean[] printFlag, int start, int remain) {
        if (remain == 0) {
            System.out.print("{ ");
            for (int i = 0; i < printFlag.length; i++) {
                if (printFlag[i]) {
                    System.out.print(arr[i] + ",");
                }
            }
            System.out.print("}\n");
        }



    }
}
