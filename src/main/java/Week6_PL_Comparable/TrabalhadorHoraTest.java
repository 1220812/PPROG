package Week6_PL_Comparable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrabalhadorHoraTest {

    @Test
    void calcularVencimento() {
        TrabalhadorHora t = new TrabalhadorHora("Susana Alves", 180, 7);
        int salarioExpectavel = 1260;
        assertEquals(salarioExpectavel, t.calcularVencimento());
    }
}