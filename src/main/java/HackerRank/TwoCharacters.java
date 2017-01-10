package HackerRank;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by sampathr on 3/1/17.
 */
public class TwoCharacters {

    public static int twoCharacters(String str) {
        String outputArr = "";
        int maxOutput = 0;
        char[] chars = str.toCharArray();
        Set<Character> charSet = new LinkedHashSet<Character>();
        for (char c : chars) {
            charSet.add(c);
        }

        List charList = new ArrayList(charSet);
        System.out.println(charList.size());
        for (int i = 0; i < charList.size(); i++) {
            for (int j = i + 1; j < charList.size(); j++) {
                String key = charList.get(i).toString() + charList.get(j).toString();
                char[] keyArr = key.toCharArray();
                outputArr = charList.get(i).toString();
                int maxCount = 0;
                int k = 0;
                for (; k < chars.length; k++) {
                    if (chars[k] == keyArr[0]) {
                        maxCount++;
                    } else if (chars[k] == keyArr[1]) {
                        outputArr += keyArr[1];
                        k++;
                        break;
                    }
                }
                if (maxCount > 1) {
                    continue;
                }
                char[] outputCharArr = outputArr.toCharArray();
                for (; k < chars.length; k++) {
                    if (chars[k] != outputCharArr[outputCharArr.length - 1] && chars[k] != outputCharArr[outputCharArr.length - 2]) {
                        continue;
                    } else if (chars[i] == outputCharArr[(outputCharArr.length) - 1]) {
                        continue;
                    } else if (chars[k] != outputCharArr[outputCharArr.length - 2]) {
                        continue;
                    }
                }

                if (outputArr.length() > maxOutput) {
                    maxOutput = outputArr.length();
                }

            }
        }
        return maxOutput;
    }

    public static void main(String[] args) {
        String inputStr = "beabeefeab";
//        int ouputValue = twoCharacters(inputStr);
        System.out.println(twoCharacters(inputStr));

    }
}
