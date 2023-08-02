package Week7_PL;

import java.util.Objects;

public class TrabalhadorPorContaOutrem extends Contribuinte {
    /**
     * nome da empresa que emprega o contribuinte
     */
    private String nomeEmpresa;
    /**
     * nome da empresa que emprega o contribuinte por omissão
     */
    private final String NOME_EMPRESA_POR_OMISSAO = "sem empresa";
    /**
     * Taxa mínima a ser aplicada sobre o rendimento proveniente do trabalho desempenhado pelo contribuinte
     */
    private final float taxaMinimaSobreRT = 1f;
    /**
     * Taxa máxima a ser aplicada sobre o rendimento proveniente do trabalho desempenhado pelo contribuinte
     */
    private final float taxaMaximaSobreRT = 2f;
    /**
     * taxa a ser aplicada sobre o rendimento proveniente de outras fontes
     */
    private final float taxaSobreOR = 2f;
    /**
     * Valor limite proveniente de outras fontes para que se aplique a taxa mínima
     */
    private final int valorLimite = 30000;

    /**
     * Construtor de trabalhador por conta de outrem
     * @param nome               nome do contribuinte
     * @param morada             morada do contribuinte
     * @param rendimentoTrabalho rendimento proveniente do trabalho executado
     * @param outrosRendimentos  rendimento proveniente de outras fontes
     * @param nomeEmpresa nome da empresa empregadora do contribuinte
     */
    public TrabalhadorPorContaOutrem(String nome, String morada, float rendimentoTrabalho, float outrosRendimentos, String nomeEmpresa) {
        super(nome, morada, rendimentoTrabalho, outrosRendimentos);
        this.nomeEmpresa = nomeEmpresa;
    }

    /**
     * Construtor de trabalhador por conta de outrem com o nome da empresa por omissão
     */
    public TrabalhadorPorContaOutrem() {
        super();
        this.nomeEmpresa = NOME_EMPRESA_POR_OMISSAO;
    }

    /**
     * Mostra o nome da empresa que emprega o contribuinte
     * @return nome da empresa empregadora
     */
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    /**
     * Modifica o nome da empresa que emprega o contribuinte
     * @param nomeEmpresa parâmetro a ser modificado, neste caso, o nome da empresa
     */
    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    /**
     * Calcula o valor do imposto que o Contribuinte terá que pagar com base nos montantes obtidos do trabalho por ele desempenhado e de outras fontes
     * @return valor a ser pago
     */
    @Override
    public float calcularValorImposto() {
        float valorImposto = 0;
        if(getRendimentoTrabalho() <= valorLimite){
            valorImposto = getRendimentoTrabalho() * (taxaMinimaSobreRT/100) + getOutrosRendimentos() * (taxaMaximaSobreRT/100);
        }else{
            valorImposto = getRendimentoTrabalho() * (taxaMaximaSobreRT/100) + getOutrosRendimentos() * (taxaSobreOR/100);
        }
        return valorImposto;
    }
    /**
     * Informação acerca do contribuinte desempregado
     * @return string informativa acerca do contribuinte (nome, morada, montante proveniente do trabalho, montante proveniente de outras fontes, nome da empresa que o emprega e o valor a pagar de imposto)
     */
    @Override
    public String toString() {
        return super.toString() + ", é trabalhador por conta de outrem" +
                ", desempenhando funções na empresa : " + nomeEmpresa +
                "sendo que o imposto que este terá que pagar totaliza = " +
                calcularValorImposto() +
                " euros!";
    }

    /**
     * Compares this object with the specified object for equality.
     * The comparison is based on the equality of their respective 'nomeEmpresa' fields.
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
        TrabalhadorPorContaOutrem newOne = (TrabalhadorPorContaOutrem) o;
        return Objects.equals(nomeEmpresa, newOne.nomeEmpresa);
    }
}
