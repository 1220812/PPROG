package Week7_PL;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrabalhadorPorContaOutremTest {

    @Test
    void calcularValorImposto() {
        TrabalhadorPorContaOutrem t = new TrabalhadorPorContaOutrem("Ana Pinto", "Lisboa", 800, 200, "Sagres");
        float impostoExpectavel = 12;
        assertEquals(impostoExpectavel, t.calcularValorImposto());
    }
}