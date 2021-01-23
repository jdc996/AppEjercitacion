package clase2Java.practica1;


import javax.xml.bind.ValidationException;

public class Fecha {

    private int dia;
    private int mes;
    private int año;

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }


    public int getAño() {
        return año;
    }

    public Fecha(){};

    public Fecha(int dia, int mes, int año) throws ValidationException {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        if(!this.validarFecha()){
            throw new ValidationException("Fecha Incorrecta");
        }

    }

    public boolean validarFecha() {
        boolean diaValido, mesValido, anoValido, esBisiesto;
        anoValido = this.getAño() >=0;
        mesValido = this.getMes()>=1 && this.getMes()<=12;
        esBisiesto = esBisiesto();
        switch (mes){
            case 2:
                diaValido= esBisiesto ? (this.dia >=1 && this.dia<=29):(this.dia >=1 && this.dia<=28);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diaValido = dia >=1 && dia <= 30;
                break;
            default:
                diaValido = dia >=1 && dia <= 31;
        }

        return diaValido && mesValido && anoValido;
    }

    public void diaSiguiente() {
        this.dia++;
        if(!validarFecha()){
            this.dia=1;
            this.mes++;
            if(!validarFecha()){
                this.mes=1;
                this.año++;
            }
        }
    }
    private boolean esBisiesto() {
        return (año % 4 == 0 && año % 100 != 0 || año % 400 == 0);
    }

    @Override
    public String toString(){
        return this.getDia()+":"+this.getMes()+":"+this.getAño();
    }
}
