package Ejercicio17_BonosSalariales;

public abstract class TrabajadorCorporativo {
    private final String nombre;
    private final double sueldoBase;

    protected TrabajadorCorporativo(String nombre, double sueldoBase) {
        if (nombre == null || nombre.isBlank() || sueldoBase <= 0) {
            throw new IllegalArgumentException("Trabajador inválido");
        }
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }

    public abstract double calcularBonoAnual();

    public String getNombre() { return nombre; }
    public double getSueldoBase() { return sueldoBase; }
}
