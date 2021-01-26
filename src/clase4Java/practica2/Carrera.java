package clase4Java.practica2;

import com.sun.tools.internal.ws.wsdl.framework.ValidationException;

import java.util.ArrayList;
import java.util.List;

public class Carrera {
    private double distancia;
    private double premioEnDolares;
    private String nombre;
    private int cantidadVehiculosPermitidos;
    private List<Vehiculo> listaDeVehiculos;
    private SocorristaAuto scAuto;
    private  SocorristaMoto scMoto;

    public SocorristaAuto getScAuto() {
        return scAuto;
    }

    public void setScAuto(SocorristaAuto scAuto) {
        this.scAuto = scAuto;
    }

    public SocorristaMoto getScMoto() {
        return scMoto;
    }

    public void setScMoto(SocorristaMoto scMoto) {
        this.scMoto = scMoto;
    }

    public Carrera(double distancia, double premioEnDolares, String nombre, int cantidadVehiculosPermitidos, SocorristaMoto sMoto, SocorristaAuto sAuto )  {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.cantidadVehiculosPermitidos = cantidadVehiculosPermitidos;
        this.listaDeVehiculos = new ArrayList<Vehiculo>();
        this.scAuto = sAuto;
        this.scMoto = sMoto;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getPremioEnDolares() {
        return premioEnDolares;
    }

    public void setPremioEnDolares(double premioEnDolares) {
        this.premioEnDolares = premioEnDolares;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadVehiculosPermitidos() {
        return cantidadVehiculosPermitidos;
    }

    public void setCantidadVehiculosPermitidos(int cantidadVehiculosPermitidos) {
        this.cantidadVehiculosPermitidos = cantidadVehiculosPermitidos;
    }

    public List<Vehiculo> getListaDeVehiculos() {
        return listaDeVehiculos;
    }

    public void setListaDeVehiculos(List<Vehiculo> listaDeVehiculos) {
        this.listaDeVehiculos = listaDeVehiculos;
    }

    public void darDeAltaAuto(double velocidad, double aceleracion, int anguloDeGiro,String patente) {
        Vehiculo v = new Autos(velocidad,aceleracion,anguloDeGiro,patente);
        if(getListaDeVehiculos().size()>=getCantidadVehiculosPermitidos()){
            throw new ValidationException("Maxima cantidad de vehiculos permitidos superada");
        }
        getListaDeVehiculos().add(v);
    }

    public void darDeAltaMoto(double velocidad, double aceleracion, int anguloDeGiro,String patente) {
        Vehiculo v = new Motos(velocidad,aceleracion,anguloDeGiro,patente);
        if(getListaDeVehiculos().size()>=getCantidadVehiculosPermitidos()){
            throw new ValidationException("Maxima cantidad de vehiculos permitidos superada");
        }
        getListaDeVehiculos().add(v);
    }

    public void eliminarVehiculo(Vehiculo v){
        getListaDeVehiculos().remove(v);
    }

    public void eliminarVehiculosConPatente(String unaPatente){
        int indicePatente = -1;
        for (int i = 0; i < getListaDeVehiculos().size(); i++) {
            if(getListaDeVehiculos().get(i).getPatente().equals(unaPatente)){
                indicePatente = 1;
                break;
            }
        }
        if(indicePatente==-1){
            return;
        }
        getListaDeVehiculos().remove(indicePatente);
    }

    public Vehiculo definirGanador(){
        double ganador = 0;
        Vehiculo vGanador = new Vehiculo(){};
        for (Vehiculo v:getListaDeVehiculos()){
            double valorVehiculos = v.getVelocidad()*(0.5*v.getAceleracion())/(v.getAnguloDeGiro()*(v.getPeso()-v.getRuedas()*100));
            System.out.println(v.getPatente()+ " = "+valorVehiculos + "  : "+v.getVelocidad());
            if(valorVehiculos>ganador){
                ganador = valorVehiculos;
                vGanador= v;
            }
        }
        return vGanador;
    }

    public void socorrer(String patente){

        for (Vehiculo v:getListaDeVehiculos()
             ) {
            if(v.getPatente().equals(patente)){
                if(v instanceof Autos){
                    getScAuto().socorrer((Autos) v);
                } else if(v instanceof Motos){
                    getScMoto().socorrer((Motos) v);
                }
            }
        }
    }

}
