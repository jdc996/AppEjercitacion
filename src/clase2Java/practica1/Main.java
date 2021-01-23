package clase2Java.practica1;

import javax.xml.bind.ValidationException;

public class Main {
    public static void main(String args[]) {
        try {
            Fecha f = new Fecha(1,12,2200);
            f.diaSiguiente();
            System.out.println(f);

        }catch (ValidationException ex){
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }


    }
}
