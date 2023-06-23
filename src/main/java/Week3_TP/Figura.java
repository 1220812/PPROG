package Week3_TP;

public class Figura {
    /**
     * Cor da figura
     */
    private String cor;
    /**
     * Cor da figura por omissão
     */
    private static final String COR_POR_OMISSAO = "cinzento";

    /**
     * Construtor que cria uma instância da figura com cor
     * @param cor cor da figura a ser criada
     */
    public Figura(String cor) {
        this.cor = cor;
    }

    /**
     * Construtor que cria uma instância da figura com a cor por omissão
     */
    public Figura() {
        cor = COR_POR_OMISSAO;
    }

    /**
     * Método que mostra a cor da figura
     * @return cor da figura
     */

    public String getCor() {
        return cor;
    }

    /**
     * Método para alterar a cor da figura
     * @param cor nova cor da figura
     */

    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * Método que imprime uma string informativa acerca da cor da figura
     * @return String informativa  da cor da figura
     */
    @Override
    public String toString() {
        return String.format("cor=%s", cor);
    }

}
