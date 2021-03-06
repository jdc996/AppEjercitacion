package clase2Java.practica2;

public class Circulo extends FiguraGeometrica{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(this.radio,2);
    }

    @Override
    public String toString() {
        return "Circulo de radio "+this.getRadio();
    }
}
