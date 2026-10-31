package Ejercicio17_BonosSalariales;

public class LiquidadorSueldos {
    public double liquidar(TrabajadorCorporativo trabajador) {
        double bono = trabajador.calcularBonoAnual();
        double total = trabajador.getSueldoBase() + bono;
        System.out.printf("%-16s %-18s Sueldo: %,10.2f | Bono: %,10.2f | A cobrar: %,10.2f%n",
                trabajador.getNombre(), trabajador.getClass().getSimpleName(),
                trabajador.getSueldoBase(), bono, total);
        return total;
    }
}
