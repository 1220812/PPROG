package Week8_PL.Exposicao;

import java.util.Objects;

public class Quadro implements Comparable {
    /**
     * Designação do quadro
     */
    private String designacao;
    /**
     * Nome do autor do quadro
     */
    private String nomeAutor;
    /**
     * Ano de criação do quadro
     */
    private int anoCriacao;
    /**
     * Designação do quadro por omissão
     */
    private final String DESIGNACAO_POR_OMISSAO = "Sem designação";
    /**
     * Nome do autor do quadro por omissão
     */
    private final String NOME_AUTOR_POR_OMISSAO = "Sem nome";
    /**
     * Ano de criação do quadro por omissão
     */
    private final int ANO_CRIACAO_POR_OMISSAO = 0;

    /**
     * Devolve a designação do quadro
     *
     * @return designação do quadro
     */
    public String getDesignacao() {
        return designacao;
    }

    /**
     * Devolve o ano de criação do quadro
     *
     * @return ano de criação do quadro
     */
    public int getAnoCriacao() {
        return anoCriacao;
    }

    /**
     * Devolve o nome autor do quadro
     *
     * @return nome do autor do quadro
     */
    public String getNomeAutor() {
        return nomeAutor;
    }

    /**
     * Modifica a designação do quadro
     *
     * @param designacao nova designação do quadro
     */
    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    /**
     * Modifica o ano de criação do quadro
     *
     * @param anoCriacao novo ano de criação do quadro
     */
    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    /**
     * Modifica o autor do quadro
     *
     * @param nomeAutor novo autor do quadro
     */
    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    /**
     * Cria uma instância de quadro com todos os atributos passados por parâmetro
     *
     * @param designacao designação do quadro
     * @param nomeAutor nome do autor do quadro
     * @param anoCriacao ano de criação do quadro
     */
    public Quadro (String designacao, String nomeAutor, int anoCriacao){
        this.nomeAutor = nomeAutor;
        this.anoCriacao = anoCriacao;
        this.designacao = designacao;
    }

    /**
     * Cria uma instância de quadro com todos os atributos por omissão
     */
    public Quadro(){
        this.nomeAutor = NOME_AUTOR_POR_OMISSAO;
        this.designacao = DESIGNACAO_POR_OMISSAO;
        this.anoCriacao = ANO_CRIACAO_POR_OMISSAO;
    }

    /**
     * Compara o quadro com o objeto recebido por parâmetro
     *
     * @param o objeto a comparar com o quadro
     *
     * @return true se o objeto e o quadro apresentarem exatamente as mesmas características, false caso não apresentem
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quadro quadro = (Quadro) o;
        return anoCriacao == quadro.anoCriacao && Objects.equals(designacao, quadro.designacao) && Objects.equals(nomeAutor, quadro.nomeAutor);
    }

    /**
     * Devolve a descrição textual do quadro : designação do quadro, nome do autor e ano de criação
     *
     * @return características do quadro
     */
    @Override
    public String toString() {
        return "Quadro : " + "\n" +
                "designação = " + designacao +
                ", do autor = " + nomeAutor +
                ", foi pintado em " + anoCriacao;
    }

    /**
     * Método que compara o nome do autor de um quadro com o de um objeto passado por parâmetro
     *
     * @param o objeto a ser comparado
     *
     * @return 1, -1 ou 0 se o nome do autor do quadro for alfabeticamente, respetivamente, menor, maior ou igual
     */
    @Override
    public int compareTo(Object o) {
        Quadro quadro = (Quadro) o;
        return this.getNomeAutor().compareTo(quadro.getNomeAutor());
    }
}
