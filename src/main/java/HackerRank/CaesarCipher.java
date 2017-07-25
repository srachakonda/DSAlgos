package HackerRank;

/**
 * Created by sampathr on 5/1/17.
 */
public class CaesarCipher {

    public static void caesarCipher(String str, int cipherCode) {
        char[] inputStrCharArray = str.toCharArray();
        char[] outputArray = new char[inputStrCharArray.length];
        for (int i = 0; i < inputStrCharArray.length; i++) {
            char currentValChar = inputStrCharArray[i];
            int currentVal = currentValChar;
            if ((currentVal > 64 && currentVal < 91) || (currentVal > 96 && currentVal < 123)) {
                currentVal += cipherCode;
                if (currentVal > 90 && currentVal < 97) {
                    int diff = currentVal - 122;
                    while (diff > 26) {
                        //9711701871

                    }
                    currentVal = 64 + diff;
                } else if (currentVal > 122) {
                    int diff = currentVal - 122;
                    currentVal = 96 + diff;
                }
            }
            if (currentVal > 64 && currentVal < 91) {
                //check for capital characters
                outputArray[i] = (char) currentVal;
            } else if (currentVal > 96 && currentVal < 123) {
                //check for small characters
                outputArray[i] = (char) currentVal;
            } else {
//                currentVal -= cipherCode;
                outputArray[i] = (char) currentVal;
            }
        }
        for (char c : outputArray) {
            System.out.print(c);
        }
    }

    public static void main(String[] args) {
        String inputStr = "159357lcfd";
        //159357fwzx
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        String inputStr = in.next();
//        int cipherCode = in.nextInt();
        int cipherCode = 98;
        caesarCipher(inputStr, cipherCode);
    }
}
