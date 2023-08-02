package Week7_PL;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DesempregadoTest {

    @Test
    void calcularValorImposto() {
        Desempregado d = new Desempregado("Ana Pinto", "Porto", 400, 5);
        float impostoPrevisto = 8;
        assertEquals(impostoPrevisto, d.calcularValorImposto());
    }
}