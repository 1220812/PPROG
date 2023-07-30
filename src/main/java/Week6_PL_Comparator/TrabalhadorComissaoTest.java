package Week6_PL_Comparator;

import Week6_PL_Comparable.TrabalhadorComissao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrabalhadorComissaoTest {

    @Test
    void calcularVencimento() {
        Week6_PL_Comparable.TrabalhadorComissao t = new TrabalhadorComissao("João Sobral", 650, 25, 5);
        double salarioExpectavel = 651.25;
        assertEquals(t.calcularVencimento(), salarioExpectavel);
    }
}