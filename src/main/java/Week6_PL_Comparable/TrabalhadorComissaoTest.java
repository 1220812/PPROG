package Week6_PL_Comparable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrabalhadorComissaoTest {

    @Test
    void calcularVencimento() {
        TrabalhadorComissao t = new TrabalhadorComissao("João Sobral", 650, 25, 5);
        double salarioExpectavel = 651.25;
        assertEquals(t.calcularVencimento(), salarioExpectavel);
    }
}