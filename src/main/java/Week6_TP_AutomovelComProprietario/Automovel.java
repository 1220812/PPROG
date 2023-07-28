package Week6_TP_AutomovelComProprietario;

import Week6_TP.Biblioteca.Pessoa;

public class Automovel {
    /**
     * Marca do automóvel
     */
    private String marca;
    /**
     * Proprietario do automóvel
     */
    private Pessoa proprietario;
    /**
     * A marca do automóvel por omissão
     */
    private static final String MARCA_POR_OMISSAO = "sem marca";

    /**
     * Constroí uma instância de automóvel recebendo a marca e o proprietário
     *
     * @param marca marca do automóvel
     * @param proprietario proprietário do automóvel
     */
    public Automovel(String marca, Pessoa proprietario) {
        this.marca = marca;
        this.proprietario = proprietario;
    }

    /**
     * Constroí uma instância de automóvel com a marca e o proprietário por omissão
     */
    public Automovel() {
        marca = MARCA_POR_OMISSAO;
        proprietario = new Pessoa();
    }

    /**
     * Devolve a marca do automóvel
     * @return marca do automóvel
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Devolve o proprietário do automóvel
     * @return proprietário do automóvel
     */

    public Pessoa getProprietario() {
        return proprietario;
    }

    /**
     * Modifica a marca do automóvel
     * @param marca a nova marca do automóvel
     */

    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Modifica o proprietário do automóvel
     * @param proprietario o novo proprietário do automóvel
     */

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }

    /**
     * Devolve a descrição textual do automóvel
     *
     * @return características do automóvel
     */

    @Override
    public String toString() {
        return String.format("Automóvel:%n Marca=%s Proprietário=%s",
                marca, proprietario);
    }
}

