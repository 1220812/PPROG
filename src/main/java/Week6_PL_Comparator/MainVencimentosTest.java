package Week6_PL_Comparator;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class MainVencimentosTest {

    @Test
    public void testCompararNomes() {
        TrabalhadorComissao tc1 = new TrabalhadorComissao("Susana Ferreira", 500.0f, 1500.0f, 6f);
        TrabalhadorPeca tp1 = new TrabalhadorPeca("Jorge Silva", 20, 30);
        TrabalhadorHora th1 = new TrabalhadorHora("Carlos Miguel", 160, 3.5f);

        TrabalhadorComissao tc2 = new TrabalhadorComissao("Ana Santos", 400.0f, 1000.0f, 5f);
        TrabalhadorPeca tp2 = new TrabalhadorPeca("Pedro Almeida", 30, 50);
        TrabalhadorHora th2 = new TrabalhadorHora("Maria Oliveira", 180, 4.0f);

        // Now, compare the names using the comparator
        Comparator nomes = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String nomeTrab1 = ((Trabalhador) o1).getNome();
                String nomeTrab2 = ((Trabalhador) o2).getNome();
                return nomeTrab1.compareTo(nomeTrab2);
            }
        };

        assertEquals(18, nomes.compare(tc1, tc2));
        assertEquals(-6, nomes.compare(tp1, tp2));
        assertEquals(-10, nomes.compare(th1, th2));
    }
    @Test
    public void testCompararVencimentos() {
        TrabalhadorComissao tc1 = new TrabalhadorComissao("Susana Ferreira", 500.0f, 1500.0f, 6f);
        TrabalhadorPeca tp1 = new TrabalhadorPeca("Jorge Silva", 20, 30);
        TrabalhadorHora th1 = new TrabalhadorHora("Carlos Miguel", 160, 3.5f);

        TrabalhadorComissao tc2 = new TrabalhadorComissao("Ana Santos", 400.0f, 1000.0f, 5f);
        TrabalhadorPeca tp2 = new TrabalhadorPeca("Pedro Almeida", 30, 50);
        TrabalhadorHora th2 = new TrabalhadorHora("Maria Oliveira", 180, 4.0f);

        // Now, compare the earnings using the comparator

        Comparator vencimentos = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                float vencimentoTrab1 = ((Trabalhador) o1).calcularVencimento();
                float vencimentoTrab2 = ((Trabalhador) o2).calcularVencimento();
                if(vencimentoTrab1 < vencimentoTrab2){
                    return -1;
                } else if (vencimentoTrab2 > vencimentoTrab1) {
                    return 1;
                }else{
                    return 0;
                }
            }
        };

        assertEquals(0, vencimentos.compare(tc1, tc2));
        assertEquals(-1, vencimentos.compare(tp1, tp2));
        assertEquals(-1, vencimentos.compare(th1, th2));
    }
}