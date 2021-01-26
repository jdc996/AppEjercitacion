package clase4Java.practica1;

import javax.xml.bind.ValidationException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
        GuardaRopa guard= new GuardaRopa();
        Prenda p1 = new Prenda("gap","buso");
        Prenda p2 = new Prenda("marca2","test");
        List<Prenda> prendas = new ArrayList<>();
        prendas.add(p1);
        prendas.add(p2);
        int identificador = guard.guardarPrendas(prendas);
        System.out.println(identificador);
        List<Prenda> prendasDevueltas = guard.devolverPrendas(identificador);

            for (Prenda p: prendasDevueltas) {
                System.out.println("marca: "+p.getMarca() + " : modelo: "+p.getModelo());
            }
        } catch (ValidationException e) {
            e.printStackTrace();
        }
    }
}
