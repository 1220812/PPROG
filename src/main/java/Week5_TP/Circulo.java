package Week5_TP;

public class Circulo extends Figura{
    /**
     * Raio do círculo
     */
    private double raio;
    /**
     * Raio do círculo por omissão
     */

    private static final int RAIO_POR_OMISSAO = 1;

    /**
     * Construtor de um círculo com os atributos:
     * @param raio raio do círculo
     * @param cor cor do círculo
     */

    public Circulo(double raio, String cor) {
        super(cor);
        this.raio = raio;
    }

    /**
     * Construtor de um círculo com os atributos:
     * @param raio raio do cículo
     * cor por omissão
     */
    public Circulo(double raio) {
        super();
        this.raio = raio;
    }

    /**
     * Construtor de um círculo com os atributos:
     * @param cor cor do círculo
     * raio por omissão
     */
    public Circulo(String cor) {
        super(cor);
        raio=RAIO_POR_OMISSAO;
    }

    /**
     * Construtor de um círculo com cor e raio por omissão
     */
    public Circulo() {
        super();
        raio=RAIO_POR_OMISSAO;
    }

    /**
     * Mostra o raio do círculo
     * @return raio do círculo em questão
     */
    public double getRaio() {
        return raio;
    }

    /**
     * Modifica o raio do círculo
     * @param raio parâmetro a ser modificado, neste caso, o raio da figura
     */

    public void setRaio(double raio) {
        this.raio = raio;
    }

    /**
     * Informação acerca do retângulo
     * @return string informativa acerca do retângulo
     */
    @Override
    public String toString() {
        return String.format("Círculo: raio=%.1f %s", raio, super.toString());
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
        Circulo c = (Circulo) outroObjeto;
        return this.raio == c.getRaio();
    }

    /**
     * Método para calcular a área do círculo
     * @return produto entre o raio, altura e o valor do pi
     */
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
