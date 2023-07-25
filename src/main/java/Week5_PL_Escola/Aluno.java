package Week5_PL_Escola;

public class Aluno extends Elemento{
    /**
     * número mecanográfico do aluno
     */
    private int numeroMecanografico;
    /**
     * número mecanográfico do aluno por omissão
     */
    protected final int NUMERO_MECANOGRAFICO_POR_OMISSAO = 0000000;
    /**
     * valor booleano da situação de bolseiro do aluno
     */
    private boolean bolseiro;

    /**
     * mostra o estatuto de bolseiro do aluno
     * @return estatuto de bolseiro do aluno
     */
    public boolean getBolseiro(){
        return bolseiro;
    }

    /**
     * mostra o número mecanográfico do aluno
     * @return número mecanográfico do aluno
     */
    public int getNumeroMecanografico() {
        return numeroMecanografico;
    }

    /**
     * modifica o número mecanográfico do aluno
     * @param numeroMecanografico atributo a ser modificado
     */
    public void setNumeroMecanografico(int numeroMecanografico) {
        this.numeroMecanografico = numeroMecanografico;
    }

    /**
     * modifica o estatuto de bolseiro do aluno
     * @param bolseiro atributo a ser modificado
     */
    public void setBolseiro(boolean bolseiro) {
        this.bolseiro = bolseiro;
    }

    /**
     * Construtor de aluno com os atributos :
     * @param nome nome do aluno
     * @param numeroIdentificacaoCivil NIF do aluno
     * @param numeroMecanografico número mecanográfico do aluno
     * @param bolseiro estatuto de bolseiro do aluno
     */
    public Aluno (String nome, int numeroIdentificacaoCivil, int numeroMecanografico, boolean bolseiro){
        super(nome, numeroIdentificacaoCivil);
        this.numeroMecanografico = numeroMecanografico;
        this.bolseiro = bolseiro;
    }

    /**
     * Construtor de aluno com os atributos por omissão
     */
    public Aluno (){
        super();
        this.numeroMecanografico = NUMERO_MECANOGRAFICO_POR_OMISSAO;
        this.bolseiro = false;
    }
    /**
     * String informativa que mostra o nome, o NIF, a categoria e o salário do professor em questão
     * @return nome, NIF, categoria e salário do professor em questão
     */
    @Override
    public String toString() {
        String toString;
        if(bolseiro == true){
            toString = super.toString() + " é aluno com nº mecanográfico : " + numeroMecanografico + " é bolseiro e ofere de " + calcularValorMensal() + " euros por mês!";
        } else {
            toString = super.toString() + " é aluno com nº mecanográfico : " + numeroMecanografico + " não é bolseiro";
        }
        return toString;
    }

    @Override
    public double calcularValorMensal() {
        double valorMensal;
        if(bolseiro == true){
            valorMensal = 200;
        }else {
            valorMensal = 0;
        }
        return valorMensal;
    }
}
