import java.util.Comparator;

public class BubleSort<T> implements Sort<T> {

    @Override
    public void sort(T[] arr, Comparator<T> comp) {
        for (int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr1[j + 1] < arr1[j]) {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }


    }
}
