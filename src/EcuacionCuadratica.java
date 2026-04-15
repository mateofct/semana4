import java.util.Scanner;
public class EcuacionCuadratica {
    static double a, b, c, x1, x2;
    public static void pedirDatos(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("La ecuación cuadrática tiene la forma ax^2 + bx + c = 0");
        System.out.println("Ingrese el valor de a:");
        a = scanner.nextDouble();
        System.out.println("Ingrese el valor de b:");
        b = scanner.nextDouble();
        System.out.println("Ingrese el valor de c:");
        c = scanner.nextDouble();

    }

    public static void calcularCuadratica(){
        x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);


    }
    public static void mostrarResultadoCruadratica(){
        System.out.println("El valor de x1 es: " + x1);
        System.out.println("El valor de x2 es: " + x2);
    }


}
