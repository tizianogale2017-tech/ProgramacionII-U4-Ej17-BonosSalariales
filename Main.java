package Ejercicio17_BonosSalariales;

public class Main {
    public static void main(String[] args) {
        LiquidadorSueldos liquidador = new LiquidadorSueldos();
        TrabajadorCorporativo[] plantel = {
            new EmpleadoVentas("Sofía Aguirre", 900000, 40000000),
            new EmpleadoSistemas("Mateo Quiroga", 1300000, 3),
            new EmpleadoRRHH("Elena Bustos", 1000000, true),
            new EmpleadoRRHH("Raúl Medina", 1000000, false)
        };

        double total = 0;
        for (TrabajadorCorporativo t : plantel) {
            total += liquidador.liquidar(t);
        }
        System.out.printf("TOTAL A PAGAR: %,.2f%n", total);
    }
}
