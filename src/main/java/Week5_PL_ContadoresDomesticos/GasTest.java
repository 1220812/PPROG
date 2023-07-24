package Week5_PL_ContadoresDomesticos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasTest {

    @Test
    void calcularCustoConsumo() {
        Gas contadorGas = new Gas(100, "GAS-1", "José Pacheco");
        double custoConsumoPrevisivel = 80.0;
        assertEquals(contadorGas.calcularCustoConsumo(), custoConsumoPrevisivel);
    }
}