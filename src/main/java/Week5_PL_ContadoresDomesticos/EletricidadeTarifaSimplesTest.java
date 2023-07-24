package Week5_PL_ContadoresDomesticos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EletricidadeTarifaSimplesTest {

    @Test
    void calcularCustoConsumo() {
        EletricidadeTarifaSimples eletricidadeTarifaSimples = new EletricidadeTarifaSimples(100, "ELECT-1", "Maria Silva", 3);
        EletricidadeTarifaSimples eletricidadeTarifaSimples1 = new EletricidadeTarifaSimples(100, "ELECT-2", "Leonel Pinto", 7);
        double custoMensalEsperadoContador1 = 13;
        double custoMensalEsperadoContador2 = 16;
        assertEquals(eletricidadeTarifaSimples.calcularCustoConsumo(), custoMensalEsperadoContador1);
        assertEquals(eletricidadeTarifaSimples1.calcularCustoConsumo(), custoMensalEsperadoContador2);
    }
}