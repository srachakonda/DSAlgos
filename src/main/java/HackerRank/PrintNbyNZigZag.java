package HackerRank;

/**
 * Created by sampathr on 27/7/17.
 */
public class PrintNbyNZigZag {


    public static void main(String[] args) {
        System.out.println("hello");
        int M[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}, {17, 18, 19, 20}};
        print(M);

        zigzag(M);
    }

    private static void zigzag(int[][] m) {
        System.out.println("ZigZag Print");

        int i = 0, j = 0;
        int r = m.length;
        while (i < r) {
            System.out.print(m[i][j] + "->");

            if (i == r - 1) {
                i = j + 1;
                j = r - 1;
            } else if (j == 0) {
                j = i + 1;
                i = 0;
            } else {
                i++;
                j--;
            }
        }


    }

    private static void diagonalPrint(int[][] m) {
        int row = m.length;
        int col = m[0].length;


        for (int line = 1; line <= (row + col - 1); line++) {
            int start_col = max(0, line - row);
            int count = min(line, (col - start_col), row);

            for (int j = 0; j < count; j++)
                System.out.print(" " + m[min(row, line) - j - 1][start_col + j]);

            System.out.println();
        }

    }

    static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    // A utility function to find min of three integers
    static int min(int a, int b, int c) {
        return min(min(a, b), c);
    }

    // A utility function to find max of two integers
    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    private static void print(int[][] m) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++)
                System.out.print(" " + m[i][j]);
            System.out.println();

        }
    }
}
