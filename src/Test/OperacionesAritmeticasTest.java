import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class OperacionesAritmeticasTest {
    @Test
    void sumaNumerosPositivos() {
        double resultadoSuma = Suma.calcularSuma(5, 3);
        assertEquals(8, resultadoSuma);
    }
    @Test
    void sumaNumerosNegativos(){
        double resultadoSuma = Suma.calcularSuma(-5, -3);
        assertEquals(-8, resultadoSuma);
    }
    @Test
    void restaNumerosPositivos(){
        double resultadoResta = Resta.calcularResta(7,10);
        assertEquals(-3, resultadoResta);
    }
    @Test
    void restaNumerosNegativos(){
        double resultadoResta = Resta.calcularResta(-2,-3);
        assertEquals(1, resultadoResta);
    }
    @Test
    void multiplicacionSignosNegativo(){
        double resultadoMultiplicacion = Multiplicacion.calcularMultiplicacion(-0.5, -6);
        assertEquals(3, resultadoMultiplicacion);
    }
    @Test
    void multiplicacionPorCero(){
        double resultadoMultiplicacion = Multiplicacion.calcularMultiplicacion(55.5, 0);
        assertEquals(0, resultadoMultiplicacion);
    }
    @Test
    void divisionPorCero(){
        double resultadoDivision = Division.calcularDivision(40.3, 0);
        assertEquals(Double.POSITIVE_INFINITY, resultadoDivision);
    }
    @Test
    void divisionEntregaDecimales(){
        double resultadoDivision = Division.calcularDivision(55, 2);
        assertEquals(27.5, resultadoDivision);

    }
    @Test
    void comparacionNumeroMayorPositivos(){
        double resultadoComparacionNumeroMayor = NumeroMayor.compararNumeroMayor(0, -1);
        assertEquals(0, resultadoComparacionNumeroMayor);
    }
    @Test
    void comparacionNumeroMayorNegativos(){
        double resultadoComparacionNumeroMayor = NumeroMayor.compararNumeroMayor(-5.5, -1);
        assertEquals(-1, resultadoComparacionNumeroMayor);
    }
    @Test
    void comparacionNumeroMenorPositivos(){
        double resultadoComparacionNumeroMenor = NumeroMenor.compararNumeroMenor(21.9, 21.89);
        assertEquals(21.89, resultadoComparacionNumeroMenor);
    }
    @Test
    void comparacionNumeroMenorNegativos(){
        double resultadoComparacionNumeroMenor = NumeroMenor.compararNumeroMenor(-5.5, -1);
        assertEquals(-5.5, resultadoComparacionNumeroMenor);
    }
    @Test
    void calcularPotenciaConCeroExponente(){
        double resultadoPotencia = Potencia.calcularPotencia(5, 0);
        assertEquals(1, resultadoPotencia);
    }
    @Test
    void potenciaBaseYExponenteSonCero(){
        double resultadoPotencia = Potencia.calcularPotencia(0, 0);
        assertEquals(1, resultadoPotencia, "en java el cero elevado a 0 da 1 en vez de indeterminado");
    }
    @Test
    void porcentajeCien(){
        double resultadoPorcentaje = Porcentaje.calcularPorcentaje(100, 600);
        assertEquals(600, resultadoPorcentaje);
    }
    @Test
    void porcentajeCero(){
        double resultadoPorcentaje = Porcentaje.calcularPorcentaje(0, 600);
        assertEquals(0, resultadoPorcentaje);
    }



}
