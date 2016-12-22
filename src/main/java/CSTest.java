import java.util.Scanner;

/**
 * Created by sampathr on 21/12/16.
 */
public class CSTest {


    public static void countingSort(int[] ar) {

        int len = ar.length;
        int[] resArr = new int[len + 1];
        int[] countArr = new int[len + 1];

        for (int i = 0; i < len; i++) {
            int x = countArr[ar[i]];
            x++;
            countArr[ar[i]] = x;
        }

        for (int i = 1; i < len; i++) {
            countArr[i] = countArr[i] + countArr[i - 1];
        }

        //Now sort elements
        for (int i = ar.length - 1; i >= 0; i--) {
//        for (int i = 0; i<len;i++){
            int x = ar[i];
            int y = countArr[x];
            resArr[y] = x;
            countArr[x] = y - 1;
        }

        for (int n : resArr) {
            System.out.print(n + " ");
        }

    }


    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ar[] = new int[n];
        for (int i = 0 ; i<n ; i++){
            ar[i]=scanner.nextInt();
        }*/
        int arr[] = {1, 4, 1, 2, 7, 5, 2};
        countingSort(arr);
    }
}
