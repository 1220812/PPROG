package Week6_PL_Comparator;

import Week6_PL_Comparable.TrabalhadorHora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrabalhadorHoraTest {

    @Test
    void calcularVencimento() {
        Week6_PL_Comparable.TrabalhadorHora t = new TrabalhadorHora("Susana Alves", 180, 7);
        int salarioExpectavel = 1260;
        assertEquals(salarioExpectavel, t.calcularVencimento());
    }
}