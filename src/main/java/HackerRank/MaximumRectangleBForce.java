package HackerRank;

/**
 * Created by sampathr on 4/1/17.
 */
public class MaximumRectangleBForce {

    public static int largestRectArea(int[] arr) {
        int maxheight = 0;
        if (arr.length == 0) {
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            int curHeight = arr[i];
            maxheight = Math.max(curHeight, maxheight);
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < curHeight) {
                    curHeight = arr[j];
                    maxheight = Math.max(arr[j] * (i - j + 1), maxheight);
                } else {
                    maxheight = Math.max(curHeight * (i - j + 1), maxheight);
                }
            }
        }
        return maxheight;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(largestRectArea(arr));
    }
}
