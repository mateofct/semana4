import java.util.Scanner;

public class Potencia {

    public static double[] pedirDatosPotencia(Scanner scanner){
        System.out.println("Ingrese el número que irá en la base:");
        double NumeroBase = scanner.nextDouble();
        System.out.println("Ingrese el número que irá en el exponente:");
        double exponente = scanner.nextDouble();
        return new double[]{NumeroBase,exponente};
}
    public static double calcularPotencia(double NumeroBase, double exponente){
        if (NumeroBase == 0 && exponente == 0){
            throw new ArithmeticException("Indeterminado");
        }
        double resultadoPotencia = Math.pow(NumeroBase, exponente);
        return resultadoPotencia;

    }
    public static void mostrarResultadoPotencia(double resultadoPotencia){
        System.out.println("El resultado de la potencia es: " + resultadoPotencia);
    }
    public static void ejecutarCalculoPOtencia(Scanner scanner){
        try {
            double[] datosPotencia = pedirDatosPotencia(scanner);
            double NumeroBase = datosPotencia[0];
            double exponente = datosPotencia[1];
            double resultadoPotencia = calcularPotencia(NumeroBase, exponente);
            mostrarResultadoPotencia(resultadoPotencia);
        } catch (ArithmeticException e) {
            System.out.println("Error matemático: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Tienes que ingresar un número: " + e.getMessage());
            scanner.nextLine();
        }
    }

}
