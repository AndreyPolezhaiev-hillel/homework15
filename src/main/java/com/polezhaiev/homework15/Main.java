package main.java.com.polezhaiev.homework15;

import main.java.com.polezhaiev.homework15.sorting.MixSort;
import main.java.com.polezhaiev.homework15.sorting.QuickSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        MixSort mixSort = new MixSort();

        Integer [] arrQuickSort = new Integer[]{7, 5, 1, 2 ,6, 11, 10, 20, 15};
        System.out.println("Before: " + Arrays.toString(arrQuickSort));
        quickSort.quickSort(arrQuickSort, 0, arrQuickSort.length - 1);
        System.out.println("After: " + Arrays.toString(arrQuickSort));

        System.out.println();

        Integer [] arrMixSort = new Integer[]{7, 5, 1, 2 ,6, 11, 10, 20, 15};
        System.out.println("Before: " + Arrays.toString(arrMixSort));
        mixSort.mixSort(arrMixSort, 0);
        System.out.println("After: " + Arrays.toString(arrMixSort));

        System.out.println();

        String [] namesQuickSort = new String[]{"Katya", "Sergey", "Anton", "Andrey", "Denis"};
        System.out.println("Before: " + Arrays.toString(namesQuickSort));
        quickSort.quickSort(namesQuickSort, 0, namesQuickSort.length - 1);
        System.out.println("After: " + Arrays.toString(namesQuickSort));

        System.out.println();

        String [] namesMixSort = new String[]{"Katya", "Sergey", "Anton", "Andrey", "Denis"};
        System.out.println("Before: " + Arrays.toString(namesMixSort));
        mixSort.mixSort(namesMixSort, 0);
        System.out.println("After: " + Arrays.toString(namesMixSort));

    }
}
