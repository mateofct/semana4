import java.util.Scanner;

public class Resta {
    public static double[] pedirDatosResta(Scanner scanner){
        System.out.println("Ingrese el numero que va adelante de la resta:");
        double primerNumero = scanner.nextDouble();
        System.out.println("Ingrese el segundo número:");
        double segundoNumero = scanner.nextDouble();
        return new double[]{primerNumero, segundoNumero};
    }
    public static double calcularResta(double primerNumero, double segundoNumero){
        double resultadoResta = primerNumero - segundoNumero;
        return resultadoResta;
    }
    public static void mostrarResultadoResta(double resultadoResta){
        System.out.println("El resultado de la resta es: " + resultadoResta);
    }
    public static void ejecutarResta(Scanner scanner){
        double[] datosResta = pedirDatosResta(scanner);
        double primerNumero = datosResta[0];
        double segundoNumero = datosResta[1];
        double resultadoResta = calcularResta(primerNumero, segundoNumero);
        mostrarResultadoResta(resultadoResta);
    }
}
