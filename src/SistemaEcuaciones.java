import java.util.Scanner;

public class SistemaEcuaciones {

    public static void resolver(Scanner scanner) {

        System.out.println("\nSistema de Ecuaciones");

        System.out.print("A: ");
        double A = scanner.nextDouble();

        System.out.print("B: ");
        double B = scanner.nextDouble();

        System.out.print("C: ");
        double C = scanner.nextDouble();

        System.out.print("D: ");
        double D = scanner.nextDouble();

        System.out.print("E: ");
        double E = scanner.nextDouble();

        System.out.print("F: ");
        double F = scanner.nextDouble();

        double det = (A * E) - (B * D);

        if (det == 0) {
            System.out.println("No existe solucion unica (ya que el determinante es igual a 0)");
            return;
        }

        double x = ((C * E) - (B * F)) / det;
        double y = ((A * F) - (C * D)) / det;

        System.out.println("Resultado:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}