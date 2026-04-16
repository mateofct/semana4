import java.util.Scanner;

public class Multiplicacion {public static double[] pedirDatosMultipliacion(Scanner scanner){
    System.out.println("Ingrese el primer número:");
    double primerNumero = scanner.nextDouble();
    System.out.println("Ingrese el segundo número:");
    double segundoNumero = scanner.nextDouble();
    return new double[]{primerNumero, segundoNumero};
}
    public static double calcularMultiplicacion(double primerNumero, double segundoNumero){
        double resultadoMultiplicacion = primerNumero * segundoNumero;
        return resultadoMultiplicacion;
    }
    public static void mostrarResultadoMultiplicacion(double resultadoMultiplicacion){
        System.out.println("El resultado de la multiplicación es: " + resultadoMultiplicacion);
    }
    public static void ejecutarMultiplicacion(Scanner scanner){
        try{
        double[] datosMultiplicacion = pedirDatosMultipliacion(scanner);
        double primerNumero = datosMultiplicacion[0];
        double segundoNumero = datosMultiplicacion[1];
        double resultadoMultiplicacion = calcularMultiplicacion(primerNumero, segundoNumero);
        mostrarResultadoMultiplicacion(resultadoMultiplicacion);
        } catch (Exception e) {
            System.out.println("Tienes que ingresar un número: " + e.getMessage());
            scanner.nextLine();
        }
    }
}
