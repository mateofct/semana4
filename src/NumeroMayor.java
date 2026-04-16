import java.util.Scanner;

public class NumeroMayor {
    public static double[] pedirDatosNumeroMayor(Scanner scanner){
        System.out.println("Ingrese el primer número:");
        double primerNumero = scanner.nextDouble();
        System.out.println("Ingrese el segundo número:");
        double segundoNumero = scanner.nextDouble();
        return new double[]{primerNumero, segundoNumero};
    }
    public static double compararNumeroMayor(double primerNumero, double segundoNumero){
        if (primerNumero < segundoNumero) {
            double resultadoNumeroMayor = segundoNumero;
            return resultadoNumeroMayor;
        } else {
            double resultadoNumeroMayor = primerNumero;
            return resultadoNumeroMayor;
        }

    }
    public static void mostrarResultadoNumeroMayor(double resultadoNumeroMayor){
        System.out.println("El mayor número entre los dos es: " + resultadoNumeroMayor);
    }
    public static void ejecutarComparacionNumeroMayor(Scanner scanner){
        try {
            double[] datosNumeroMayor = pedirDatosNumeroMayor(scanner);
            double primerNumero = datosNumeroMayor[0];
            double segundoNumero = datosNumeroMayor[1];
            double resultadoNumeroMayor = compararNumeroMayor(primerNumero, segundoNumero);
            mostrarResultadoNumeroMayor(resultadoNumeroMayor);
        } catch (Exception e) {
            System.out.println("Tienes que ingresar un número: " + e.getMessage());
            scanner.nextLine();
        }
    }
}
