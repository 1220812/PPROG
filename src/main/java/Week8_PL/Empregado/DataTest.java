package Week8_PL.Empregado;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataTest {

    @Test
    void toAnoMesDiaString() {
        Data data = new Data(2023, 8,15);
        data.toAnoMesDiaString();
        String expected = "2023/08/15";
        assertEquals(data.toAnoMesDiaString(), expected);
    }

    @Test
    void testEquals() {
        Data data = new Data(2023, 8,15);
        Data data1 = new Data(2023, 8, 15);
        Data data2 = new Data(2022, 7,12);
        boolean expected = true;
        assertEquals(data.equals(data1), expected);
        assertNotEquals(data.equals(data2), expected);
    }

    @Test
    void compareTo() {
        Data data1 = new Data(2023, 8, 15);
        Data data2 = new Data(2022, 7,12);
        int expected = 1;
        assertEquals(data1.compareTo(data2), expected);
    }

    @Test
    void diaDaSemana() {
        Data data1 = new Data(2023, 8, 15);
        String expected = "Terça-feira";
        assertEquals(data1.diaDaSemana(), expected);
    }

    @Test
    void isMaior() {
        Data data = new Data(2023, 8, 15);
        Data data1 = new Data(2023, 8, 16);
        boolean expected = true;
        assertEquals(expected, data1.isMaior(data));
    }

    @Test
    void diferenca() {
        Data data = new Data(2023, 8, 15);
        Data data1 = new Data(2023, 8, 16);
        int expected = 1;
        assertEquals(data1.diferenca(data), expected);
    }

    @Test
    void testDiferenca() {
        Data data = new Data(2023, 8, 15);
        int expected = 1;
        assertEquals(expected, data.diferenca(2023, 8, 16));
    }

}