import java.util.Scanner;
public class Menu {
    public void mostrarMenu() {
        System.out.println("Seleccione una de las siguientes operaciones:");
        System.out.println("1. Operaciones aritméticas");
        System.out.println("2. Ecuación cuadrática");
        System.out.println("3. Figuras geométricas");
        System.out.println("4. Sistema ecuaciones lineales");
        System.out.println("5. Ecuación de la recta");
        System.out.println("6. Salir");

    }

    public static int leerOpcion(Scanner scanner) {
        int opcionSelecionada = scanner.nextInt();
        return opcionSelecionada;
    }
    public static void ejecutarOpcion(int menuOpcion, Scanner scanner) {
        switch(menuOpcion) {
            case 1:
                /**OperacionesAritmeticas
                break;
            case 2:
                EcuacionCuadratica
                break;
            case 3:
                FigurasGeometricas
                break;
            case 4:
                SistemaEcuacionesLineales
                break;
            case 5:
                EcuacionRecta
                break;**/
            case 6:
                break;
        }

    }




}
