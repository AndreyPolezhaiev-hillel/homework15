package main.java.com.polezhaiev.homework15.sorting;

public class QuickSort{
    public <T extends Comparable<T>> void quickSort(T[] array, int low, int high) {
        if (array.length == 0 || array == null || low < 0 || high > array.length - 1){
            return;
        }

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        T middleElement = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i].compareTo(middleElement) < 0) {
                i++;
            }

            while (array[j].compareTo(middleElement) > 0) {
                j--;
            }

            if (i <= j) {
                T temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
}
