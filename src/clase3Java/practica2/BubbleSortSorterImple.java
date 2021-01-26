package clase3Java.practica2;

import java.util.Comparator;

public class BubbleSortSorterImple implements Sorter {

    @Override
    public void sort(Object[] arr, Comparator c,int a, int b) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (c.compare(arr[j], arr[j + 1]) > 0) {
                    Object aux = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = aux;
                }
            }
        }
    }
}

