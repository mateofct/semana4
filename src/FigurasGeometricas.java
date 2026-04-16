import java.util.Scanner;

public class FigurasGeometricas {
    // Cuadrado
    public static double perimetroCuadrado(double lado) {
        return 4 * lado;
    }
    public static double areaCuadrado(double lado) {
        return lado * lado;
    }
    // Rectangulo
    public static double perimetroRectangulo(double base, double altura) {
        return 2 * (base + altura);
    }
    public static double areaRectangulo(double base, double altura) {
        return base * altura;
    }
    // Circulo
    public static double perimetroCirculo(double radio) {
        return 2 * Math.PI * radio;
    }
    public static double areaCirculo(double radio) {
        return Math.PI * radio * radio;
    }
    // Esfera
    public static double areaEsfera(double radio) {
        return 4 * Math.PI * Math.pow(radio, 2);
    }
    public static double volumenEsfera(double radio) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    }
    // Cubo
    public static double areaCubo(double arista) {
        return 6 * Math.pow(arista, 2);
    }
    public static double volumenCubo(double arista) {
        return Math.pow(arista, 3);
    }
    // Cono
    public static double areaCono(double radio, double altura) {
        double generatriz = Math.sqrt(radio * radio + altura * altura);
        return Math.PI * radio * (radio + generatriz); // generatriz es la altura inclinada del cono
    }
    public static double volumenCono(double radio, double altura) {
        return (Math.PI * radio * radio * altura) / 3.0;
    }

    public static void figurasMenu(Scanner scanner) {
        System.out.println("\n Figuras Geométricas");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectangulo");
        System.out.println("3. Circulo");
        System.out.println("4. Esfera");
        System.out.println("5. Cubo");
        System.out.println("6. Cono");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Lado: ");
                double lado = scanner.nextDouble();
                System.out.println("Area: " + areaCuadrado(lado));
                System.out.println("Perimetro: " + perimetroCuadrado(lado));
                break;

            case 2:
                System.out.print("Base: ");
                double base = scanner.nextDouble();
                System.out.print("Altura: ");
                double altura = scanner.nextDouble();
                System.out.println("Area: " + areaRectangulo(base, altura));
                System.out.println("Perimetro: " + perimetroRectangulo(base, altura));
                break;

            case 3:
                    System.out.print("Radio: ");
                    double radio = scanner.nextDouble();
                    System.out.println("Area: " + areaCirculo(radio));
                    break;
            case 4:
                System.out.print("Radio: ");
                double radioEsfera = scanner.nextDouble();
                System.out.println("Volumen: " + volumenEsfera(radioEsfera));
                break;

            case 5:
                    System.out.println("Arista: ");
                    double arista = scanner.nextDouble();
                    System.out.println("Area: " + areaCubo(arista));
                    System.out.println("Volumen: " + volumenCubo(arista));
                    break;

            case 6:
                        System.out.println("Radio: ");
                        double radioCono = scanner.nextDouble();
                        System.out.println("Altura: ");
                        double alturaCono = scanner.nextDouble();
                        System.out.println("Area: " + areaCono(radioCono, alturaCono));
                        System.out.println("Volumen: " + volumenCono(radioCono, alturaCono));
                        break;

            default:
                System.out.println("Opcion invalida");
        }
    }
}
