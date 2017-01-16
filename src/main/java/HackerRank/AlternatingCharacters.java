package HackerRank;

import java.util.Scanner;

/**
 * Created by sampathr on 16/1/17.
 */
public class AlternatingCharacters {

    public static void alternateChars(String[] strArr) {
        for (String str : strArr) {
            int count = 0;
            for (int i = 0; i < str.length() - 1; i++) {
                int j = i + 1;
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        in.nextLine();
        String[] inputArr = new String[count];
        for (int i = 0; i < count; i++) {
            inputArr[i] = in.nextLine();
        }
        alternateChars(inputArr);
    }
}