package main.java.com.polezhaiev.homework15;

import main.java.com.polezhaiev.homework15.sorting.MixSort;
import main.java.com.polezhaiev.homework15.sorting.QuickSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        MixSort mixSort = new MixSort();

        int [] arrQuickSort = new int[]{7, 5, 1, 2 ,6, 11, 10, 20, 15};
        System.out.println("Before: " + Arrays.toString(arrQuickSort));
        quickSort.quickSort(arrQuickSort, 0, arrQuickSort.length - 1);
        System.out.println("After: " + Arrays.toString(arrQuickSort));

        System.out.println();

        int [] arrMixSort = new int[]{7, 5, 1, 2 ,6, 11, 10, 20, 15};
        System.out.println("Before: " + Arrays.toString(arrMixSort));
        mixSort.mixSort(arrMixSort, 0);
        System.out.println("After: " + Arrays.toString(arrMixSort));

    }
}
