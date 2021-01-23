package clase2Java.practica2;

import javax.xml.bind.ValidationException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]){
        //Ejercicio 1

       /* Password pwd = new PasswordFuerte();
        try {
            pwd.setValue("masda4345&&&");
        } catch (ValidationException e) {
            e.printStackTrace();
        }*/


        //Ejercicio 2
        ArrayList<FiguraGeometrica> lista= new ArrayList<>();
        lista.add(new Circulo(1));
        lista.add(new Rectangulo(1,1));
        lista.add(new Triangulo(1,2));

        System.out.println(FiguraUtil.areaPromedio(lista));
        FiguraUtil.toString(lista);
    }
}
