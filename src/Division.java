import java.util.Scanner;

public class Division {public static double[] pedirDatoDivision(Scanner scanner){
    System.out.println("Ingrese el numerador:");
    double numerador = scanner.nextDouble();
    System.out.println("Ingrese el denominador:");
    double denominador = scanner.nextDouble();
    return new double[]{numerador, denominador};
}
    public static double calcularDivision(double numerador, double denominador){
        if (denominador == 0){
            throw new ArithmeticException("No se puede dividir por cero");
        }
        double resultadoDivision = numerador / denominador;
        return resultadoDivision;
    }
    public static void mostrarResultadoDivision(double resultadoDivision) {
        System.out.println("El resultado de la división es: " + resultadoDivision);
    }
    public static void ejecutarDivision(Scanner scanner){
        try {
            double[] datosDivision = pedirDatoDivision(scanner);
            double numerador = datosDivision[0];
            double denominador = datosDivision[1];
            double resultadoDivision = calcularDivision(numerador, denominador);
            mostrarResultadoDivision(resultadoDivision);
        } catch (ArithmeticException e) {
            System.out.println("Error matemático: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Tienes que ingresar un número: " + e.getMessage());
        }

    }
}
