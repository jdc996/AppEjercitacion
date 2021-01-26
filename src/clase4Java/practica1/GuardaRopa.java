package clase4Java.practica1;

import javax.xml.bind.ValidationException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopa {

    private HashMap<Integer, ArrayList<Prenda>> diccionarioPrendas;
    private int contador;

    public GuardaRopa() {
        this.contador = 1;
        this.diccionarioPrendas = new HashMap<>();
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public HashMap<Integer, ArrayList<Prenda>> getDiccionarioPrendas() {
        return diccionarioPrendas;
    }

    public void setDiccionarioPrendas(HashMap<Integer, ArrayList<Prenda>> diccionarioPrendas) {
        this.diccionarioPrendas = diccionarioPrendas;
    }

    public Integer guardarPrendas(List<Prenda> listaDePrenda){
        int contAux = this.getContador();
        getDiccionarioPrendas().put(contAux,(ArrayList<Prenda>) listaDePrenda);
        setContador(contAux++);
        return getContador();
    }

    public void mostrarPrendas() {
        for(Map.Entry entrada: getDiccionarioPrendas().entrySet()){
            System.out.println("identificador: "+entrada.getKey()+ "  :  valor: "+entrada.getValue());
        }
    }

    public List<Prenda> devolverPrendas(Integer numero) throws ValidationException {
        if(!getDiccionarioPrendas().containsKey(numero)){
            System.out.println("No es un identificador valido");
            throw new ValidationException("No es un identificador valido");
        }
        List<Prenda> prendasCliente =  getDiccionarioPrendas().get(numero);
        getDiccionarioPrendas().remove(numero);
        return prendasCliente;
    }



}
