package Week7_PL;

public abstract class Contribuinte {
    /**
     * Nome do contribuinte
     */
    private String nome;
    /**
     * Morada do contribuinte
     */
    private String morada;
    /**
     * Rendimento proveniente do trabalho que executa
     */
    private float rendimentoTrabalho;
    /**
     * Rendimento proveniente de outras fontes
     */
    private float outrosRendimentos;
    /**
     * Nome do contribuinte por omissão
     */
    private final String NOME_POR_OMISSAO = "Sem nome";
    /**
     * Morada do contribuinte por omissão
     */
    private final String MORADA_POR_OMISSAO = "Sem morada";
    /**
     * Rendimento proveninete do trabalho executado peelo contribuinte por omissão
     */
    private final float RENDIMENTO_TRABALHO_POR_OMISSAO = 0f;
    /**
     * Rendimento proveninente de outras fontes por omissão
     */
    private final float OUTROS_RENDIMENTOS_POR_OMISSAO = 0f;
    /**
     * Construtor de contribuinte com todos os parâmetros
     */
    public Contribuinte(String nome, String morada, float rendimentoTrabalho, float outrosRendimentos){
        this.nome = nome;
        this.morada = morada;
        this.rendimentoTrabalho = rendimentoTrabalho;
        this.outrosRendimentos = outrosRendimentos;
    }
    /**
     * Construtor de contribuinte com todos os atributos por omissão
     */
    public Contribuinte(){
        this.nome = NOME_POR_OMISSAO;
        this.morada = MORADA_POR_OMISSAO;
        this.outrosRendimentos = OUTROS_RENDIMENTOS_POR_OMISSAO;
        this.rendimentoTrabalho = RENDIMENTO_TRABALHO_POR_OMISSAO;
    }
    /**
     * Construtor de contribuinte com rendimento proveninete do trabalho por omissão
     */
    public Contribuinte(String nome, String morada, float outrosRendimentos){
        this.nome = nome;
        this.morada = morada;
        this.outrosRendimentos = outrosRendimentos;
        this.rendimentoTrabalho = RENDIMENTO_TRABALHO_POR_OMISSAO;
    }
    /**
     * Mostra o nome do contribuinte
     * @return nome do contribuinte
     */
    public String getNome() {
        return nome;
    }

    /**
     * Modifica o nome do contribuinte
     * @param nome parâmetro a ser modificado, neste caso, o nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * Mostra a morada do contribuinte
     * @return morada do contribuinte
     */
    public String getMorada() {
        return morada;
    }

    /**
     * Modifica a morada do contribuinte
     * @param morada parâmetro a ser modificado, neste caso, a morada
     */
    public void setMorada(String morada) {
        this.morada = morada;
    }

    /**
     * Mostra o valor proveniente de outras fontes
     * @return valor proveniente de outras fontes
     */
    public float getOutrosRendimentos() {
        return outrosRendimentos;
    }

    /**
     * Modifica o valor proveniente de outras fontes
     * @param outrosRendimentos parâmetro a ser modificado, neste caso, o valor gerado a partir de outras fontes por parte do contribuinte
     */
    public void setOutrosRendimentos(float outrosRendimentos) {
        this.outrosRendimentos = outrosRendimentos;
    }

    /**
     * Mostra o rendimento proveniente do trabalho desempenhado pelo contribuinte
     * @return rendimento gerado pelo trabalho desempenhado pelo contribuinte
     */
    public float getRendimentoTrabalho() {
        return rendimentoTrabalho;
    }

    /**
     * Modifica o valor proveninente do trabalho desempenhado pelo contribuinte
     * @param rendimentoTrabalho parâmetro a ser modificado, neste caso, o valor gerado pelo trabalho desempenhado pelo contribuinte
     */
    public void setRendimentoTrabalho(float rendimentoTrabalho) {
        this.rendimentoTrabalho = rendimentoTrabalho;
    }

    /**
     * Informação acerca do contribuinte
     * @return string informativa acerca do contribuinte (nome, morada, montante proveniente do trabalho, montante proveniente de outras fontes)
     */
    @Override
    public String toString() {
        return "Contribuinte : " +
                "nome =" + nome +
                ", morada = " + morada +
                ", montante proveninte do trabalho = " + rendimentoTrabalho +
                "euros, montante proveninte de outras fontes =" + outrosRendimentos + " euros";
    }
    /**
     * Calcula o valor do imposto que o contribuinte terá que pagar, com base no valor mensal que este gerou (trabalho + outras rendimentos)
     * @return valor do imposto a pagar pelo contribuinte
     */
    public abstract float calcularValorImposto();
}
