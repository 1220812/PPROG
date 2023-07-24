package Week5_PL_ContadoresDomesticos;

public abstract class Contadores {
    /**
     * Consumo do mês atual
     */
    private int consumoMesAtual;
    /**
     * Identificação do contador
     */
    private String identificacao;
    /**
     * Nome do cliente que possui o contador
     */
    private String nomeCliente;
    /**
     * Consumo do mês atual por defeito
     */
    protected final int CONSUMO_MES_ATUAL_POR_OMISSAO = 0;
    /**
     * Identificação do contador por defeito
     */
    protected final String IDENTIFICACAO_POR_DEFEITO = "sem nome";
    /**
     * Nome do cliente por defeito
     */
    protected final String NOME_CLIENTE_POR_DEFEITO = "sem nome";
    /**
     * Mostra o consumo feito no mês atual
     * @return consumo do mês atual
     */
    public int getConsumoMesAtual() {
        return consumoMesAtual;
    }
    /**
     * Mostra a identificação do condutor
     * @return identificação do condutor
     */
    public String getIdentificacao() {
        return identificacao;
    }

    /**
     * Mostra o nome do cliente que possuí o contador
     * @return nome do cliente que possuí o contador
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * Modifica o consumo feito no mês atual
     * @param consumoMesAtual atributo a ser modificado, neste caso, o consumo do mês atual
     */
    public void setConsumoMesAtual(int consumoMesAtual) {
        this.consumoMesAtual = consumoMesAtual;
    }
    /**
     * Modifica a identificação do contador
     * @param identificacao atributo a ser modificado, neste caso, a identificação do contador
     */
    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    /**
     * Modifica o nome do cliente que possuí o contador
     * @param nomeCliente atributo a ser modificado, neste caso, o nome do cliente
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /**
     * Constroi o contador com os seguintes atributos :
     * @param consumoMesAtual consumo do mês atual
     * @param identificacao identificação do contador
     * @param nomeCliente nome do cliente que possui o contador
     */
    public Contadores (int consumoMesAtual, String identificacao, String nomeCliente){
        this.consumoMesAtual = consumoMesAtual;
        this.identificacao = identificacao;
        this.nomeCliente = nomeCliente;
    }

    /**
     * Constroi o contador com todos os atributos por omissão
     */
    public Contadores(){
        this.consumoMesAtual = CONSUMO_MES_ATUAL_POR_OMISSAO;
        this.nomeCliente = NOME_CLIENTE_POR_DEFEITO;
        this.identificacao = IDENTIFICACAO_POR_DEFEITO;
    }

    /**
     * Constroi o contador com identificação e nome de cliente
     * @param identificacao identificação do contador
     * @param nomeCliente nome do cliente
     */
    public Contadores(String identificacao, String nomeCliente){
        this.identificacao = identificacao;
        this.nomeCliente = nomeCliente;
    }

    /**
     * Mostra todas as informações acerca do contador
     * @return string com todas as informações acerca do contador
     */
    @Override
    public String toString() {
        return "Contador : " + "\n" +
                "consumo no mês atual = " + consumoMesAtual +
                ", identificação do contador : " + identificacao +
                ", nome do cliente : " + nomeCliente;
    }

    /**
     * Calcula o custo a pagar no respetivo mês com base no consumo ao longo do mesmo
     * @return custo no mês atual
     */
    public abstract double calcularCustoConsumo();
}
