package Week5_PL_Escola;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void calcularValorMensalCoordenador() {
        Professor professorCoordenador = new Professor("António Teixeira", 123456789, Categoria.COORDENADOR);
        double salarioExpectavel = 2250;
        assertEquals(professorCoordenador.calcularValorMensal(), salarioExpectavel);
    }

    @Test
    void calcularValorMensalAssistente(){
        Professor professorAssistente = new Professor("Maria Lopes", 987654321, Categoria.ASSISTENTE);
        double salarioExpectavel = 1500;
        assertEquals(professorAssistente.calcularValorMensal(), salarioExpectavel);
    }

    @Test
    void calcularValorMensalAdjunto(){
        Professor professorAdjunto = new Professor("Fabiana Lisboa", 987655678, Categoria.ADJUNTO);
        double salarioExpectavel = 1800;
        assertEquals(professorAdjunto.calcularValorMensal(), salarioExpectavel);
    }
}