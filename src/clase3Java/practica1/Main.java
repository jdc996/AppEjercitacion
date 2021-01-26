package clase3Java.practica1;

public class Main {
    public static void main(String[] args) {
        Persona per1 = new Persona("juan",1);
        Persona per2 = new Persona("maria",2);
        Persona per3 = new Persona("felipe",3);
        Precedable[] personas = new Persona[3];
        personas[0] = per1;
        personas[1] = per2;
        personas[2] = per3;
        System.out.println(personas);
        SortUtil.ordenar(personas);
        for (Precedable per:personas
             ) {
            Persona p = (Persona) per;
            System.out.println(p.getNombre());
        }

    }
}
