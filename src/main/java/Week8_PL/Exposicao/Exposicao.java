package Week8_PL.Exposicao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Exposicao implements Comparable{
    /**
     * Designaçõa da exposição
     */
    private String designacao;
    /**
     * Ano da realização da exposição
     */
    private int anoRealizacao;
    /**
     * Designaçõa da exposição por omissão
     */
    private final String DESIGNACAO_POR_OMISSAO = "Sem nome";
    /**
     * Ano de realização da exposição por omissão
     */
    private final int ANO_REALIZACAO_POR_OMISSAO = 0;

    /**
     * Lista de quadros presentes na exposição
     */
    private List<Quadro> quadros;

    /**
     * Constroí uma instância de exposição com todos os atributos por omissão
     */
    public Exposicao (){
        this.anoRealizacao = ANO_REALIZACAO_POR_OMISSAO;
        this.designacao = DESIGNACAO_POR_OMISSAO;
        this.quadros = new ArrayList<>();
    }

    /**
     * Constroí uma instância de exposição com todos os aributos passados por parâmetro
     *
     * @param designacao designação da exposição
     * @param listaQuadros lista de quadros presentes na exposição
     * @param anoRealizacao ano de realização da exposição
     */
    public Exposicao (String designacao, List<Quadro> listaQuadros, int anoRealizacao){
        this.anoRealizacao = anoRealizacao;
        this.designacao = designacao;
        this.quadros = listaQuadros;
    }

    /**
     * Modifica a designação da exposição
     *
     * @param designacao nova designaçõa do quadro
     */
    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    /**
     * Modifica o ano de realização daa exposição
     *
     * @param anoRealizacao novo ano de realização da exposição
     */
    public void setAnoRealizacao(int anoRealizacao) {
        this.anoRealizacao = anoRealizacao;
    }

    /**
     * Devolve a designação do quadro
     *
     * @return designaçõa do quadro
     */
    public String getDesignacao() {
        return designacao;
    }

    /**
     * Devolve o ano de realização da exposição
     *
     * @return ano de realização da exposição
     */
    public int getAnoRealizacao() {
        return anoRealizacao;
    }

    /**
     * Devolve a lista de quadros que irá estar na exposição
     *
     * @return lista de quadros a ser exposta
     */
    public List<Quadro> getQuadros() {
        return quadros;
    }

    /**
     * Modifica a lista de quadros que irão ser expostos
     *
     * @param quadros nova lista de quadros
     */
    public void setQuadros(List<Quadro> quadros) {
        this.quadros = quadros;
    }

    /**
     * Compara a exposição com o objeto recebido por parâmetro
     *
     * @param o objeto a comparar com a exposição
     *
     * @return true se o objeto e a exposição apresentarem exatamente as mesmas características, false caso não apresentem
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exposicao exposicao = (Exposicao) o;
        return anoRealizacao == exposicao.anoRealizacao && Objects.equals(designacao, exposicao.designacao) && Objects.equals(quadros, exposicao.quadros);
    }

    /**
     * Devolve a descrição textual da exposição : designação, ano de realização e a lista de quadros expostos por ordem alfabética
     *
     * @return características da exposição
     */
    @Override
    public String toString() {
        Collections.sort(this.quadros);
        return "Exposicao : " +
                "designada de = " + designacao +
                ", realizada em " + anoRealizacao +
                ", conta com : " + quadros +
                " expostos!";
    }

     /**
     * Método que compara o ano de realização da exposição com o ano de realização do objeto passado por parâmetro
     *
     * @param o objeto a ser comparado
     *
     * @return 1, -1 ou 0 se o ano de realização da exposição for, respetivamente, maior, menor ou igual ao ano de realização do objeto passado por parâmetro
     */

    @Override
    public int compareTo(Object o) {
        Exposicao exposicao = (Exposicao) o;
        return Integer.compare(this.getAnoRealizacao(), exposicao.getAnoRealizacao());
    }

    /**
     * Adiciona o quadro passado por parâmetro à lista de quadros da exposição
     *
     * @param quadro quadro a ser adicionado à lista
     *
     * @return true se o quadro for adicionado à lista, false caso não seja
     */
   public boolean adicionarQuadro (Quadro quadro){
        return this.quadros.add(quadro);
   }

    /**
     * Remove o quadro passado por parâmetro da lista de quadros da exposição
     *
     * @param quadro quadro a ser removido da lista
     *
     * @return true se o quadro for removido da lista, false caso não seja
     */
   public boolean removerQuadro (Quadro quadro){
       return this.quadros.remove(quadro);
   }
}
