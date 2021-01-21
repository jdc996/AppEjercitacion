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
        Map<String,List<String>> listas = new HashMap();
        List<String> listaOrdenada = new ArrayList<>();
        int contIter = numeros.get(0).length() - 1;
        System.out.println(contIter);
        for (String numero:numeros) {
            String digito = String.valueOf(numero.charAt(contIter));
            if (listas.containsKey(digito)){
                ArrayList<String> lista = (ArrayList<String>) listas.get(digito);
                lista.add(numero);
            }else {
                List<String> li=new ArrayList<String>();
                li.add(numero);
                listas.put(digito,li);
            }
        }

        return null;
    }

    public static List<String> crearListaOrdenada(Map<String,List<String>> listas){
        for (Map.Entry<String,List<String>> entry: listas.entrySet()){
            System.out.println("Key "+entry.getKey() + " Valor" +entry.getValue());

        }
        return null;
    }

    public static void radixSort(int []arr){
        List<String> numerosString = convertirArrayString(arr);
        System.out.println(numerosString);
        crearListas(numerosString);
    }
    public static void main(String[] args) {
        int[] numerosArreglo = {2,32423,423,54,2,1};
        radixSort(numerosArreglo);

    }
}
