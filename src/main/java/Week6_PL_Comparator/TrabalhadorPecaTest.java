package Week6_PL_Comparator;

import Week6_PL_Comparable.TrabalhadorPeca;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrabalhadorPecaTest {

    @Test
    void calcularVencimento() {
        Week6_PL_Comparable.TrabalhadorPeca t = new TrabalhadorPeca("Ana Figueira", 100, 76);
        int salarioExpectavel = 3070;
        assertEquals(t.calcularVencimento(), salarioExpectavel);
    }
}