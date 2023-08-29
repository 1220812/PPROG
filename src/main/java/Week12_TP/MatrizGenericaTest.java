package Week12_TP;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MatrizGenericaTest {

    @Test
    void obterElementoMatrizPrimitivo() {

        MatrizGenerica<Integer> integerMatrix = new MatrizGenerica<>();
        integerMatrix.adicionarLinha(Arrays.asList(1, 2, 3));

        assertEquals(Integer.valueOf(2), integerMatrix.obterElementoMatriz(0, 1));
    }

    @Test
    void adicionarLinhaPrimitivo() {

        MatrizGenerica<Integer> integerMatrix = new MatrizGenerica<>();
        List<Integer> novaLinha = Arrays.asList(4, 5, 6);
        integerMatrix.adicionarLinha(novaLinha);

        assertEquals(1, integerMatrix.getNumeroDeLinhas());
    }

    @Test
    void verificarElementoPrimitivo() {

        MatrizGenerica<Integer> integerMatrix = new MatrizGenerica<>();

        integerMatrix.adicionarLinha(Arrays.asList(1, 2, 3));
        integerMatrix.adicionarLinha(Arrays.asList(4, 5, 6));

        // Test the contemElemento method
        assertTrue(integerMatrix.verificarElemento(5));
        assertFalse(integerMatrix.verificarElemento(7));
    }

    @Test
    void substituirElementoPrimitivo() {

        MatrizGenerica<Integer> integerMatrix = new MatrizGenerica<>();

        integerMatrix.adicionarLinha(Arrays.asList(1, 2, 3));
        integerMatrix.adicionarLinha(Arrays.asList(4, 5, 6));

        integerMatrix.substituirElemento(1, 1, 9);

        assertEquals(Integer.valueOf(9), integerMatrix.obterElementoMatriz(1, 1));
    }

    @Test
    void removerLinhaPrimitivo() {

        MatrizGenerica<Integer> integerMatrix = new MatrizGenerica<>();

        integerMatrix.adicionarLinha(Arrays.asList(1, 2, 3));
        integerMatrix.adicionarLinha(Arrays.asList(4, 5, 6));

        integerMatrix.removerLinha(0);

        assertEquals(1, integerMatrix.getNumeroDeLinhas());
    }


    @Test
    void obterElementoMatrizGenericos() {

        MatrizGenerica<Object> integerMatrix = new MatrizGenerica<>();
        integerMatrix.adicionarLinha(Arrays.asList(1, 2, 3));

        assertEquals(2, integerMatrix.obterElementoMatriz(0, 1));
    }

    @Test
    void adicionarLinhaGenericos() {
        MatrizGenerica<Object> integerMatrix = new MatrizGenerica<>();

        List<Object> novaLinha = Arrays.asList(4, 5, 6);
        integerMatrix.adicionarLinha(novaLinha);

        assertEquals(1, integerMatrix.getNumeroDeLinhas());
    }

    @Test
    void verificarElementoGenericos() {

        MatrizGenerica<Object> integerMatrix = new MatrizGenerica<>();

        integerMatrix.adicionarLinha(Arrays.asList(1, 2, 3));
        integerMatrix.adicionarLinha(Arrays.asList(4, 5, 6));

        assertTrue(integerMatrix.verificarElemento(5));
        assertFalse(integerMatrix.verificarElemento(7));
    }

    @Test
    void substituirElementoGenericos() {

        MatrizGenerica<Object> integerMatrix = new MatrizGenerica<>();

        integerMatrix.adicionarLinha(Arrays.asList(1, 2, 3));
        integerMatrix.adicionarLinha(Arrays.asList(4, 5, 6));

        integerMatrix.substituirElemento(1, 1, 9);

        assertEquals(9, integerMatrix.obterElementoMatriz(1, 1));
    }

    @Test
    void removerLinhaGenericos() {

        MatrizGenerica<Object> integerMatrix = new MatrizGenerica<>();

        integerMatrix.adicionarLinha(Arrays.asList(1, 2, 3));
        integerMatrix.adicionarLinha(Arrays.asList(4, 5, 6));

        integerMatrix.removerLinha(0);

        assertEquals(1, integerMatrix.getNumeroDeLinhas());
    }
}