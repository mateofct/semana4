import java.util.Scanner;

public class Suma {
    public static double[] pedirDatosSuma(Scanner scanner) {
        System.out.println("Ingrese el primer número:");
        double primerNumero = scanner.nextDouble();
        System.out.println("Ingrese el segundo número:");
        double segundoNumero = scanner.nextDouble();
        return new double[]{primerNumero, segundoNumero};
    }
    public static double calcularSuma(double primerNumero, double segundoNumero){
        double resultadoSuma = primerNumero + segundoNumero;
        return resultadoSuma;
    }
    public static void mostrarResultadoSuma(double resultadoSuma){
        System.out.println("El resultado de la suma es: " + resultadoSuma);
    }
    public static void ejecutarSuma(Scanner scanner){
        double[] datosSuma = pedirDatosSuma(scanner);
        double primerNumero = datosSuma[0];
        double segundoNumero = datosSuma[1];
        double resultadoSuma = calcularSuma(primerNumero, segundoNumero);
        mostrarResultadoSuma(resultadoSuma);
    }
}
