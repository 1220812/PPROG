package Week5_TP;

public class Retangulo extends Figura {
    /**
     * Comprimento do retângulo
     */
    private double comprimento;
    /**
     * largura do retângulo
     */
    private double largura;
    /**
     * comprimento do retângulo por omissão
     */
    protected static final int COMPRIMENTO_POR_OMISSAO = 2;
    /**
     * largura do retângulo por omissão
     */
    protected static final int LARGURA_POR_OMISSAO = 1;

    /**
     * Construtor de um retângulo com os seguintes atributos:
     * @param comprimento comprimento
     * @param largura largura
     * @param cor cor
     */
    public Retangulo(double comprimento, double largura, String cor) {
        super(cor);
        this.comprimento = comprimento;
        this.largura = largura;
    }

    /**
     * Construtor de um retângulo com os seguintes atributos:
     * @param comprimento comprimento
     * @param largura largura
     * cor por omissão
     */

    public Retangulo(double comprimento, double largura) {
        super();
        this.comprimento = comprimento;
        this.largura = largura;
    }

    /**
     * construtor de um retângulo com os seguintes atributos:
     * @param cor cor
     * comprimento por omissão
     * largura por omissão
     */
    public Retangulo(String cor) {
        super(cor);
        comprimento = COMPRIMENTO_POR_OMISSAO;
        largura = LARGURA_POR_OMISSAO;
    }

    /**
     * Construtor de um retângulo com cor, comprimento e largura por omissão
     */
    public Retangulo() {
        super();
        comprimento = COMPRIMENTO_POR_OMISSAO;
        largura = LARGURA_POR_OMISSAO;
    }

    /**
     * Mostra o comprimento da figura
     * @return comprimento da figura em questão
     */
    public double getComprimento() {
        return comprimento;
    }

    /**
     * Mostra a largura da figura
     * @return largura da figura em questão
     */
    public double getLargura() {
        return largura;
    }

    /**
     * Modifica o comprimento da figura
     * @param comprimento atributo a ser modificado, no caso, o comprimento
     */
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    /**
     * Modifica a largura da figura
     * @param largura atributo a ser modificado, no caso, a largura
     */
    public void setLargura(double largura) {
        this.largura = largura;
    }

    /**
     * Informação acerca do retângulo
     * @return string informativa acerca do retângulo
     */
    @Override
    public String toString() {
        return String.format("Retângulo: comprimento=%.1f largura=%.1f %s",
                comprimento, largura, super.toString());
    }

    /**
     * Método que compara dois objetos do mesmo tipo e averigua se são iguais
     * @return valor booleano que traduz se os objetos comparados são ou não iguais
     */
    @Override
    public boolean equals(Object outroObjeto) {
        if (!super.equals(outroObjeto)) {
            return false;
        }
        Retangulo r = (Retangulo) outroObjeto;
        return this.comprimento == r.getComprimento() && this.largura == r.getLargura();
    }

    /**
     * Calcular area do retângulo
     * @return produto entre o comprimento e a largura do retângulo
     */
    @Override
    public double calcularArea() {
        return comprimento * largura;
    }
}
