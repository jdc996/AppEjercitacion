package clase4Java.practica2;

public class Main {
    public static void main(String[] args) {
        Vehiculo v = new Motos(200,50,30,"1");
        Vehiculo v2 = new Motos(250,50,30,"2");
        Vehiculo v3 = new Motos(350,50,30,"3");
        Vehiculo v4 = new Autos(200,120,80,"4");
        Vehiculo v5 = new Autos(1550,1000,50,"5");

        Carrera c = new Carrera(1000,300,"carrera 1",5,new SocorristaMoto(),new SocorristaAuto());

        c.darDeAltaAuto(200,120,80,"4");
        c.darDeAltaAuto(1550,1000,50,"5");
        c.darDeAltaMoto(350,50,30,"3");
        c.darDeAltaMoto(250,50,30,"2");
        c.darDeAltaMoto(200,50,30,"1");

        c.socorrer("5");
        c.eliminarVehiculosConPatente("5");
        Vehiculo vGanador = c.definirGanador();
        System.out.println(vGanador.getPatente());


    }
}
