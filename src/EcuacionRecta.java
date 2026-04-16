import java.util.Scanner;
import java.util.InputMismatchException;

public class EcuacionRecta {

    public static void ejecutar(Scanner scanner) {
        System.out.println("Calcular ecuación de la recta con 2 puntos.");

        try {
            System.out.print("Ingrese x1: ");
            double x1 = scanner.nextDouble();
            System.out.print("Ingrese y1: ");
            double y1 = scanner.nextDouble();
            System.out.print("Ingrese x2: ");
            double x2 = scanner.nextDouble();
            System.out.print("Ingrese y2: ");
            double y2 = scanner.nextDouble();

            if (x1 == x2) {
                System.out.println("Error, pendiente indefinida");
            } else {
                double m = calcularPendiente(x1, y1, x2, y2);
                double b = calcularInterseccion(x1, y1, m);

                if (b >= 0) {
                    System.out.println("La ecuación es:");
                    System.out.println("Y = " + m + "X + " + b);
                } else {
                    // b negativo
                    System.out.println("La ecuación es:");
                    System.out.println("Y = " + m + "X " + b);
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Error, entrada inválida");
            scanner.nextLine();
        }
    }

    public static double calcularPendiente(double x1, double y1, double x2, double y2) {
        return (y2 - y1) / (x2 - x1);
    }

    public static double calcularInterseccion(double x1, double y1, double m) {
        return y1 - (m * x1);
    }
}