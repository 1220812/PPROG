package Week7_PL;

import java.util.Objects;

public class TrabalhadorContaPropria extends Contribuinte {
    /**
     * Profissão desempenhada pelo contribuinte
     */
    private String profissao;
    /**
     * Profissao do contribuinte por omissao
     */
    private final String PROFISSAO_POR_OMISSAO = "sem profissão";
    /**
     * taxa a ser aplicada sobre os rendimentos proveninetes do trabalho que o contribuinte desempenha
     */
    private final float taxaSobreRT = 3f;
    /**
     * taxa mínima a ser aplicada sobre os rendimentos provenientes de outras fontes
     */
    private final float taxaMinimaSobreOR = 2f;
    /**
     * taxa máxima a ser aplicada sobre os rendimentos provenientes de outras fontes
     */
    private final float taxaMaximaSobreOR = 5f;
    /**
     * Valor limite de rendimentos obtidos por outras fontes para que se aplique a taxa mínima
     */
    private final int valorLimite = 50000;

    /**
     * Construtor de trabalhador por conta própria
     *
     * @param nome               nome do contribuinte
     * @param morada             morada do contribuinte
     * @param rendimentoTrabalho rendimento proveniente do trabalho executado
     * @param outrosRendimentos  rendimento proveniente de outras fontes
     * @param profissao          profissao desempenhada pelo contribuinte
     */
    public TrabalhadorContaPropria(String nome, String morada, float rendimentoTrabalho, float outrosRendimentos, String profissao) {
        super(nome, morada, rendimentoTrabalho, outrosRendimentos);
        this.profissao = profissao;
    }

    /**
     * Construtor de trabalhador por conta própria com todos os atributos por omissão
     */
    public TrabalhadorContaPropria() {
        super();
        this.profissao = PROFISSAO_POR_OMISSAO;
    }

    /**
     * Mostra a profissão do contribuinte
     *
     * @return profissão do contribuinte
     */
    public String getProfissao() {
        return profissao;
    }

    /**
     * Modifica a profissão do contribuinte
     *
     * @param profissao parâmtetro a ser modificado, neste caso, a profissão do contribuinte
     */
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    /**
     * Calcula o valor do imposto que o Contribuinte terá que pagar com base nos montantes obtidos do trabalho por ele desempenhado e de outras fontes
     *
     * @return valor a ser pago
     */
    @Override
    public float calcularValorImposto() {
        float valorImposto = 0;
        if (getOutrosRendimentos() <= valorLimite) {
            valorImposto = getRendimentoTrabalho() * (taxaSobreRT / 100) + getOutrosRendimentos() * (taxaMinimaSobreOR / 100);
        } else {
            valorImposto = getRendimentoTrabalho() * (taxaSobreRT / 100) + getOutrosRendimentos() * (taxaMaximaSobreOR / 100);
        }
        return valorImposto;
    }

    /**
     * Informação acerca do contribuinte desempregado
     *
     * @return string informativa acerca do contribuinte (nome, morada, montante proveniente do trabalho, montante proveniente de outras fontes, profissão e o valor a pagar de imposto)
     */
    @Override
    public String toString() {
        return super.toString() + ", é trabalhador por conta própria, sendo" +
                profissao +
                "e o imposto a pagar, totaliza = " +
                calcularValorImposto() +
                " euros!";
    }
    /**
     * Compares this object with the specified object for equality.
     * The comparison is based on the equality of their respective 'profissao' fields.
     *
     * @param o The object to compare with this instance.
     * @return {@code true} if the given object is equal to this instance; {@code false} otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        TrabalhadorContaPropria that = (TrabalhadorContaPropria) o;
        return Objects.equals(profissao, that.profissao);
    }
}
