import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import trabalho.trabalho2.Calculadora;

public class CalculadoraTest {

    @Test
    public void testSomar() {
        // Arrange (preparação)
        Calculadora calculadora = new Calculadora();
        
        // Act (execução)
        int resultado = calculadora.somar(3, 2);
        
        // Assert (verificação)
        assertEquals(5, resultado, "A soma de 3 + 2 deve ser 5");
    }
}
