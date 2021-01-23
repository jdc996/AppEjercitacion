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

    public static String rpad(String s, char c, int n){

        if(s.length()>= n){
            return s;
        }
        int cantAgregar = n - s.length();
        for(int i=0;i<cantAgregar;i++){
            s = s+c;
        }
        return s;
    }

    public static String ltrim(String s){
        return s.replaceAll("^\\s*","");
    }

    public static String rtrim(String s){
        return s.replaceAll("\\s*$","");
    }

    public static String trim(String s){
        String cadena= ltrim(s);
        return rtrim(cadena);
    }

    public static int indexOfN(String s, char c, int n){
        int count=0;
        int indice = 0;
        for(Character character:s.toCharArray()){
            if(character.equals(c)){
                count++;
                if (count==n){
                    return indice;
                }
            }

            indice ++;
        }
        return -1;
    }

}
