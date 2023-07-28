package Week6_TP_AutomovelComMatricula;

import Week6_TP.Biblioteca.Pessoa;
import Week6_TP.Biblioteca.Data;

public class Automovel {
    /**
     * Marca do automóvel
     */
    private String marca;
    /**
     * Matrícula do automóvel
     */
    private Matricula matricula;
    /**
     * Proprietário do automóvel
     */
    private Pessoa proprietario;
    /**
     * Marca do automóvel por omissão
     */
    private static final String MARCA_POR_OMISSAO = "sem marca";

    /**
     * Constroí uma instância de automóvel com :
     *
     * @param marca marca do automóvel
     * @param matricula matrícula do automóvel
     * @param proprietario proprietário do automóvel
     */
    public Automovel(String marca, Matricula matricula, Pessoa proprietario) {
        this.marca = marca;
        this.matricula = new Matricula(matricula);
        this.proprietario = proprietario;
    }

    /**
     * Constroí uma instância de automóvel com :
     *
     * @param marca marca do automóvel
     * @param proprietario proprietário do automóvel
     * matrícula por omissão
     */
    public Automovel(String marca, Pessoa proprietario) {
        this.marca = marca;
        matricula = new Matricula();
        this.proprietario = proprietario;
    }

    /**
     * Constroí uma instância de automóvel com todos os atributos por omissão
     */
    public Automovel() {
        marca = MARCA_POR_OMISSAO;
        matricula = new Matricula();
        proprietario = new Pessoa();
    }

    /**
     * Constroí uma instância de automóvel com os atributos de outro automóvel passado por parâmetro
     * @param outroAutomovel automovél passado por parâmetro
     */
    public Automovel(Automovel outroAutomovel) {
        marca = outroAutomovel.marca;
        matricula = new Matricula(outroAutomovel.matricula);
        proprietario = outroAutomovel.proprietario;
    }

    /**
     * Devolve a marca do automóvel
     * @return marca do automóvel
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Devolve a matrícula do automóvel
     * @return matrícula do automóvel
     */
    public Matricula getMatricula() {
        return new Matricula(matricula);
    }

    /**
     * Devolve o proprietário do automóvel
     * @return proprietário do automóvel
     */
    public Pessoa getProprietario() {
        return proprietario;
    }

    /**
     * Modifia a marca do automóvel
     * @param marca nova marca do automóvel
     */

    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Modifica a matrícula do automóvel
     * @param matricula nova matrícula do automóvel
     */

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
        this.matricula.setMatricula(matricula.getMatricula());
        this.matricula.setDataRegisto(new Data(matricula.getDataRegisto()));
    }

    /**
     * Modifica o proprietário do automóvel
     * @param proprietario novo proprietário do automóvel
     */
    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }

    /**
     * Devolve a descrição textual do automóvel.
     *
     * @return caraterísticas do automóvel.
     */
    public String toString() {
        return String.format(
                "Automóvel:%n Marca=%s%n Matricula=%s%n Proprietário=%s",
                marca, matricula, proprietario);
    }
}
