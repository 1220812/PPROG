package Week6_PL_Comparable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrabalhadorPecaTest {

    @Test
    void calcularVencimento() {
        TrabalhadorPeca t = new TrabalhadorPeca("Ana Figueira", 100, 76);
        int salarioExpectavel = 3070;
        assertEquals(t.calcularVencimento(), salarioExpectavel);
    }
}