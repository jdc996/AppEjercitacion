package clase3Java.practica1;

public class Celular implements Precedable<Celular>{
    private String titular;
    private int numero;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Celular(){};

    public Celular(String titular, int numero) {
        this.titular = titular;
        this.numero = numero;
    }


    @Override
    public int precedeA(Celular persona) {
        return this.numero -persona.getNumero();
    }
}
