package Week9_PL;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaralhoTest {

    @Test
    void testEquals() {
        Baralho baralho = new Baralho();
        Baralho baralho1 = new Baralho();
        Baralho baralho2 = new Baralho(Baralho.Tipo.BAR_52);
        boolean expected = true;
        assertEquals(expected, baralho1.equals(baralho));
        assertNotEquals(expected, baralho1.equals(baralho2));
    }
}