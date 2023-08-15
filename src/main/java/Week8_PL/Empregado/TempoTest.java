package Week8_PL.Empregado;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TempoTest {

    @Test
    void testEquals() {
        Tempo tempo = new Tempo(15,15,15);
        Tempo tempo1 = new Tempo(15,15,15);
        Tempo tempo2 = new Tempo(15,16,16);
        boolean expected = true;
        assertEquals(tempo.equals(tempo1), expected);
        assertNotEquals(tempo1.equals(tempo2),expected);
    }

    @Test
    void compareTo() {
        Tempo tempo = new Tempo(15,15,15);
        Tempo tempo1 = new Tempo(15,15,15);
        int expected = 0;
        assertEquals(expected,tempo.compareTo(tempo1));
    }

    @Test
    void isMaior() {
        Tempo tempo = new Tempo(15,15,15);
        Tempo tempo1 = new Tempo(16,15,15);
        boolean expected = true;
        assertEquals(expected, tempo1.isMaior(tempo));
    }

    @Test
    void testIsMaior() {
        Tempo tempo = new Tempo(15,15,15);
        boolean expected = false;
        assertEquals(expected, tempo.isMaior(16,16,16));
    }

    @Test
    void diferencaEmSegundos() {
        Tempo tempo = new Tempo(15,15,15);
        Tempo tempo1 = new Tempo(15,15,16);
        int expected = 1;
        assertEquals(expected, tempo.diferencaEmSegundos(tempo1));
    }

    @Test
    void diferencaEmTempo() {
        Tempo tempo = new Tempo(15,15,15);
        Tempo tempo1 = new Tempo(15,15,16);
        Tempo expected = new Tempo(0,0,1);
        assertEquals(expected, tempo.diferencaEmTempo(tempo1));
    }
}