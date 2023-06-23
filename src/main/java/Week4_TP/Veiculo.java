package Week4_TP;

public class Veiculo implements Cores, Tributavel {
    /**
     * Matrícula do veículo
     */
    private String matricula;
    /**
     * Cilindrada do veículo
     */
    private int cilindrada;
    /**
     * Cor do veículo
     */
    private String cor;

    /**
     * Valor de cilindrada limite para um veículo ser considerado de escalão 1
     */
    private static int limiteEscalao1 = 1500;
    /**
     * Valor do imposto a pagar para um veículo de escalão 1
     */
    private static double impostoEscalao1 = 15;
    /**
     * Valor do imposto a pagar para um veículo de escalão 2
     */
    private static double impostoEscalao2 = 40;

    /**
     * Construtor de uma instância de veículo com matricula, cilindrada e cor
     *
     * @param matricula  matrícula do automóvel criado
     * @param cilindrada cilindrada do automóvel criado
     * @param cor        cor do automóvel criado
     */

    public Veiculo(String matricula, int cilindrada, String cor) {
        this.matricula = matricula;
        this.cilindrada = cilindrada;
        this.cor = cor;
    }

    /**
     * Método que mostra a matrícula do automóvel
     *
     * @return matrícula do automóvel
     */

    public String getMatricula() {
        return matricula;
    }

    /**
     * Método que mostra a cilindrada do automóvel
     *
     * @return cilindrada do automóvel
     */

    public int getCilindrada() {
        return cilindrada;
    }

    /**
     * Método que mostra a cor do automóvel
     *
     * @return cor do automóvel
     */
    public String getCor() {
        return cor;
    }

    /**
     * Método para alterar a matrícula do automóvel
     *
     * @param matricula parâmetro a ser alterado
     */

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Método para alterar a cilindrada do automóvel
     *
     * @param cilindrada parâmetro a ser alterado
     */

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    /**
     * Método para alterar a cor do automóvel
     *
     * @param cor parâmetro a ser alterado
     */

    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * String informativa acerca das características do veículo
     *
     * @return String com as características do veículo
     */
    @Override
    public String toString() {
        return String.format("Veículo com matrícula %s e cilindrada %d tem cor %s",
                matricula, cilindrada, cor);
    }

    /**
     * Método que compara o valor da cilindrada de um veículo com o valor limite e verifica em que escalão se encontra o veículo, retornando o valor a pagar
     * @return valor do imposto a pagar
     */
    @Override
    public double calcularImposto() {
        double valorImposto;
        if(cilindrada < limiteEscalao1){
            valorImposto = impostoEscalao1;
        }else{
            valorImposto = impostoEscalao2;
        }
        return valorImposto;
    }
}
