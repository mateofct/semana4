import java.util.Scanner;

public class OperacionesAritmeticas {

    public static void menuAritmetica() {
        Scanner scanner = new Scanner(System.in);
        int operacionSeleccionada;
        do {
            mostrarMenuAritmetica();
            operacionSeleccionada = leerOpcionAritmetica(scanner);
            ejecutarOpcion(operacionSeleccionada, scanner);
        } while (operacionSeleccionada != 9);

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
        int aritmeticaElegida = scanner.nextInt();
        return aritmeticaElegida;
    }
    public static double[] pedirNumeros(Scanner scanner) {
        System.out.println("Ingrese el primer número:");
        double primerNumero = scanner.nextInt();
        System.out.println("Ingrese el segundo número:");
        double segundoNumero = scanner.nextInt();
        return new double[]{primerNumero, segundoNumero};
    }
    public static void ejecutarOpcion(int operacionSeleccionada, Scanner scanner){
        double[] numeros = pedirNumeros(scanner);
        double primerNumero = numeros[0];
        double segundoNumero = numeros[1];

        switch(operacionSeleccionada) {
            case 1:
                suma(primerNumero, segundoNumero);
                break;
            case 2:
                resta(primerNumero, segundoNumero);
                break;
            case 3:
                multiplicacion(primerNumero, segundoNumero);
                break;
            case 4:
                division(primerNumero, segundoNumero);
                break;
            case 5:
                numeroMayor(primerNumero, segundoNumero);
                break;
            case 6:
                numeroMenor(primerNumero, segundoNumero);
                break;
            case 7:
                potencia(primerNumero, segundoNumero);
                break;
            case 8:
                porcentaje(primerNumero, segundoNumero);
                break;
            case 9:
                Menu menu = new Menu();
                menu.mostrarMenu();
                break;



        }

    }

}
