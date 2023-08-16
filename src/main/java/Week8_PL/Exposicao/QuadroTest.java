package Week8_PL.Exposicao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadroTest {

    @Test
    void testEquals() {
        Quadro quadro = new Quadro("Mona Lisa", "Leonardo DaVinci", 1600);
        Quadro quadro1 = new Quadro("Mona Lisa", "Leonardo DaVinci", 1600);
        Quadro quadro2 = new Quadro("A última ceia", "Miguel Ângelo", 1500);
        boolean expected = true;
        assertEquals(expected, quadro1.equals(quadro));
        assertNotEquals(expected, quadro1.equals(quadro2));
    }

    @Test
    void compareTo() {
        Quadro quadro2 = new Quadro("A última ceia", "Miguel Ângelo", 1500);
        Quadro quadro1 = new Quadro("Mona Lisa", "Leonardo DaVinci", 1600);
        int expected = -1;
        assertEquals(expected, quadro1.compareTo(quadro2));
    }
}