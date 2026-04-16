import java.util.Scanner;
public class EcuacionCuadratica {

    public static void ejecutarCalculoCuadratica(Scanner scanner){
        try {
            double[] datos = pedirDatos(scanner);
            double a = datos[0];
            double b = datos[1];
            double c = datos[2];
            double[] resultadoCuadratica = calcularCuadratica(a, b, c);
            mostrarResultadoCruadratica(resultadoCuadratica);
        } catch (ArithmeticException e) {
            System.out.println("Error matemático: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Tiene que ingresar un número: " + e.getMessage());
            scanner.nextLine();
        }

    }
    public static double[] pedirDatos(Scanner scanner){

        System.out.println("La ecuación cuadrática tiene la forma ax^2 + bx + c = 0");
        System.out.println("Ingrese el valor de a:");
        double a = scanner.nextDouble();
        System.out.println("Ingrese el valor de b:");
        double b = scanner.nextDouble();
        System.out.println("Ingrese el valor de c:");
        double c = scanner.nextDouble();
        return new double[]{a,b,c};

    }

    public static double[] calcularCuadratica(double a, double b, double c){
        double discriminante = Math.pow(b, 2) - 4 * a * c;

        if (discriminante < 0) {
            throw new ArithmeticException("El discriminante no puede ser negativo, porque sería la raíz de algo negativo y eso no da una solución real");
        }
        if (a < 0){
            throw new ArithmeticException("La a no puede ser negativo, porque terminaría dividiendo por cero");
        }
        double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
        double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
        return new double[] {x1, x2};



    }
    public static void mostrarResultadoCruadratica(double[] resultadoCuadratica){
        double x1 = resultadoCuadratica[0];
        double x2 = resultadoCuadratica[1];
        System.out.println("El valor de x1 es: " + x1);
        System.out.println("El valor de x2 es: " + x2);
    }



}
