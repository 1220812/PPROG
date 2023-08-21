package Week9_PL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Representa uma mão de jogo.
 */
public class MaoDeJogo {

    /**
     * A mão de jogo.
     */
    private List<Carta> maoDeJogo;

    /**
     * Constrói uma instância de {@code MaoDeJogo} recebendo um conjunto de
     * cartas.
     *
     * @param mao o conjunto de cartas.
     */
    public MaoDeJogo(List<Carta> mao) {
        maoDeJogo = new ArrayList(mao);
    }

    /**
     * Constrói uma instância de {@code MaoDeJogo} vazia, ou seja, sem cartas.
     */
    public MaoDeJogo() {
        maoDeJogo = new ArrayList<>();
    }

    /**
     * Constrói uma instância de {@code MaoDeJogo} com as mesmas caraterísticas
     * da mão de jogo recebida por parâmetro.
     *
     * @param outraMaoDeJogo a mão de jogo com as caraterísticas a copiar.
     */
    public MaoDeJogo(MaoDeJogo outraMaoDeJogo) {
        maoDeJogo = new ArrayList<>();
        for(Carta c : outraMaoDeJogo.maoDeJogo) {
            maoDeJogo.add(new Carta(c));
        }
    }

    /**
     * Devolve a mão de jogo.
     *
     * @return mão de jogo.
     */
    public List<Carta> getMaoDeJogo() {
        return new ArrayList<Carta>(maoDeJogo);
    }

    /**
     * Devolve a descrição textual da mão de jogo (uma carta por linha).
     *
     * @return caraterísticas das cartas da mão de jogo.
     */
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Carta c : maoDeJogo) {
            s.append(c.toString());
            s.append("\n");
        }
        return s.toString();
    }

    /**
     * Devolve um conjunto com os vários tipos de carta (duque, terno, etc.)
     * existentes na mão de jogo.
     *
     * @return {@code List} com os tipos de carta existentes na mão de jogo.
     */
    public List<Carta.Tipo> tiposDeCarta() {
        List <Carta.Tipo> tiposCartaNaMao = new ArrayList<>();
        for (Carta carta : this.maoDeJogo) {
            if(!tiposCartaNaMao.contains(carta.getTipo())){
                tiposCartaNaMao.add(carta.getTipo());
            }
        }
        return tiposCartaNaMao;
    }

    /**
     * Determina quantas cartas de um dado tipo existem na mão de jogo.
     *
     * @param tipo o tipo de carta.
     * @return quantidade de cartas do tipo, que existem na mão de jogo.
     */
    public int contarCartasDoTipo(Carta.Tipo tipo) {
        int contador = 0;
        for (Carta carta : this.maoDeJogo) {
            if(carta.getTipo().equals(tipo)){
                contador ++;
            }
        }
        return contador;
    }

    /**
     * Ordena a mão de jogo por naipe e, dentro do mesmo naipe, ordena por tipo.
     */
    public void ordenar() {
        Collections.sort(this.maoDeJogo);
    }

    /**
     * Compara a mão de jogo com o objeto recebido por parâmetro
     *
     * @param o outro objeto a comparar com a mão de jogo
     * @return true se o objeto recebido representar outra mão de jogo equivalente à
     *         mão de jogo. Caso contrário, retorna false.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MaoDeJogo maoDeJogo1 = (MaoDeJogo) o;
        return Objects.equals(maoDeJogo, maoDeJogo1.maoDeJogo);
    }
}