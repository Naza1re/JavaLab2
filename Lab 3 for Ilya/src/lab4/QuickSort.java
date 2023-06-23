package lab4;

import java.util.Comparator;

public class QuickSort<T> implements Sort<T>  {
    @Override
    public void sort(T[] array, Comparator<T> comp){
        int low = 0;
        int high = array.length-1;
        int middle = low + (high - low) / 2;
        T opora = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (0 > comp.compare(array[i],opora)) {
                i++;
            }

            while (0 < comp.compare(array[j],opora)) {
                j--;
            }

            if (i <= j) {//меняем местами
                T temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            sort(array,comp);

        if (high > i)
            sort(array,comp);
    }
}