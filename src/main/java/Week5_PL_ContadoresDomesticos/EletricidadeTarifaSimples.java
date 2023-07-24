package Week5_PL_ContadoresDomesticos;

public class EletricidadeTarifaSimples extends Contadores{
    /**
     * Potencia contratada
     */
    private double potenciaContratada;
    /**
     * valor da potencia contratada por defeito
     */
    protected final double POTENCIA_CONTRATADA_POR_DEFEITO = 0;
    /**
     * valor limite da potencia elétrica contratada para que seja aplicado o preço minimo do KWH
     */
    protected final double valorLimitePotencia = 6.9;
    /**
     * preço minimo a pagar por KWH de eletricidade
     */
    protected final double precoMinimoPorKwH = 0.13;
    /**
     * preço máximo a pagar por KWH de eletriciade
     */
    protected final double precoMaximoPorKwH = 0.16;

    /**
     * Cria um contador de eletricidade de tarifa simples com os seguintes atributos :
     * @param consumoMesAtual consumo no mês atual
     * @param identificacao identificaçáo do contador
     * @param nomeCliente nome do cliente
     * @param potenciaContratada poptencia contratada pelo cliente
     */
    public EletricidadeTarifaSimples (int consumoMesAtual, String identificacao, String nomeCliente, double potenciaContratada){
        super(consumoMesAtual, identificacao, nomeCliente);
        this.potenciaContratada = potenciaContratada;
    }
    /**
     * Cria um contador de eletricidade de tarifa simples com todos os atributos por omissão
     */
    public EletricidadeTarifaSimples (){
        super();
        this.potenciaContratada = POTENCIA_CONTRATADA_POR_DEFEITO;
    }

    /**
     * Mostra a potencia contratada pelo cliente
     * @return potencia contratada pelo cliente
     */
    public double getPotenciaContratada() {
        return potenciaContratada;
    }

    /**
     * Modifica o valor da potência contratada
     * @param potenciaContratada atributo a ser modificado, neste caso, a potência contratada pelo cliente
     */
    public void setPotenciaContratada(double potenciaContratada) {
        this.potenciaContratada = potenciaContratada;
    }

    /**
     * Calcula o valor a ser pago no corrente mês de acordo com a potencia contratada pelo cliente
     * @return produto entre o consumo de eletricidade no corrente mês e o preço do KWH (de acordo com a potência contratada)
     */
    @Override
    public double calcularCustoConsumo() {
        double custoConsumo = 0;
        if(potenciaContratada < valorLimitePotencia){
            custoConsumo = getConsumoMesAtual() * precoMinimoPorKwH;
        } else if (potenciaContratada >= valorLimitePotencia) {
            custoConsumo = getConsumoMesAtual() * precoMaximoPorKwH;
        }
        return custoConsumo;
    }

    /**
     * Mostra todas as informações acerca do contador de eletricidade de tarifa simples
     * @return string com todas as informações acerca do contador de eletricidade de tarifa simples
     */
    @Override
    public String toString() {
        return super.toString() + ", é um contador de eletricidade de tarifa simples, sendo que o custo mensal é de "
                + calcularCustoConsumo() + " euros!";
    }
}
