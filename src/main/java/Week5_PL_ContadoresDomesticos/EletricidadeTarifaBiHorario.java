package Week5_PL_ContadoresDomesticos;

public class EletricidadeTarifaBiHorario extends  Contadores{
    /**
     * Preço do KWH nas horas de vazio
     */
    protected final double tarifarioHorasDeVazio = 0.066;
    /**
     * Preço do KWH nas horas fora de Vazio
     */
    protected final double tarifarioHorasForasVazio = 0.14;
    /**
     * horas de vazio
     */
    private int horasDeVazio;
    /**
     * horas fora de vazio
     */
    private int horasForaVazio;
    /**
     * número de horas de vazio por omissão
     */
    protected final int HORAS_VAZIO_POR_OMISSAO = 0;
    /**
     * número de horas fora de vazio por omissão
     */
    protected final int HORAS_FORA_VAZIO_POR_OMISSAO = 0;
    /**
     * Mostra o número de horas de vazio
     * @return número de horas de vazio
     */
    public int getHorasDeVazio() {
        return horasDeVazio;
    }

    /**
     * Mostra o número de horas fora de vazio
     * @return número de horas fora de vazio
     */
    public int getHorasForaVazio() {
        return horasForaVazio;
    }

    /**
     * Modifica o número de horas de vazio
     * @param horasDeVazio atributo a ser alterado, neste caso, o número de horas de vazio
     */
    public void setHorasDeVazio(int horasDeVazio) {
        this.horasDeVazio = horasDeVazio;
    }

    /**
     * Modifica o número de horas fora de vazio
     * @param horasForaVazio atributo a ser alterado, neste caso, o número de horas fora de vazio
     */
    public void setHorasForaVazio(int horasForaVazio) {
        this.horasForaVazio = horasForaVazio;
    }

    /**
     * Constroí um contador de eletricidade bi-horário com os atributos :
     * @param identificacao identificação do construtor
     * @param nomeCliente nome do cliente que possui o contador
     * @param horasDeVazio horas de vazio
     * @param horasForaVazio horas fora de vazio
     */
    public EletricidadeTarifaBiHorario ( String identificacao, String nomeCliente, int horasDeVazio, int horasForaVazio){
        super(identificacao,nomeCliente);
        this.horasDeVazio = horasDeVazio;
        this.horasForaVazio = horasForaVazio;
    }

    /**
     * Constroí um contador de eletricidade bi-horário com todos os atributos por omissão
     */
    public EletricidadeTarifaBiHorario (){
        super();
        this.horasDeVazio = HORAS_VAZIO_POR_OMISSAO;
        this.horasForaVazio = HORAS_FORA_VAZIO_POR_OMISSAO;
    }

    /**
     * Mostra todas as informações acerca do contador de eletricidade de tarifa bi-horário
     * @return string com todas as informações acerca do contador de eletricidade de tarifa bi-horária
     */
    @Override
    public String toString() {
        return super.toString() + ", é um contador de eletricidade de tarifa bi-horária e o custo mensal é " +
                calcularCustoConsumo() + " euros!";
    }

    /**
     * calcula o custo mensal do consumo de eletricidade de tarifa bi-horária
     * @return soma dos produtos entre (horas de vazio e horas fora de vazio e as respetivas tarifas)
     */
    @Override
    public double calcularCustoConsumo() {
        return horasDeVazio * tarifarioHorasDeVazio + horasForaVazio * tarifarioHorasForasVazio;
    }
}
