package Ejercicio17_BonosSalariales;

public class EmpleadoSistemas extends TrabajadorCorporativo {
    private static final double PREMIO_POR_CERTIFICACION = 0.10;
    private final int certificaciones;

    public EmpleadoSistemas(String nombre, double sueldoBase, int certificaciones) {
        super(nombre, sueldoBase);
        this.certificaciones = Math.max(certificaciones, 0);
    }

    @Override
    public double calcularBonoAnual() {
        // 10% del sueldo base por cada certificación obtenida.
        return getSueldoBase() * PREMIO_POR_CERTIFICACION * certificaciones;
    }
}
