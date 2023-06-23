package Week4_TP;

public class Moradia implements Cores, Tributavel {
    /**
     * Morada da moradia
     */
    private String morada;
    /**
     * area da moradia
     */
    private float area;
    /**
     * cor da moradia
     */
    private String cor;
    /**
     * valor a multiplicar pela área da moradia, cujo resultado dará o imposto a pagar
     */
    private static int fatorImposto = 2;

    /**
     * Construtor de uma instância moradia com morada, area e cor passadas por parâmetro
     * @param morada morada da moradia
     * @param area area da moradia
     * @param cor cor da moradia
     */
    public Moradia(String morada, float area, String cor) {
        this.morada = morada;
        this.area = area;
        this.cor = cor;
    }

    /**
     * Método para mostrar a morada da moradia
     * @return morada da moradia
     */
    public String getMorada() {
        return morada;
    }
    /**
     * Método para mostrar a area da moadia
     * @return area da moradia
     */
    public float getArea() {
        return area;
    }
    /**
     * Método para mostrar a cor da moradia
     * @return cor da moradia
     */

    public String getCor() {
        return cor;
    }
    /**
     * Método para alterar a morada de uma moradia
     * @param morada parâmetro a ser alterado
     */
    public void setMorada(String morada) {
        this.morada = morada;
    }
    /**
     * Método para alterar a area de uma moradia
     * @param area parâmetro a ser alterado
     */
    public void setArea(float area) {
        this.area = area;
    }
    /**
     * Método para alterar a cor de uma moradia
     * @param cor parâmetro a ser alterado
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * Método que devolve uma string de caráter informativo acerca da morada, area e cor da moradia
     * @return string informativa da morada, cor e area da moradia
     */
    @Override
    public String toString() {
        return String.format("Moradia situada na %s com área de %.1f tem cor %s",
                morada, area, cor);
    }

    /**
     * Método para calcular o valor do imposto de uma moradia, sendo este calculado pelo produto entre o fator imposto considerado e a área da moradia
     * @return valor do imposto da moradia
     */
    @Override
    public double calcularImposto() {
        return fatorImposto * area;
    }
}
