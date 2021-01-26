package clase3Java.practica2;

import java.util.Arrays;
import java.util.Comparator;


public class Main {

    public static Integer[] crearArreglo(){
        Integer arr[] = new Integer[100000];
        for(int i=0;i<arr.length;i++){
          arr[i] =(int) Math.floor(Math.random()*100000);
        }
        return arr;
    }

    public static void main(String[] args) {
        try {
            Integer[] enteros = {34,3,53,5,2,1};
            String[] nombre = {"maria","juan","carlos"};
            Comparator<Integer> c = (a,b)->a-b;
            Comparator<String> c2 = (a,b)->a.compareTo(b);
            Sorter sor = (Sorter) MiFactory.getInstance("sorter");

            Integer arr[] =  crearArreglo();
            System.out.println(arr.length);

            Time t = new Time();
            t.start();
            sor.sort( arr,c,0,arr.length-1);
            t.stop();
            System.out.println("Tiempo transcurrido: "+t.elapsedTime());
            //Arrays.stream(arr).forEach(a-> System.out.println(a));;

        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
