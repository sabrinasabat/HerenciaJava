package edu.example;

public class Main {
    public static void main(String[] args) {

        Trabajador trabajador;
        Empleado empleado;
        Consultor consultor;

        trabajador = new Trabajador("Bill Gates", "Presidente", "Redmond", "645204988", "4541541545");
        empleado = new Empleado("Larry Ellison", "Presidente", "Redwood", "658997003", "45687300487", 100000.0, 1000.0);
        consultor = new Consultor("Steve Jobs", "Consultor Jefe", "Cupertino", "66778351", "00398751206", 20, 1000.0);
        System.out.println(trabajador);
        System.out.println(empleado);
        System.out.println(empleado.calcularPaga());
        System.out.println(consultor);
        System.out.println(consultor.calcularPaga());
    }
}