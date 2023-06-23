package Week3_PL;

public class Tempo {
    /**
     * Atributos
     */
    private int hora;
    private int minuto;
    private int segundo;
    /**
     * Atributos por omissão
     */
    private final int HORA_POR_OMISSAO = 0;
    private final int MINUTO_POR_OMISSAO = 0;
    private final int SEGUNDO_POR_OMISSAO = 0;

    /**
     * Método que cria uma instância de tempo com todos os atributos passados por parâmetro
     * @param hora hora
     * @param minuto minuto
     * @param segundo segundo
     */
    public Tempo(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    /**
     * Método que cria uma instância de tempo com todos os atributos por omissão
     */
    public Tempo(){
        this.hora = HORA_POR_OMISSAO;
        this.segundo = SEGUNDO_POR_OMISSAO;
        this.minuto = MINUTO_POR_OMISSAO;
    }

    /**
     * Método que cria uma instância de tempo só com segundos
     * @param segundo segundos
     */
    public Tempo(int segundo){
        this.segundo = segundo;
    }

    /**
     * Método para mostrar os segundos de um determinado tempo
     * @return segundos
     */
    public int getSegundo() {
        return segundo;
    }
    /**
     * Método para mostrar os minutos de um determinado tempo
     * @return minutos
     */
    public int getMinuto() {
        return minuto;
    }

    /**
     * Método para mostrar as horas de um determinado tempo
     * @return horas
     */
    public int getHora() {
        return hora;
    }

    /**
     * Método para alterar os segundos de um dado tempo
     * @param segundo valor a ser alterado
     */
    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    /**
     * Método para alterar os minutos de um dado tempo
     * @param minuto valor a ser alterado
     */
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
    /**
     * Método para alterar as horas de um dado tempo
     * @param hora valor a ser alterado
     */
    public void setHora(int hora) {
        this.hora = hora;
    }

    /**
     * Método que devolve uma string descritiva do tempo
     * @return String informativa do estado do tempo no formato "hh:mm:ss";
     */
    @Override
    public String toString() {
        return "Tempo :" + "\n" +
                hora + ":" +
                + minuto + ":" +
                segundo;
    }
    /**
     * Método que devolve uma string descritiva do tempo
     * @return String informativa do estado do tempo no formato "hh:mm:ss" AM(ou PM);
     */
    public String toString2(){
        String status;
        if(hora < 12){
            status = "AM";
        }else{
            status = "PM";
            hora-=12; // passa a hora ao formato 12 horas
        }
        if(hora == 0){
            hora = 12;
        }
        return "Tempo :" + "\n" +
                hora + ":" +
                + minuto + ":" +
                segundo + " " +
                status;
    }
    /**
     * Método para adicionar um segundo a um determinado tempo
     */
    public void acrescentarUmSegundo(){
        this.segundo++;
    }

    /**
     * Método que verifica se um determinado tempo é maior que outro passado por parâmetro
     * @param outroTempo tempo a ser comparado
     * @return true se o tempo for maior que o tempo passado por parâmetro, falso se se verificar o contrário
     */
    public boolean eMaior (Tempo outroTempo){
        int segundosTempo1 = converterTempoEmSegundos();
        int segundosTempo2 = converterTempoEmSegundos(outroTempo);
        return segundosTempo1 > segundosTempo2;
    }

    /**
     * Método que verifica se um determinado tempo é maior que outro cuja hora, minuto e sgundo são passados por parâmetro
     * @param hora hora a ser comparada
     * @param minuto minuto a ser comparado
     * @param segundo segundo a ser comparado
     * @return true se o tempo for maior que o tempo passado por parâmetro, falso se se verificar o contrário
     */
    public boolean eMaior (int hora, int minuto, int segundo){
        int segundosTempo1 = converterTempoEmSegundos();
        int segundosTempo2 = converterTempoEmSegundos(hora, minuto, segundo);
        return segundosTempo1 > segundosTempo2;
    }

    /**
     * Método que converte um determinado tempo passado por parâmetro em segundos
     * @return tempo convertido em segundos
     */
    public int converterTempoEmSegundos (Tempo tempo){
        return converterTempoEmSegundos(tempo.hora, tempo.segundo, tempo.minuto);
    }

    /**
     * Transforma um Tempo em hora, minutos e segundos só em Segundos.
     * @param hora hora do Tempo a ser transformado
     * @param minuto minuto do Tempo a ser transformado
     * @param segundo segundo do Tempo a ser transformado
     * @return segundos do Tempo dado por parâmetro
     */
    public int converterTempoEmSegundos (int hora, int minuto, int segundo){
        return segundo + minuto*60 + hora*3600;
    }

    /**
     * Transforma o Tempo exclusivamente em Segundos.
     * @return o Tempo em Segundos
     */
    public int converterTempoEmSegundos() {
        return converterTempoEmSegundos(this.hora, this.minuto, this.segundo);
    }

    /**
     * Método que calcula o valor absoluto da diferença entre dois tempos
     * @param outroTempo outro tempo a ser considerado para a comparação
     * @return valor absoluto da diferença
     */
    public int diferencaEntreTemposSegundos(Tempo outroTempo){
        int segundos = this.converterTempoEmSegundos();
        int segundosOutroTempo = converterTempoEmSegundos(outroTempo);
        return Math.abs(segundos-segundosOutroTempo);
    }
    /**
     * Método que calcula o valor absoluto da diferença entre dois tempos
     * @param outroTempo outro tempo a ser considerado para a comparação
     * @return nova instância tempo que representa a diferença entre as duas instâncias consideradas
     */
    public Tempo diferencaEntreTempos(Tempo outroTempo){
        int diferencaSegundos = Math.abs(this.converterTempoEmSegundos() - converterTempoEmSegundos(outroTempo));
        Tempo segundos = new Tempo(diferencaSegundos);
        return segundos;
    }

}
