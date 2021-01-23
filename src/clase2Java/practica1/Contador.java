package clase2Java.practica1;

public class Contador {

    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Contador(){}
    public Contador(int valor){
        setValor(valor);
    }
    public Contador(Contador c){
        setValor(c.getValor());
    }

    public int incrementar(){
        this.valor++;
        return this.valor;
    }
    public int decrementar(int numero){
        this.valor--;
        return this.valor;
    }
}
