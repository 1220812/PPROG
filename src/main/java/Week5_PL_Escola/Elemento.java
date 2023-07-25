package Week5_PL_Escola;

public abstract class Elemento {
    /**
     * Nome do elemento considerado
     */
    private String nome;
    /**
     * Nome do elemento por omissão
     */
    protected final String NOME_POR_OMISSAO = "sem nome";
    /**
     * Número de identificação civil do elemento
     */
    private int numeroIdentificacaoCivil;
    /**
     * Número de identificação civil do elemento por omissão
     */
    protected final int NIF_POR_OMISSAO = 000000000;

    /**
     * Construtor do elemento com os atributos :
     * @param nome nome do elemento
     * @param numeroIdentificacaoCivil número de identificação civil
     */
    public Elemento (String nome, int numeroIdentificacaoCivil){
        this.nome = nome;
        this.numeroIdentificacaoCivil = numeroIdentificacaoCivil;
    }
    /**
     * Construtor do elemento com todos os atributos por omissão
     */
    public Elemento (){
        this.nome = NOME_POR_OMISSAO;
        this.numeroIdentificacaoCivil = NIF_POR_OMISSAO;
    }

    /**
     * Nostra o nome do elemento em questão
     * @return nome do elemento
     */
    public String getNome() {
        return nome;
    }

    /**
     * Mostra o NIF do elemento em questão
     * @return NIF do elemento
     */
    public int getNumeroIdentificacaoCivil() {
        return numeroIdentificacaoCivil;
    }

    /**
     * Modifica o nome do elemento em questão
     * @param nome atributo a ser modificado
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Modifica o NIF do elemento em questão
     * @param numeroIdentificacaoCivil atributo a ser modificado
     */
    public void setNumeroIdentificacaoCivil(int numeroIdentificacaoCivil) {
        this.numeroIdentificacaoCivil = numeroIdentificacaoCivil;
    }

    /**
     * Cálcula o valor do salário/bolsa mensal a ser atribuída ao elemento
     * @return salário/bolsa mensal a ser atribuída
     */
    public abstract double calcularValorMensal();

    /**
     * String informativa que mostra o nome e o NIF do elemento em questão
     * @return nome e NIF do elemento em questão
     */
    @Override
    public String toString() {
        return "nome : " + nome +
                ", NIF : " + numeroIdentificacaoCivil;
    }
}
