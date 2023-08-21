package Week9_PL;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartaTest {

    @Test
    void testEquals() {
        Carta carta = new Carta(Carta.Tipo.Dama, Carta.Naipe.Copas);
        Carta carta1 = new Carta(Carta.Tipo.Dama, Carta.Naipe.Copas);
        Carta carta3 = new Carta(Carta.Tipo.As, Carta.Naipe.Copas);
        boolean expected = true;
        assertEquals(expected,carta.equals(carta1));
        assertNotEquals(expected, carta.equals(carta3));
    }

    @Test
    void compareTo() {
        Carta carta1 = new Carta(Carta.Tipo.Dama, Carta.Naipe.Copas);
        Carta carta3 = new Carta(Carta.Tipo.As, Carta.Naipe.Copas);
        int expected = -4; // Entre a Dama e o às existem (valete, rei, manilha e às)
        assertEquals(expected, carta1.compareTo(carta3));
    }
}