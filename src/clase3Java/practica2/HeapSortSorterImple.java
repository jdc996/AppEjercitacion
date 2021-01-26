package clase3Java.practica2;

import java.util.Comparator;

public class HeapSortSorterImple implements Sorter{


    public void sort(Object[] arr, Comparator c,int size, int d) {
        int i;
        for (i = (arr.length-1) / 2 ; i >= 0; i--){
            heapify(arr,i ,arr.length-1,c);
        }
        int sizeOfHeap= arr.length-1;
        for (int j = sizeOfHeap; j >0; j--) {
            exchange(arr,0,j);
            sizeOfHeap = sizeOfHeap-1;
            heapify(arr,0,sizeOfHeap,c);
        }
    }

    private void heapify(Object[] arr, int i, int size, Comparator c)
    {
        int largest;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if (left <= size && c.compare(arr[left] ,arr[i])>0)
            largest = left;
        else{
            largest = i;
        }

        if(right <= size && c.compare(arr[right],arr[largest])>0){
            largest = right;
        }
        if(largest!=i){
            exchange(arr,i,largest);
            heapify(arr, largest, size, c);
        }

    }
    private void exchange(Object[] arr, int i,int largest){
        Object t = arr[i];
        arr[i] = arr[largest];
        arr[largest] = t;
    }


}
