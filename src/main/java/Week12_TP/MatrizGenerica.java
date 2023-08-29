package Week12_TP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Representa uma matriz genérica
 *
 * @param <E> tipo genérico da matriz
 */
public class MatrizGenerica<E> {
    /**
     * Lista de elementos que irão preencher a matriz
     */
    private List<List<E>> matrizGenerica;
    /**
     * número limite de colunas da matriz a ser criada
     */
    private int numeroMaximoColunas;

    /**
     * Constroi uma matriz genérica
     */

    public MatrizGenerica() {
        this.matrizGenerica = new ArrayList<>();
        this.numeroMaximoColunas = 0;
    }

    /**
     * Devolve o número de linhas da matriz genérica
     * @return número de linhas que constituem a matriz a genérica
     */

    public int getNumeroDeLinhas() {
        return this.matrizGenerica.size();
    }

    /**
     * Devolve o número de colunas em cada linha especifica da matriz genérica
     * @param indiceLinha índice da linha cujo o número de colunas se quer verificar
     * @return número de colunas na linha cujo indice é passado por parâmetro
     */

    public int getNumeroDeColunas(int indiceLinha) {
        verificarIndiceLinha(indiceLinha);
        return this.matrizGenerica.get(indiceLinha).size();
    }

    /**
     * Limpa a matriz, isto é, apaga todos os elementos nela presentes
     */
    public void limpar() {
        this.matrizGenerica.clear();
    }

    /**
     * Devolve o tamanho da coluna, cujo o índice foi passado por parâmetro
     *
     * @param indice índice da coluna
     *
     * @return numero de linhas contidas na coluna cujo indice foi passado por parâmetro
     */
    private int tamanhoColuna(int indice){
        verificarIndiceColuna(indice);
        int numeroLinhas=0;
        for (List<E> linha : this.matrizGenerica) {
            if(indice<linha.size()){
                numeroLinhas++;
            }
        }
        return numeroLinhas;
    }

    /**
     * verifica se a linha cujo índice foi passado por parâmetro existe
     *
     * @param indice índice passado por parâmetro
     */
    private void verificarIndiceLinha(int indice) {
        if (indice < 0 || indice >= this.matrizGenerica.size()) {
            throw new IndexOutOfBoundsException(
                    "Índice Linha: " + indice
                            + ", Tamanho: " + this.matrizGenerica.size());
        }
    }

    /**
     * verifica se a coluna cujo índice foi passado por parâmetro existe
     *
     * @param indiceColuna índice passado por parâmetro
     */
    private void verificarIndiceColuna(int indiceColuna) {
        if (indiceColuna < 0 || indiceColuna >= this.numeroMaximoColunas) {
            throw new IndexOutOfBoundsException(
                    " Índice Coluna: " + indiceColuna
                            + ", Tamanho: " + this.numeroMaximoColunas);
        }
    }

    /**
     * Verifica se a linha e coluna cujos índice foram passados por parâmetro fazem parte da matriz
     *
     * @param indiceLinha indice da linha passado por parâmetro
     * @param indiceColuna indice da coluna passado por parâmetro
     */
    private void verificarIndices(int indiceLinha, int indiceColuna) {
        if (indiceLinha < 0
                || indiceLinha >= this.matrizGenerica.size()
                || indiceColuna < 0
                || indiceColuna >= this.matrizGenerica.get(indiceLinha).size()) {
            String mensagem = mensagemIndiceLinhaInvalido(indiceLinha) +
                    mensagemIndiceColunaInvalido(indiceLinha);
            throw new IndexOutOfBoundsException(mensagem);
        }
    }

    /**
     * Mensagem a surgir caso a linhas cujo o indice foi passado por parâmetro não faça parte da matriz
     *
     * @param indice índice da linha
     *
     * @return string informativa
     */
    private String mensagemIndiceLinhaInvalido(int indice) {
        return "Índice Linha: " + indice
                + ", Tamanho: " + this.matrizGenerica.size();
    }
    /**
     * Mensagem a surgir caso a coluna cujo o indice foi passado por parâmetro não faça parte da matriz
     *
     * @param indice índice da coluna
     *
     * @return string informativa
     */
    private String mensagemIndiceColunaInvalido(int indice) {
        return  " Índice Coluna: " + indice
                + ", Tamanho: " + this.matrizGenerica.get(indice).size();
    }

    /**
     * Devolve o elemento que se encontra na linha e coluna cujos índice foram passados por parâmetro
     *
     * @param indiceLinha índice da linha
     *
     * @param indiceColuna índice da coluna
     *
     * @return elemento na linha e coluna cujos índices foram passados por parâmetro
     */
    public E obterElementoMatriz (int indiceLinha, int indiceColuna){
        verificarIndices(indiceLinha, indiceColuna);
        return this.matrizGenerica.get(indiceLinha).get(indiceColuna);
    }

    /**
     * Adiciona uma nova linha à matriz genérica com os elementos da lista passado por parâmetro
     *
     * @param elementos elementos da lista
     */
    public void adicionarLinha (List<? extends E> elementos){
        List<E> novaLinha = new ArrayList<>(elementos);
        this.matrizGenerica.add(novaLinha);
    }

    /**
     * Verifica se um determinado elemento pertence à matriz genérica
     *
     * @param elemento elemento cuja existência na matriz vai ser verificada
     *
     * @return true se o elemento pertencer à matriz, falso se não pertencer
     */
    public boolean verificarElemento (E elemento){
        for (List<E> linha: matrizGenerica) {
            if(linha.contains(elemento)){
                return true;
            }
        }
        return false;
    }

    /**
     * Substitui o elemento na linha e coluna especificadas por outro elemento passado por parâmetro
     *
     * @param indiceLinha índice da linha
     *
     * @param indiceColuna índice da coluna
     *
     * @param elemento elemento que irá substituir o preexistente
     */
    public void substituirElemento (int indiceLinha, int indiceColuna, E elemento){
        verificarIndices(indiceLinha, indiceColuna);
        this.matrizGenerica.get(indiceLinha).set(indiceColuna, elemento);
    }

    /**
     * Remove a linha cujo índice foi passado por parâmetro da matriz
     *
     * @param indice índice da linha a ser removida
     */
    public void removerLinha (int indice){
        verificarIndiceLinha(indice);
        this.matrizGenerica.remove(indice);
    }

    /**
     * Retorna um array com os elementos existentes na matriz genérica na coluna cujo índice é especificado
     *
     * @param indiceColuna índice da coluna a ser copiada
     *
     * @param elementosColuna array a ser preenchido
     *
     * @return array preenchido pelos elementos
     */
    public E[] elementosColuna (int indiceColuna, E[] elementosColuna){
        verificarIndiceColuna(indiceColuna);
        // verifica se o array passdo por parâmetro precisa de ser redimensionado
        if(elementosColuna.length < matrizGenerica.size()){
            elementosColuna = Arrays.copyOf(elementosColuna, matrizGenerica.size());
        }
        // preenche o array com os elementos da coluna
        for (int i = 0; i < matrizGenerica.size() ; i++) {
            List<E> linha = matrizGenerica.get(i);
            if(indiceColuna < linha.size()){
                elementosColuna[i] = linha.get(indiceColuna);
                // caso haja mais espaços que elementos, os restantes espaços do array são preenchidos por null
            }else {
                elementosColuna[i] = null;
            }
        }
        return elementosColuna;
    }
}
