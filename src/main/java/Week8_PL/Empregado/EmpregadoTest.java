package Week8_PL.Empregado;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpregadoTest {

    @Test
    void calcularNumeroHorasSemanais() {
        Empregado empregado = new Empregado("Diogo", "Silva", new Tempo(17,0,0), new Tempo(8,0,0), new Data(2015, 3, 4));
        int expected = 45;
        assertEquals(expected, empregado.calcularNumeroHorasSemanais(new Tempo(8,0,0), new Tempo(17,0,0)));
    }

    @Test
    void determinarTempoDeContrato() {
        Empregado empregado = new Empregado("Diogo", "Silva", new Tempo(17,0,0), new Tempo(8,0,0), new Data(2015, 3, 4));
        int expected = 3086;
        assertEquals(expected, empregado.determinarTempoDeContrato(new Data(2015, 3, 4)));
    }

    @Test
    void testEquals() {
        Empregado empregado = new Empregado("Diogo", "Silva", new Tempo(17,0,0), new Tempo(8,0,0), new Data(2015, 3, 4));
        Empregado empregado1 = new Empregado("Diogo", "Silva", new Tempo(17,0,0), new Tempo(8,0,0), new Data(2015, 3, 4));
        Empregado empregado2 = new Empregado("Tiago", "Silva", new Tempo(17,0,0), new Tempo(8,0,0), new Data(2015, 3, 4));
        boolean expected = true;
        assertEquals(expected, empregado.equals(empregado1));
        assertNotEquals(expected, empregado1.equals(empregado2));
    }
}