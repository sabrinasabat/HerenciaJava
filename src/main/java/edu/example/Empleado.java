package edu.example;
public class Empleado extends Trabajador {
    private double sueldo;
    private double impuestos;
    private final int PAGAS = 14;
    public Empleado(String nombre, String puesto, String direccion, String telefono, String nSS, double sueldo, double impuestos) {
        //OJO "super" en las proximas sesiones
        super(nombre, puesto, direccion, telefono, nSS);
        this.sueldo = sueldo;
        this.impuestos = impuestos;
    }
    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public double getImpuestos() {
        return impuestos;
    }
    public void setImpuestos(double impuestos) {
        this.impuestos = impuestos;
    }
    public double calcularPaga() {
        return (sueldo-impuestos) / PAGAS;
    }

    @Override
    public String toString() {
        return "Empleado [sueldo=" + sueldo + ", impuestos=" + impuestos + ", Nombre=" + getNombre()
                + ", Puesto=" + getPuesto() + ", Direccion=" + getDireccion() + ", Telefono="
                + getTelefono() + ", nSS=" + getnSS() + "]";
    }
}