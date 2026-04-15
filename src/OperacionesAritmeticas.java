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


    public static void ejecutarOpcion(int operacionSeleccionada, Scanner scanner) {

        switch (operacionSeleccionada) {
            case 1:
                Suma suma = new Suma();
                suma.ejecutarSuma(scanner);
                break;
            case 2:
                Resta resta = new Resta();
                resta.ejecutarResta(scanner);
                break;
            case 3:
                ejecutarMultiplicacion(scanner);
                break;
            case 4:
                ejecutarDivision(scanner);
                break;
            case 5:
                numeroMayor(scanner);
                break;
            case 6:
                numeroMenor(scanner);
                break;
            case 7:
                potencia(scanner);
                break;
            case 8:
                porcentaje(scanner);
                break;
            case 9:
                Menu menu = new Menu();
                menu.mostrarMenu();
                break;

        }

    }



    public static double[] pedirDatosMultipliacion(Scanner scanner){
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
        double[] datosMultiplicacion = pedirDatosMultipliacion(scanner);
        double primerNumero = datosMultiplicacion[0];
        double segundoNumero = datosMultiplicacion[1];
        double resultadoMultiplicacion = calcularMultiplicacion(primerNumero, segundoNumero);
        mostrarResultadoMultiplicacion(resultadoMultiplicacion);
    }
    public static double[] pedirDatoDivision(Scanner scanner){
        System.out.println("Ingrese el numerador:");
        double numerador = scanner.nextDouble();
        System.out.println("Ingrese el denominador:");
        double denominador = scanner.nextDouble();
        return new double[]{numerador, denominador};
    }
    public static double calcularDivision(double numerador, double denominador){
        double resultadoDivision = numerador / denominador;
        return resultadoDivision;
    }
    public static void mostrarResultadoDivision(double resultadoDivision) {
        System.out.println("El resultado de la división es: " + resultadoDivision);
    }
    public static void ejecutarDivision(Scanner scanner){
        double[] datosDivision = pedirDatoDivision(scanner);
        double numerador = datosDivision[0];
        double denominador = datosDivision[1];
        double resultadoMultiplicacion = calcularMultiplicacion(numerador, denominador);
        mostrarResultadoMultiplicacion(resultadoMultiplicacion);

    }

    public static void numeroMayor(Scanner scanner) {
        System.out.println("Ingrese el primer número:");
        double primerNumero = scanner.nextDouble();
        System.out.println("Ingrese el segundo número:");
        double segundoNumero = scanner.nextDouble();
        if (primerNumero > segundoNumero) {
            double resultadoNumeroMayor = primerNumero;
            System.out.println("El número mayor es: " + resultadoNumeroMayor);
        } else {
            double resultadoNumeroMayor = segundoNumero;
            System.out.println("El número mayor es: " + resultadoNumeroMayor);
        }
    }

    public static void numeroMenor(Scanner scanner) {
        System.out.println("Ingrese el primer número:");
        double primerNumero = scanner.nextDouble();
        System.out.println("Ingrese el segundo número:");
        double segundoNumero = scanner.nextDouble();
        if (primerNumero < segundoNumero) {
            double resultadoNumeroMenor = primerNumero;
            System.out.println("El número menor es: " + resultadoNumeroMenor);
        } else {
            double resultadoNumeroMenor = segundoNumero;
            System.out.println("El número menor es: " + resultadoNumeroMenor);
        }
    }

    public static void potencia(Scanner scanner) {
        System.out.println("Ingrese el valor del número base:");
        double numeroBase = scanner.nextDouble();
        System.out.println("Ingrese el valor del número exponente:");
        double numeroExponente = scanner.nextDouble();
        double resultadoPotencia = Math.pow(numeroBase, numeroExponente);
        System.out.println("El resultado de la potencia es: " + resultadoPotencia);

    }

    public static void porcentaje(Scanner scanner) {
        System.out.println("Ingrese el número de porcentaje:");
        double porcentaje = scanner.nextDouble();
        System.out.println("Ingrese el número del cual se quiere calcular el porcentaje:");
        double numeroBase = scanner.nextDouble();
        double resultadoPorcentaje = (porcentaje / 100) * numeroBase;
        System.out.println("El resultado del porcentaje es: " + resultadoPorcentaje);
    }
}
