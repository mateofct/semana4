public class FigurasGeometricas {
    // Cuadrado
    public static double permietroCuadrado(double lado) {
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
        return Math.PI * radio * (radio + generatriz); // generatriz es el lado del cono
    }
    public static double volumenCono(double radio, double altura) {
        return (Math.PI * radio * radio * altura) / 3.0;
    }
}
