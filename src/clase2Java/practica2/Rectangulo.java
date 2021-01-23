package clase2Java.practica2;

public class Rectangulo extends FiguraGeometrica{
    private double lado1;
    private double lado2;

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double area() {
        return this.lado1*this.lado2;
    }

    @Override
    public String toString() {
        return "Rectangulo de lado 1: "+this.lado1 + " y lado 2: "+this.lado2;
    }
}
