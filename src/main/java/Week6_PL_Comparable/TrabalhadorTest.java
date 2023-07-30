package Week6_PL_Comparable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrabalhadorTest {

    @Test
    void compareTo() {
        TrabalhadorHora t1 = new TrabalhadorHora("Pedro Guerra", 230, 8);
        TrabalhadorComissao t2 = new TrabalhadorComissao("Jorge Fernandes", 950, 200, 2);
        int diferencaEsperada = 886;
        assertEquals(t1.compareTo(t2), diferencaEsperada);
    }
}