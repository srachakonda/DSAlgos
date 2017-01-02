package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by sampathr on 2/1/17.
 */
public class ReduceString {
    /*
In one operation, he can delete any pair of adjacent letters with same value.
aaabccddd - abd
 */
    public static String reduceString(String[] str, String outputStr) {
        if (str.length == 0)
            return outputStr;
        else if (str.length == 1)
            return outputStr += str[0];

        int len = str.length;
        if (str[0].equals(str[1])) {
            str = Arrays.copyOfRange(str, 2, len);
            return reduceString(str, outputStr);
        } else {
            outputStr = outputStr + str[0];
            str = Arrays.copyOfRange(str, 1, len);
            return reduceString(str, outputStr);
        }
    }

    public static boolean isRepetetive(String str[]) {
        if (str.length > 0) {
            for (int i = 0; i < str.length - 1; i++) {
                if (str[i].equals(str[i + 1]))
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
//        String inputStr = "acdqglrfkqyuqfjkxyqvnrtysfrzrmzlygfveulqfpdbhlqdqrrqdqlhbdpfqluevfgylzmrzrfsytrnvqyxkjfquyqkfrlacdqj";
        String inputStr = input.nextLine();
        if (!inputStr.isEmpty()) {
            String[] inputStrArr = inputStr.split("");
            String outputStr = reduceString(inputStrArr, "");
            do {
                outputStr = reduceString(outputStr.split(""), "");
            } while (isRepetetive(outputStr.split("")));

            if (outputStr.length() > 0)
                System.out.println(outputStr);
            else
                System.out.println("Empty String");
        } else {
            System.out.println("Empty String");
        }
    }
}
