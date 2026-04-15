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



}
