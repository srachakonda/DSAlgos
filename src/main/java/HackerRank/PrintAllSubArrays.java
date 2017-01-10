package HackerRank;

/**
 * Created by sampathr on 2/1/17.
 */
public class PrintAllSubArrays {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        PrintSubSet(nums);
    }

    public static void PrintSubSet(int[] nums) {
        for (int i = 0; i <= nums.length; i++) {
            boolean[] ifPrint = new boolean[nums.length];
            PrintSubSet(nums, ifPrint, 0, i);
        }
    }

    public static void PrintSubSet(int[] nums, boolean[] ifPrint, int start, int remain) {
        if (remain == 0) {
            System.out.print("{");
            for (int i = 0; i < ifPrint.length; i++) {
                if (ifPrint[i])
                    System.out.print(nums[i] + ",");
            }
            System.out.print("}\n");
        } else {
            if (start + remain > nums.length)
                ;
            else {
                for (int i = start; i < nums.length; i++) {
                    if (!ifPrint[i]) {
                        ifPrint[i] = true;
                        PrintSubSet(nums, ifPrint, i + 1, remain - 1);
                        ifPrint[i] = false;
                    }
                }
            }
        }
    }
}

