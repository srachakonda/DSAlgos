package HackerRank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by sampathr on 4/1/17.
 */
public class Pangram {
    public static void main(String[] args) {
        String inputStr = "qmExzBIJmdELxyOFWv LOCmefk TwPhargKSPEqSxzveiun";
       /* Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();*/
        System.out.println(checkPangram(inputStr));

    }

    public static String checkPangram(String str) {
        if (str.length() < 26) {
            return "not pangram";
        }
        str.replaceAll(" ", "");
        char[] chars = str.toLowerCase().toCharArray();
        final Set set = new HashSet();

        for (char c : chars) {
            if (c != ' ') {
                set.add(c);
            }

        }
        if (set.size() == 26)
            return "pangram";
        else
            return "not pangram";
    }
}
