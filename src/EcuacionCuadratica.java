import java.util.Scanner;
public class EcuacionCuadratica {
    public static void pedirDatos(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("La ecuación cuadrática tiene la forma ax^2 + bx + c = 0");
        System.out.println("Ingrese el valor de a:");
        double a = scanner.nextDouble();
        System.out.println("Ingrese el valor de b:");
        double b = scanner.nextDouble();
        System.out.println("Ingrese el valor de c:");
        double c = scanner.nextDouble();


    }

}
