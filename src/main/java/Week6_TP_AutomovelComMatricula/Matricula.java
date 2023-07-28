package Week6_TP_AutomovelComMatricula;

import Week6_TP.Biblioteca.Data;

public class Matricula {
    /**
     * A matrícula do automóvel
     */
    private String matricula;
    /**
     * A data de registo da matrícula
     */
    private Data dataRegisto;
    /**
     * Matrícula do automóvel por omissão
     */
    private static final String MATRICULA_POR_OMISSAO = "sem matrícula";

    /**
     * Constroí uma instância de matrícula com :
     *
     * @param matricula matrícula do automóvel
     * @param dataRegisto data de registo da matrícula
     */
    public Matricula(String matricula, Data dataRegisto) {
        this.matricula = matricula;
        this.dataRegisto = dataRegisto;
    }

    /**
     * Constroí uma instância de matrícula com matrícula e data de registo por omissão
     */
    public Matricula() {
        matricula = MATRICULA_POR_OMISSAO;
        dataRegisto = new Data();
    }

    /**
     * Constroí uma instância de matrícula usando os atributos de outra passada por parâmetro
     *
     * @param outraMatricula matrícula passada por parâmetro
     */

    public Matricula(Matricula outraMatricula) {
        matricula = outraMatricula.matricula;
        dataRegisto = outraMatricula.dataRegisto;
    }

    /**
     * Devolve a matrícula do automóvel
     * @return matrícula do automóvel
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Devolve a data de registo da matrícula
     * @return
     */
    public Data getDataRegisto() {
        return dataRegisto;
    }

    /**
     * Modifica a matrícula do automóvel
     * @param matricula nova matrícula do automóvel
     */

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Modifica a data de registo da matrícula
     * @param dataRegisto nova data de registo da matrícula
     */

    public void setDataRegisto(Data dataRegisto) {
        this.dataRegisto = dataRegisto;
    }

    /**
     * Devolve a descrição textual da matrícula.
     *
     * @return caraterísticas da matrícula.
     */
    @Override
    public String toString() {
        return String.format("Matricula: %s registada em %s",
                matricula, dataRegisto.toAnoMesDiaString());
    }
}
