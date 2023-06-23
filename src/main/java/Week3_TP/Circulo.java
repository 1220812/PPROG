package Week3_TP;

public class Circulo extends Figura {
    /**
     * raio do círculo
     */
    private double raio;
    /**
     * valor do raio do círculo por omissão
     */
    private static final int RAIO_POR_OMISSAO = 1;

    /**
     * Construtor que cria uma instância de circulo com raio e cor
     * @param raio raio do círculo
     * @param cor cor do círculo
     */
    public Circulo(double raio, String cor) {
        super(cor);
        this.raio = raio;
    }

    /**
     * Construtor que cria uma instância de círculo com raio e cor (por omissão)
     * @param raio raio do círculo
     */
    public Circulo(double raio) {
        super();
        this.raio = raio;
    }
    /**
     * Construtor que cria uma instância de círculo com raio (por omissão) e cor
     * @param cor cor do círculo
     */
    public Circulo(String cor) {
        super(cor);
        raio = RAIO_POR_OMISSAO;
    }
    /**
     * Cosntrutor que cria uma instância de círculo com raio e cor, ambos por omissão
     */
    public Circulo() {
        super();
        raio = RAIO_POR_OMISSAO;
    }

    /**
     * Método que retorna o valor do raio
     * @return valor do raio
     */
    public double getRaio() {
        return raio;
    }

    /**
     * Método que permite alterar o valor do raio do círculo
     * @param raio novo valor do raio do círculo
     */
    public void setRaio(double raio) {
        this.raio = raio;
    }

    /**
     * Método para calcular a área do círculo
     * @param raio raio do círculo
     * @return área do círculo
     */

    public double calcularArea(double raio){
        double area = Math.PI * Math.pow(raio, 2);
        return area;
    }

    /**
     * Método que cria uma string cujo o intuíto é informar acerca das características dos círculos
     * @return string informativa
     */
    @Override
    public String toString() {
        return String.format("Círculo: raio=%.1f %s area=%.1f", raio, super.toString(), calcularArea(raio));
    }
}
