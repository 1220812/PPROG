package Week5_PL_ContadoresDomesticos;

public class Gas extends Contadores {
    /**
     * custo de cada metro cúbico de gás
     */
    protected final double custoUnitario = 0.8;

    /**
     * Cria um contador de gás com os seguintes atributos :
     * @param consumoMesAtual consumo no mês atual
     * @param identificacao identificaçáo do contador
     * @param nomeCliente nome do cliente
     */
    public Gas (int consumoMesAtual, String identificacao, String nomeCliente){
        super(consumoMesAtual, identificacao, nomeCliente);
    }

    /**
     * Cria um contador de gás com todos os atributos por omissão
     */
    public Gas(){
        super();
    }

    /**
     * Calcula o custo do consumo de gás efetuado ao longo do mês
     * @return produto entre o consumo efetuado ao longo do mês pelo custo unitário do gás
     */
    @Override
    public double calcularCustoConsumo() {
        return getConsumoMesAtual() * custoUnitario;
    }

    /**
     * Mostra todas as informações acerca do contador de gás
     * @return string com todas as informações acerca do contador de gás
     */
    @Override
    public String toString() {
        return super.toString() + ", custo mensal de gás : " + calcularCustoConsumo() + " euros!";
    }
}
