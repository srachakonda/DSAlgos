/**
 * Created by sampathr on 14/12/16.
 */
public class InsertionSortImpl1 {
    public static <T extends Comparable<T>> void sort(T[] array) {
        for (int i = 1; i < array.length; i++) {
            T item = array[i];
            int indexHole = i;
            while (indexHole > 0 && array[indexHole - 1].compareTo(item) > 0) {
                array[indexHole] = array[--indexHole];
            }
            array[indexHole] = item;
        }
    }
}