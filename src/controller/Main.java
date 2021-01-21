package controller;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public  class Main {

    private static Scanner sc;

    public static void main(String[] args) {
        System.out.println("Hola mundo");
        sc = new Scanner(System.in);
        System.out.print("Ingrese el numero del ejercicio a realizar: ");
        int n = sc.nextInt();
        switch (n){
            case 1:
                numerosPares();
                break;
            case 2:
                multiplos();
                break;
            case 3:
                primo();
                break;
            case 4:
                ejercicio4();
                break;
            case 5:
                ejercicio5();
                break;
            default:
                System.out.println("Ingrese una opcion valida");

        }
        sc.close();
    }

    public static void numerosPares(){
        System.out.print("Ingrese un numero n ejercicio 1: ");
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }

    public static void multiplos(){
        System.out.print("Ingrese un numero n ejercicio 2: ");
        int n = sc.nextInt();
        System.out.print("Ingrese un numero m ejercicio 2: ");
        int m = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(m*i);

        }
    }

    public static void primo(){
        System.out.print("Ingrese un numero n ejercicio 3: ");
        int n = sc.nextInt();
        if (n==1){
            System.out.println(n+" es primo");

        }
        for (int i = 2; i < n; i++) {
            if(n%i==0){
                System.out.println(n+" no es primo");

            }
        }
        System.out.println(n+" es primo");

    }

    public static void ejercicio4(){
        System.out.print("Ingrese un numero n ejercicio 4: ");
        int n = sc.nextInt();
        int contadorPrimos= 1;
        int numero = 1;
        while(contadorPrimos<=n){
            if(primo2(numero)){
                System.out.println(numero);
                contadorPrimos++;
            }
            numero++;
        }
    }

    public static boolean primo2(int n){

        if (n==1){
            System.out.println(n+" es primo");
            return true;
        }
        for (int i = 2; i < n; i++) {
            if(n%i==0){
                System.out.println(n+" no es primo");
                return  false;
            }
        }
        System.out.println(n+" es primo");
        return true;
    }



    private static void ejercicio5() {
        sc = new Scanner(System.in);
        System.out.println("Desarrollar un programa para mostrar por consola los primeros n números naturales que " +
                "tienen al menos m dígitos d, siendo n, m y d valores que el usuario ingresará por consola.");

        System.out.print("Ingrese n: ");
        int n = sc.nextInt();

        System.out.print("Ingrese m: ");
        int m = sc.nextInt();

        System.out.print("Ingrese d: ");
        int d = sc.nextInt();

        int contNumeros = 1;
        int i = 1;

        while (contNumeros <= n) {
            String numeroString = String.valueOf(i);
            Pattern ocurrencias=Pattern.compile("[+"+d+"]{1}");
            Matcher ocurrenciasMatcher = ocurrencias.matcher(numeroString);
            int contadorOcurrencia= 0;
            while(ocurrenciasMatcher.find()){
                contadorOcurrencia++;
            }
            if(contadorOcurrencia>=m){
                System.out.println(i);
                contNumeros++;
            }
            /*
            if (contarOcurrencias(i, d) >= m) {
                System.out.println(i);
                contNumeros++;
            }
             */
            i++;

        }
    }

    private static int contarOcurrencias(int numero, int caracter) {
        String numeroString = String.valueOf(numero);
        char characterString = String.valueOf(caracter).charAt(0);

        long count = numeroString.chars().filter(ch -> ch == characterString).count();
        return (int) count;
    }

}
