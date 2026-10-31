package Ejercicio17_BonosSalariales;

public class EmpleadoRRHH extends TrabajadorCorporativo {
    private static final double PREMIO_BASE = 0.50;
    private static final double PREMIO_OBJETIVO_CUMPLIDO = 0.25;
    private final boolean objetivoCumplido;

    public EmpleadoRRHH(String nombre, double sueldoBase, boolean objetivoCumplido) {
        super(nombre, sueldoBase);
        this.objetivoCumplido = objetivoCumplido;
    }

    @Override
    public double calcularBonoAnual() {
        double porcentaje = PREMIO_BASE + (objetivoCumplido ? PREMIO_OBJETIVO_CUMPLIDO : 0);
        return getSueldoBase() * porcentaje;
    }
}
