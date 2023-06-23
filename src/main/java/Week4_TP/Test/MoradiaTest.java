package Week4_TP.Test;

import Week4_TP.Cores;
import Week4_TP.Moradia;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class MoradiaTest {

    @Test
    void getMorada() {
        Moradia moradia = new Moradia("Rua das flores", 90, Cores.CINZENTO);
        Assertions.assertEquals("Rua das flores", moradia.getMorada());
    }

    @Test
    void getArea() {
        Moradia moradia = new Moradia("Rua das flores", 90, Cores.CINZENTO);
        Assertions.assertEquals(90, moradia.getArea());
    }

    @Test
    void getCor() {
        Moradia moradia = new Moradia("Rua das flores", 90, Cores.CINZENTO);
        Assertions.assertEquals(Cores.CINZENTO, moradia.getCor());
    }

    @Test
    void setMorada() {
        Moradia moradia = new Moradia("Rua das flores", 90, Cores.CINZENTO);
        moradia.setMorada("Rua das árvores");
        Assertions.assertEquals("Rua das árvores", moradia.getMorada());
    }

    @Test
    void setArea() {
        Moradia moradia = new Moradia("Rua das flores", 90, Cores.CINZENTO);
        moradia.setArea(85);
        Assertions.assertEquals(85, moradia.getArea());
    }

    @Test
    void setCor() {
        Moradia moradia = new Moradia("Rua das flores", 90, Cores.CINZENTO);
        moradia.setCor(Cores.AZUL);
        Assertions.assertEquals(Cores.AZUL, moradia.getCor());
    }

    @Test
    void calcularImposto() {
        Moradia moradia = new Moradia("Rua das flores", 90, Cores.CINZENTO);
        double imposto = moradia.getArea() * 2;
        Assertions.assertEquals(imposto, moradia.calcularImposto());
    }
}