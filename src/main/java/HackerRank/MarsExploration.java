package HackerRank;

import java.util.Scanner;

/**
 * Created by sampathr on 10/1/17.
 */
public class MarsExploration {
    public static void cosmicRadiations(String str) {
        int length = str.length();
        int countOfSignals = length / 3;
        String alteredString = str;
        int count = 0;
        for (int j = 0; j < length; ) {
            alteredString = str.substring(j, j + 3);
            j = j + 3;
            for (int i = 0; i < alteredString.length(); i++) {
                char c = alteredString.charAt(i);
                if (i == 0 || i == 2) {
                    if (c == 's' || c == 'S') {
                        //Do Nothing
                    } else {
                        count++;
                    }
                } else if (i == 1) {
                    if (c == 'o' || c == 'O') {
                        //Do Nothing
                    } else {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputStr = in.nextLine();
//        String inputStr = "SOSSOT";
//        System.out.println("Input String: " + inputStr);
        cosmicRadiations(inputStr);
    }
}
