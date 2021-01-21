package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UtilString {
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

}
