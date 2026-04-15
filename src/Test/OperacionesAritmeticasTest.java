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



}
