package controller;

import java.util.*;

public class practica2 {
    public static String completarCeros(int numero,int cantidad){
        String numeroString = Integer.toString(numero);
        int recorrer = cantidad - numeroString.length();
        String cadena = "";
        for (int i = 0; i < recorrer; i++) {
            cadena = cadena + "0";
        }
        return cadena+numeroString;
    }

    public static List<String> convertirArrayString(int[] numeros) {
        List<String> numerosString = new ArrayList<>();
        int cantidadCerosIzq =  Integer.toString(Arrays.stream(numeros).max().getAsInt()).length();

        System.out.println(cantidadCerosIzq);
        for (int numero:numeros) {
            numerosString.add(completarCeros(numero,cantidadCerosIzq));
        }
        return numerosString;
    }

    public static List<String> crearListas(List<String> numeros) {
        Map listas = new HashMap<Integer,List<String>>();
        return null;
    }

    public static void radixSort(int []arr){
        List<String> numerosString = convertirArrayString(arr);
        System.out.println(numerosString);
    }
    public static void main(String[] args) {
        int[] numerosArreglo = {1,2,32423,423,54,2};
        radixSort(numerosArreglo);

    }
}
