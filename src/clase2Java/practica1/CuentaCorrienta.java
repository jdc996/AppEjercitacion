package clase2Java.practica1;

public class CuentaCorrienta {

    private double saldo;
    private int numeroCuenta;
    private String titularCuenta;
    private int documentoTitular;

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitularCuenta() {
        return titularCuenta;
    }

    public void setTitularCuenta(String titularCuenta) {
        this.titularCuenta = titularCuenta;
    }

    public int getDocumentoTitular() {
        return documentoTitular;
    }

    public void setDocumentoTitular(int documentoTitular) {
        this.documentoTitular = documentoTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }



    public void ingreso(double saldo){
        this.setSaldo(getSaldo()+saldo);
    }
    public void egreso(double saldo){
        this.setSaldo(getSaldo()-saldo);
    }
    public void reintegro(double saldo){
        this.ingreso(saldo);
    }
    public void transferencia(CuentaCorrienta c, double saldo){
        if(this.getSaldo()<saldo){
            throw new RuntimeException("No tiene saldo disponible para realizar esta operacion");
        }

        this.egreso(saldo);
        c.ingreso(saldo);

    }

    public CuentaCorrienta(){}

    public CuentaCorrienta(CuentaCorrienta c){
        this.setSaldo(c.getSaldo());
        this.setTitularCuenta(c.getTitularCuenta());
        this.setNumeroCuenta(c.getNumeroCuenta());
        this.setSaldo(c.getSaldo());
    }

    public CuentaCorrienta(int numeroCuenta, String titularCuenta, double saldo, int documentoTitular){
        setNumeroCuenta(numeroCuenta);
        setTitularCuenta(titularCuenta);
        setDocumentoTitular(documentoTitular);
        setSaldo(saldo);
    }





}
