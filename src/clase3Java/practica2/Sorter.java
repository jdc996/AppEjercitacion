package clase3Java.practica2;

import java.util.Comparator;

public interface Sorter<T> {
    public void sort(T arr[], Comparator<T> c, int a, int b);

}
