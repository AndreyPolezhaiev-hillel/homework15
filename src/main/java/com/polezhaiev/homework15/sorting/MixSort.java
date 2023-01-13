package main.java.com.polezhaiev.homework15.sorting;

public class MixSort{
    public <T extends Comparable<T>> void mixSort(T[] arr, int position) {
        if(arr.length == 0 || arr == null || (position < 0 && position > arr.length)){
            return;
        }

        int count = 0;

        for (int i = position; i < arr.length - position; i++) {
            T min = arr[i];
            T max = arr[i];

            for (int j = position; j < arr.length - position; j++) {
                if(min.compareTo(arr[j]) > 0){
                    min = arr[j];

                }

                if(max.compareTo(arr[j]) < 0){
                    max = arr[j];

                }
            }

            if(arr[i] == min){
                if(count == 0){
                    count++;
                }
                arr[i] = arr[position];
                arr[position] = min;
            }

            if(arr[i] == max){
                if(count == 0){
                    count++;
                }
                arr[i] = arr[arr.length - 1 - position];
                arr[arr.length - 1 - position] = max;
            }
        }

        if(count == 1){
            mixSort(arr, ++position);
        }
    }
}
