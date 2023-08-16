package Week8_PL.Exposicao;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ExposicaoTest {

    @Test
    void testEquals() {
        Quadro quadro1 = new Quadro("Mona Lisa", "Leonardo DaVinci", 1600);
        Quadro quadro2 = new Quadro("A última ceia", "Miguel Ângelo", 1500);
        ArrayList<Quadro> listaQuadros = new ArrayList<>();
        listaQuadros.add(quadro1);
        listaQuadros.add(quadro2);
        Exposicao exposicao = new Exposicao("Porto Fest", listaQuadros,2004);
        Exposicao exposicao1 = new Exposicao("Porto Fest", listaQuadros,2004);
        Exposicao exposicao2 = new Exposicao("Lisboa Fest", listaQuadros,2014);
        boolean expected = true;
        assertEquals(expected, exposicao1.equals(exposicao));
        assertNotEquals(expected, exposicao1.equals(exposicao2));
    }

    @Test
    void compareTo() {
        Quadro quadro1 = new Quadro("Mona Lisa", "Leonardo DaVinci", 1600);
        Quadro quadro2 = new Quadro("A última ceia", "Miguel Ângelo", 1500);
        ArrayList<Quadro> listaQuadros = new ArrayList<>();
        listaQuadros.add(quadro1);
        listaQuadros.add(quadro2);
        Exposicao exposicao = new Exposicao("Porto Fest", listaQuadros,2004);
        Exposicao exposicao1 = new Exposicao("Porto Fest", listaQuadros,2004);
        Exposicao exposicao2 = new Exposicao("Lisboa Fest", listaQuadros,2014);
        int expected = 0;
        int expected1 = 1;
        assertEquals(expected, exposicao.compareTo(exposicao1));
        assertEquals(expected1, exposicao2.compareTo(exposicao1));
    }

    @Test
    void adicionarQuadro() {
        Quadro quadro1 = new Quadro("Mona Lisa", "Leonardo DaVinci", 1600);
        Quadro quadro2 = new Quadro("A última ceia", "Miguel Ângelo", 1500);
        ArrayList<Quadro> listaQuadros = new ArrayList<>();
        listaQuadros.add(quadro1);
        Exposicao exposicao = new Exposicao("Porto Fest", listaQuadros,2004);
        exposicao.adicionarQuadro(quadro2);
        ArrayList<Quadro> expected = new ArrayList<>();
        expected.add(quadro1);
        expected.add(quadro2);
        assertEquals(expected, listaQuadros);
    }

    @Test
    void removerQuadro() {
        Quadro quadro1 = new Quadro("Mona Lisa", "Leonardo DaVinci", 1600);
        Quadro quadro2 = new Quadro("A última ceia", "Miguel Ângelo", 1500);
        ArrayList<Quadro> listaQuadros = new ArrayList<>();
        listaQuadros.add(quadro1);
        listaQuadros.add(quadro2);
        Exposicao exposicao = new Exposicao("Porto Fest", listaQuadros,2004);
        exposicao.removerQuadro(quadro2);
        ArrayList<Quadro> expected = new ArrayList<>();
        expected.add(quadro1);
        assertEquals(expected, listaQuadros);
    }
}