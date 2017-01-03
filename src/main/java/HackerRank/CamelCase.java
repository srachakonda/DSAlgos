package HackerRank;

import java.util.Scanner;

/**
 * Created by sampathr on 2/1/17.
 */
public class CamelCase {
    public static void main(String[] args)
    {
//        Scanner input = new Scanner(System.in);
//        String inputStr = input.nextLine();
        String inputStr = "saveChangesInTheEditor";
        int countOfStrs = 0;
        for (String inputData : inputStr.split("(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])")) {

            ++countOfStrs;
        }
        System.out.println(countOfStrs);
    }
}
