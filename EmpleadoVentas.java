package Ejercicio17_BonosSalariales;

public class EmpleadoVentas extends TrabajadorCorporativo {
    private static final double COMISION = 0.02;
    private final double ventasAnuales;

    public EmpleadoVentas(String nombre, double sueldoBase, double ventasAnuales) {
        super(nombre, sueldoBase);
        this.ventasAnuales = Math.max(ventasAnuales, 0);
    }

    @Override
    public double calcularBonoAnual() {
        return ventasAnuales * COMISION;
    }
}
