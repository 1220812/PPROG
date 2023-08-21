package Week9_PL;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaoDeJogoTest {

    Carta carta = new Carta(Carta.Tipo.Duque, Carta.Naipe.Espadas);
    Carta carta1 = new Carta(Carta.Tipo.Duque, Carta.Naipe.Ouros);
    Carta carta2 = new Carta(Carta.Tipo.As, Carta.Naipe.Espadas);
    Carta carta3 = new Carta(Carta.Tipo.Valete, Carta.Naipe.Espadas);

    List<Carta> listaCartaMao = new ArrayList<>();
    List<Carta> listaCartaMao1 = new ArrayList<>();

    @Test
    void tiposDeCarta() {
        listaCartaMao.add(carta);
        listaCartaMao.add(carta1);
        listaCartaMao.add(carta2);
        listaCartaMao.add(carta3);

        MaoDeJogo mao = new MaoDeJogo(listaCartaMao);

        List<Carta.Tipo> tiposCarta = new ArrayList<>();
        tiposCarta.add(Carta.Tipo.Duque);
        tiposCarta.add(Carta.Tipo.As);
        tiposCarta.add(Carta.Tipo.Valete);

        assertEquals(mao.tiposDeCarta(), tiposCarta);
    }

    @Test
    void contarCartasDoTipo() {
        listaCartaMao.add(carta);
        listaCartaMao.add(carta1);
        listaCartaMao.add(carta2);
        listaCartaMao.add(carta3);

        MaoDeJogo mao = new MaoDeJogo(listaCartaMao);

        int expected = 2;

        assertEquals(expected, mao.contarCartasDoTipo(Carta.Tipo.Duque));
    }

    @Test
    void testEquals() {
        listaCartaMao.add(carta);
        listaCartaMao.add(carta1);
        listaCartaMao.add(carta2);
        listaCartaMao.add(carta3);

        listaCartaMao1.add(carta);
        listaCartaMao1.add(carta1);
        listaCartaMao1.add(carta2);

        MaoDeJogo mao = new MaoDeJogo(listaCartaMao);

        MaoDeJogo mao1 = new MaoDeJogo(listaCartaMao1);

        MaoDeJogo mao2 = new MaoDeJogo(listaCartaMao);

        boolean expected = true;

        assertEquals(expected, mao2.equals(mao));
        assertNotEquals(expected, mao1.equals(mao2));
    }
}