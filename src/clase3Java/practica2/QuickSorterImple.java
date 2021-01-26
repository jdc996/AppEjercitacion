package clase3Java.practica2;


import java.util.Comparator;

public class QuickSorterImple implements Sorter{

    public QuickSorterImple() {
    }

    public void sort(Object[] arr, Comparator c, int izq, int der) {

        if(izq<der){
            int pi  = partition(arr, c, izq, der);
            sort(arr,c,izq,pi-1);
            sort(arr,c,pi+1,der);
        }


    }

    public int partition(Object arr[], Comparator c, int low, int high){
        Object pivot= arr[high];
        int i= (low-1);
        for (int j = low; j < high ; j++) {
            if(c.compare(arr[j],pivot)<=0){
                i++;
                Object temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        Object temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] =temp;
        return i+1;
    }





}
