package Week4_PL_Contribuintes;

public class Desempregado extends Contribuinte{
    /**
     * Número de meses em que o contribuinte se encontra na situação de desempregado
     */
    private int nMesesParado;
    /**
     * Número de meses na situação de desempregado por omissão
     */
    private final int NUMERO_MESES_PARADO_POR_OMISSAO = 0;
    /**
     * Taxa a ser aplicada sobrre o valor proveniente de outras fontes por parte do contribuinte
     */
    private final float taxaSobreOR = 2f;
    /**
     * Construtor de Contribuinte desempregado
     * @param nome nome do contribuinte
     * @param morada morada do contribuinte
     * @param outrosRendimentos valor proveniente de outras fontes
     * @param nMesesParado número de meses
     */
    public Desempregado(String nome, String morada, float outrosRendimentos, int nMesesParado){
        super(nome, morada, outrosRendimentos);
        this.nMesesParado = nMesesParado;
    }
    /**
     * Construtor de Contribuinte desempregado com todos os atributos por omissão
     */
    public Desempregado(){
        super();
        this.nMesesParado = NUMERO_MESES_PARADO_POR_OMISSAO;
    }
    /**
     * Modifica o número de meses em que o contribuinte se encontra na situação de desempregado
     * @param nMesesParado parâmetro a ser modificado, neste caso, o número de meses em que o contribuinte se encontra desempregado
     */
    public void setnMesesParado(int nMesesParado) {
        this.nMesesParado = nMesesParado;
    }

    /**
     * Mostra o número de meses em que o contribuinte se encontra na situação de desempregado
     * @return número de meses em que o contribuinte se encontra desempregado
     */
    public int getnMesesParado() {
        return nMesesParado;
    }

    /**
     * Calcula o valor do imposto que o contribuinte desempregado terá que pagar
     * @return produto entre o valor proveninete de outros rendimentos e a taxa a aplicar
     */
    @Override
    public float calcularValorImposto() {
        return getOutrosRendimentos() * (taxaSobreOR/100);
    }

    /**
     * Informação acerca do contribuinte desempregado
     * @return string informativa acerca do contribuinte (nome, morada, montante proveniente do trabalho, montante proveniente de outras fontes, número de meses desempregado e o valor a pagar de imposto)
     */
    @Override
    public String toString() {
        return super.toString() + ", está desempregado à " +
                nMesesParado +
                "e o imposto totaliza = " +
                calcularValorImposto() +
                " euros";
    }
}
