import java.util.Scanner;

public class Porcentaje {
    public static double[] pedirDatosPorcentaje(Scanner scanner){
        System.out.println("Ingrese el porcentaje:");
        double porcentaje = scanner.nextDouble();
        System.out.println("Ingrese el número al que le quieres calcular ese porcentaje:");
        double NumeroBase = scanner.nextDouble();
        return new double[]{porcentaje,NumeroBase};
    }
    public static double calcularPorcentaje(double porcentaje, double NumeroBase){
        double resultadoPorcentaje = (porcentaje / 100) * NumeroBase;
        return resultadoPorcentaje;

    }
    public static void mostrarResultadoPorcentaje(double resultadoPorcentaje){
        System.out.println("El resultado después de calcularle el porcentaje indicado es: " + resultadoPorcentaje);
    }
    public static void ejecutarCalculoPorcentaje(Scanner scanner){
        try {
            double[] datosPorcentaje = pedirDatosPorcentaje(scanner);
            double porcentaje = datosPorcentaje[0];
            double Numerobase = datosPorcentaje[1];
            double resultadoPorcentaje = calcularPorcentaje(porcentaje, Numerobase);
            mostrarResultadoPorcentaje(resultadoPorcentaje);
        } catch (Exception e) {
            System.out.println("Tiene que ingresar un número: " + e.getMessage());
            scanner.nextLine();
        }
    }
}
