package Week5_TP;

public abstract class Figura {
    /**
     * Cor da figura
     */
    private String cor;
    /**
     * Cor da figura por omissão
     */
    private static final String COR_POR_OMISSAO = "cinzento";

    /**
     * Construtor de figura com o atributo cor
     * @param cor cor da figura
     */
    public Figura(String cor) {
        this.cor = cor;
    }

    /**
     * Construtor de fugura com o atributo cor por omissão
     */
    public Figura() {
        cor=COR_POR_OMISSAO;
    }

    /**
     * Mostra a cor da figura
     * @return cor da figura em questão
     */
    public String getCor() {
        return cor;
    }

    /**
     * Modifica a cor da figura
     * @param cor atributo a ser modificado, no caso, a cor
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * Informação acerca da figura
     * @return string informativa acerca da figura
     */
    @Override
    public String toString() {
        return String.format("Cor: %s", cor);
    }

    /**
     * Método equals que compara dois objectos e averigua se são iguais
     * @return
     */
    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || this.getClass() != outroObjeto.getClass()) {
            return false;
        }
        Figura outraFigura = (Figura) outroObjeto;
        return this.cor.equalsIgnoreCase(outraFigura.cor);
}

    /**
     * Calcula a área da figura
     * @return área da figura em questão
     */
    public abstract double calcularArea();
}
