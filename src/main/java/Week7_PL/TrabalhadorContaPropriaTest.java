package Week7_PL;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrabalhadorContaPropriaTest {

    @Test
    void calcularValorImposto() {
        TrabalhadorContaPropria t = new TrabalhadorContaPropria("Ana Pinto", "Lisboa", 750, 200, "Canalizador");
        float impostoExpectavel = 26.5f;
        assertEquals(impostoExpectavel, t.calcularValorImposto());
    }
}