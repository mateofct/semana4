import java.util.Scanner;
public class Launcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menuOpcion;
        do {
        Menu menu = new Menu();
        menu.mostrarMenu();
        menuOpcion = Menu.leerOpcion(scanner);
        Menu.ejecutarOpcion(menuOpcion, scanner);


        } while (menuOpcion != 6);
    }
}
