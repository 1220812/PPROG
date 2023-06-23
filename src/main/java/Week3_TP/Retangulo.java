package Week3_TP;

public class Retangulo extends Figura {
    /**
     * Comprimento do retângulo
     */
    private double comprimento;
    /**
     * Largura do retâñgulo
     */
    private double largura;
    /**
     * Valor do comprimento do retângulo por omissão
     */
    private static final int COMPRIMENTO_POR_OMISSAO = 2;
    /**
     * Valor da largura do retângulo por omissão
     */
    private static final int LARGURA_POR_OMISSAO = 1;

    /**
     * Construtor que cria uma instância do retângulo com cor, comprimento e largura
     * @param comprimento comprimento do retângulo
     * @param largura largura do retângulo
     * @param cor cor do retângulo
     */
    public Retangulo(double comprimento, double largura, String cor) {
        super(cor);
        this.comprimento = comprimento;
        this.largura = largura;
    }
    /**
     * Construtor que cria uma instância do retângulo com comprimento e largura
     * @param comprimento comprimento do retângulo
     * @param largura largura do retângulo
     */

    public Retangulo(double comprimento, double largura) {
        super();
        this.comprimento = comprimento;
        this.largura = largura;
    }
    /**
     * Construtor que cria uma instância do retângulo com cor, comprimento e largura por omissão
     * @param cor cor do retângulo
     */
    public Retangulo(String cor) {
        super(cor);
        comprimento = COMPRIMENTO_POR_OMISSAO;
        largura = LARGURA_POR_OMISSAO;
    }
    /**
     * Construtor que cria uma instância do retângulo com cor, comprimento e largura por omissão
     */
    public Retangulo() {
        super();
        comprimento = COMPRIMENTO_POR_OMISSAO;
        largura = LARGURA_POR_OMISSAO;
    }

    /**
     * Método que retorna o comprimento do retângulo
     * @return comprimento do retângulo
     */
    public double getComprimento() {
        return comprimento;
    }

    /**
     * Método que retorna a largura do retângulo
     * @return largura do retângulo
     */
    public double getLargura() {
        return largura;
    }

    /**
     * Método que permite alterar o comprimento do retângulo
     * @param comprimento novo comprimento do retângulo
     */
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
    /**
     * Método que permite alterar a largura do retângulo
     * @param largura nova largura do retângulo
     */

    public void setLargura(double largura) {
        this.largura = largura;
    }

    /**
     * Método para calcular a área do retângulo
     * @param largura largura do retângulo
     * @param comprimento comprimento do retângulo
     * @return area do retângulo
     */
    public double calcularArea(double largura, double comprimento){
        double area = largura * comprimento;
        return area;
    }
    /**
     * Método que mostra uma string informativa acerca das características do retângulo
     * @return string informativa das características do retângulo
     */
    @Override
    public String toString() {
        return String.format("Retângulo: comprimento=%.1f largura=%.1f %s area=%.1f",
                comprimento, largura, super.toString(), calcularArea(largura, comprimento));
    }
}