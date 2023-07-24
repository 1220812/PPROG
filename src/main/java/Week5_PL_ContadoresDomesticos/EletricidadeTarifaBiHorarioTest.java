package Week5_PL_ContadoresDomesticos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EletricidadeTarifaBiHorarioTest {

    @Test
    void calcularCustoConsumo() {
        EletricidadeTarifaBiHorario eletricidadeTarifaBiHorario = new EletricidadeTarifaBiHorario("ELECT-1", "Leonor Ribeiro", 100, 1400);
        double custoMensalEsperado = 202.60000000000002;
        assertEquals(eletricidadeTarifaBiHorario.calcularCustoConsumo(), custoMensalEsperado);
    }
}