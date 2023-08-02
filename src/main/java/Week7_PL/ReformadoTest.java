package Week7_PL;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReformadoTest {

    @Test
    void calcularValorImposto() {
        Reformado r = new Reformado("Ana Pinto", "Lisboa", 240, 800);
        float impostoPrevisto = 15.2f;
        assertEquals(impostoPrevisto, r.calcularValorImposto());
    }
}