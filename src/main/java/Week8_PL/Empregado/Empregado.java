package Week8_PL.Empregado;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Representa um empregado através do primeiro e último nome, data do contrato, hora de entrada e saída
 */
public class Empregado {

    /**
     * Primeiro nome do empregado
     */
    private String primeiroNome;
    /**
     * último nome do empregado
     */
    private String ultimoNome;
    /**
     * data do contrato
     */
    private Data dataContrato;
    /**
     * hora de entrada
     */
    private Tempo horaEntrada;
    /**
     * hora de saída
     */
    private Tempo horaSaida;
    /**
     * Primeiro nome do empregado por omissão
     */
    private final String PRIMERO_NOME_POR_OMISSAO = "sem nome";
    /**
     * último nome do empregado por omissão
     */
    private final String ULTIMO_NOME_POR_OMISSAO = "sem nome";
    /**
     * Número de dias de trabalho semanais
     */
    private final int diasTrabalhoSemanais = 5;
    /**
     * Constroi uma instância de empregado com todos os atributos por omissão
     */
    public Empregado (){
        this.primeiroNome = PRIMERO_NOME_POR_OMISSAO;
        this.ultimoNome = ULTIMO_NOME_POR_OMISSAO;
        this.horaSaida = new Tempo();
        this.horaEntrada = new Tempo();
        this.dataContrato = new Data(LocalDate.now());
    }

    /**
     * Constroi uma instância de empregado com todos os atributos passados por parâmetro
     * @param primeiroNome primeiro nome do empregado
     * @param ultimoNome ultimo nome do empregado
     * @param horaSaida hora de saída do empregado
     * @param horaEntrada hora de entrada do empregado
     * @param dataContrato data de contrato do empregado
     */
    public Empregado (String primeiroNome, String ultimoNome, Tempo horaSaida, Tempo horaEntrada, Data dataContrato){
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.horaSaida = horaSaida;
        this.horaEntrada = horaEntrada;
        this.dataContrato = dataContrato;
    }

    /**
     * Constroí uma instância de empregado com os atributos de outro empregado passado por parâmetro
     * @param outroEmpregado outro empregado
     */
    public Empregado (Empregado outroEmpregado){
        this.dataContrato = outroEmpregado.getDataContrato();
        this.horaEntrada = outroEmpregado.getHoraEntrada();
        this.horaSaida = outroEmpregado.getHoraSaida();
        this.ultimoNome = outroEmpregado.getUltimoNome();
        this.primeiroNome = outroEmpregado.getPrimeiroNome();
    }
    /**
     * Devolve a hora de saída do empregado
     *
     * @return hora de saída do empregado
     */
    public Tempo getHoraSaida() {
        return horaSaida;
    }

    /**
     * Devolve a hora de entrada do empregado
     *
     * @return hora de entrada do empregado
     */
    public Tempo getHoraEntrada() {
        return horaEntrada;
    }

    /**
     * Devolve o ultimo nome do empregado
     *
     * @return ultimo nome do empregado
     */
    public String getUltimoNome() {
        return ultimoNome;
    }

    /**
     * Devolve o primeiro nome do empregado
     *
     * @return primeiro nome do empregado
     */
    public String getPrimeiroNome() {
        return primeiroNome;
    }

    /**
     * Devolve a data do contrato do empregado
     *
     * @return data do contrato do empregado
     */
    public Data getDataContrato() {
        return dataContrato;
    }

    /**
     * Modifica o ultimo nome do empregado
     *
     * @param ultimoNome novo ultimo nome do empregado
     */
    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    /**
     * Modifica o primeiro nome do empregado
     *
     * @param primeiroNome novo primeiro nome do empregado
     */
    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    /**
     * Modifica a hora de saída do empregado
     *
     * @param horaSaida nova hora de saída do empregado
     */
    public void setHoraSaida(Tempo horaSaida) {
        this.horaSaida = horaSaida;
    }

    /**
     * Modifica a hora de entrada do empregado
     *
     * @param horaEntrada nova hora de entrada do empregado
     */
    public void setHoraEntrada(Tempo horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    /**
     * Modifica a data de contrato do empregado
     *
     * @param dataContrato nova data de contrato do empregado
     */
    public void setDataContrato(Data dataContrato) {
        this.dataContrato = dataContrato;
    }

    /**
     * Método que retorna o número de horas de trabalho semanais do empregado
     *
     * @param horaEntrada hora de entrada do empregado
     * @param horaSaida hora de saída do empregado
     * @return produto entre o número de horas de trabalho diárias pelo número de dias de trabalho semanais
     */
    public int calcularNumeroHorasSemanais (Tempo horaEntrada, Tempo horaSaida){
        int numeroHorasSemanais = Math.abs(horaSaida.getHoras() - horaEntrada.getHoras());
        return numeroHorasSemanais * diasTrabalhoSemanais;
    }

    /**
     * Método que determina há quanto tempo o empregado foi contratado
     *
     * @param dataContrato data de contrato do empregado
     * @return diferença entre a data atual e a data em que o empregado assinou o contrato
     */
    public int determinarTempoDeContrato (Data dataContrato){
        return dataContrato.diferenca(Data.dataAtual());
    }
    /**
     * Devolve a descrição textual do empregado : primeiro e ultimo nome, data em que assinou o contrato, hora de entrada e saída.
     *
     * @return caraterísticas do empregado.
     */

    @Override
    public String toString() {
        return primeiroNome + " " + ultimoNome +
                ", assinou contrato numa : " +
                dataContrato +
                ", entra às " + horaEntrada +
                " e saí às " + horaSaida;
    }

    /**
     * Compara o empregado com o objeto recebido.
     *
     * @param o o objeto a comparar com o empregado.
     *
     * @return true se o objeto recebido representar um empregado com as mesmas características que o empregado. Caso contrário, retorna false.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empregado empregado = (Empregado) o;
        return Objects.equals(primeiroNome, empregado.primeiroNome) && Objects.equals(ultimoNome, empregado.ultimoNome) && Objects.equals(dataContrato, empregado.dataContrato) && Objects.equals(horaEntrada, empregado.horaEntrada) && Objects.equals(horaSaida, empregado.horaSaida);
    }
}
