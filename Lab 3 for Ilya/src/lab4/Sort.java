package lab4;
import java.util.Comparator;

public interface Sort<T>
{
    void sort(T[] arr, Comparator<T> comp);
}