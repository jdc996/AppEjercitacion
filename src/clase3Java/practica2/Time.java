package clase3Java.practica2;

import java.util.Date;

public class Time {
    private long inicio;
    private long fin;

    public long getInicio() {
        return inicio;
    }

    public void setInicio(long inicio) {
        this.inicio = inicio;
    }

    public long getFin() {
        return fin;
    }

    public void setFin(long fin) {
        this.fin = fin;
    }

    public void start(){
        this.inicio = System.currentTimeMillis();
    }

    public void stop(){
        this.fin = System.currentTimeMillis();
    }

    public long elapsedTime(){
        return getFin()-getInicio();
    }

}
