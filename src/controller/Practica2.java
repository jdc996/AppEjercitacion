package controller;

import java.util.*;

public class Practica2 {


    public static List<String> crearListas(List<String> numeros, int contIter) {
        HashMap<String,List<String>> listas = new HashMap<>();
        List<String> listaOrdenada ;

        System.out.println(contIter);
        for (String numero:numeros) {
            String digito = String.valueOf(numero.charAt(contIter));
            System.out.println("insertando llave :" + digito);
            if (listas.containsKey(digito)){
                ArrayList<String> lista = (ArrayList<String>) listas.get(digito);
                lista.add(numero);

            }else {
                List<String> li=new ArrayList<String>();
                li.add(numero);
                listas.put(digito,li);
            }
        }

        listaOrdenada = unirListasLi(listas);
        contIter--;

        if(contIter<0){
            return listaOrdenada;
        }else{
            return crearListas(listaOrdenada,contIter);
        }
    }

    public static List<String> unirListasLi(HashMap<String,List<String>> listas){
        List<String> listaOrdenada = new ArrayList<>();
        for (Map.Entry<String,List<String>> entry: listas.entrySet()){
            System.out.println("Key "+entry.getKey() + " Valor" +entry.getValue());
             listaOrdenada.addAll(entry.getValue());
        }
        return listaOrdenada;
    }

    public static void radixSort(int []arr){

        List<String> numerosString = UtilString.convertirArrayString(arr);
        System.out.println(numerosString);
        int contIter = numerosString.get(0).length() - 1;
        List<String> listaOrdenada = crearListas(numerosString,contIter);
        System.out.println(listaOrdenada);
    }
    public static void main(String[] args) {
        int[] numerosArreglo = {1,444,423,441,442,440,2,3,5,6,7,8,9};
        radixSort(numerosArreglo);

    }
}
