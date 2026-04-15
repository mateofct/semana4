import java.util.Scanner;

public class OperacionesAritmeticas {

    public static void menuAritmetica() {
        Scanner scanner = new Scanner(System.in);
        int

    }

    public static void mostrarMenuAritmetica() {
        System.out.println("Seleccione una operación aritmética:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. El mayor de los dos números");
        System.out.println("6. El menor de los dos números");
        System.out.println("7. Potencia de un número elevado a otro");
        System.out.println("8. Calcular porcentaje de un número con respecto a otro");
        System.out.println("9. Salir");
    }
    public static int leerOpcionAritmetica(Scanner scanner) {
        int OperacionSeleccionada = scanner.nextInt();
        return OperacionSeleccionada;
    }
}
