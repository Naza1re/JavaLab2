package lab4;

import java.util.Comparator;

public class SelectionSort<T> implements Sort<T> {
    @Override
    public void sort(T[] arr, Comparator<T> comp){
        int min;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (0 > comp.compare(arr[j], arr[min])) {
                    min = j;
                }
            }

            if (min != i) {
                T temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }

}