import java.util.Scanner;

public class NumeroMenor {
    public static double[] pedirDatosNumeroMenor(Scanner scanner){
        System.out.println("Ingrese el primer número:");
        double primerNumero = scanner.nextDouble();
        System.out.println("Ingrese el segundo número:");
        double segundoNumero = scanner.nextDouble();
        return new double[]{primerNumero, segundoNumero};
    }
    public static double compararNumeroMenor(double primerNumero, double segundoNumero){
        if (primerNumero < segundoNumero) {
            double resultadoNumeroMenor = primerNumero;
            return resultadoNumeroMenor;
        } else {
            double resultadoNumeroMenor = segundoNumero;
            return resultadoNumeroMenor;
        }

    }
    public static void mostrarResultadoNumeroMenor(double resultadoNumeroMenor){
        System.out.println("El mayor número entre los dos es: " + resultadoNumeroMenor);
    }
    public static void ejecutarComparacionNumeroMenor(Scanner scanner){
        double[] datosNumeroMenor = pedirDatosNumeroMenor(scanner);
        double primerNumero = datosNumeroMenor[0];
        double segundoNumero = datosNumeroMenor[1];
        double resultadoNumeroMenor = compararNumeroMenor(primerNumero, segundoNumero);
        mostrarResultadoNumeroMenor(resultadoNumeroMenor);
    }
}

