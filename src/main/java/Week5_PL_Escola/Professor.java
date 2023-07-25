package Week5_PL_Escola;

public class Professor extends Elemento{
    /**
     * Valor do salário base
     */
    protected final int salarioBase = 1500;
    /**
     * Categoria do professor
     */
    private Categoria categoria;
    /**
     * valor da majoração a ser aplicada aos professores adjuntos
     */
    protected final double percentagemAplicavelAdjuntos = 0.2;
    /**
     * valor da majoração a ser aplicada aos professores coordenadores
     */
    protected final double percentagemAplicavelCoordenador = 0.5;
    /**
     * valor da majoração a ser aplicada aos professores assistenntes
     */
    protected final double percentagemAplicavelAssistentes = 0;

    /**
     * Mostra a categoria do professor
     * @return categoria do professor
     */
    public Categoria getCategoria() {
        return categoria;
    }
    /**
     * Modifica a categoria do professor em questão
     * @param categoria parâmetro a ser modificado
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    /**
     * Construtor de professor com os atributos :
     * @param nome nome do professor
     * @param numeroIdentificacaoCivil NIF do professor
     * @param categoria categoria do professor
     */
    public Professor (String nome, int numeroIdentificacaoCivil, Categoria categoria){
        super(nome, numeroIdentificacaoCivil);
        this.categoria = categoria;
    }

    /**
     * Construtor de professor com os atributos por omissão
     * @param categoria categoria do professor
     */
    public Professor (Categoria categoria){
        super();
        this.categoria = categoria;
    }

    /**
     * String informativa que mostra o nome, o NIF, a categoria e o salário do professor em questão
     * @return nome, NIF, categoria e salário do professor em questão
     */
    @Override
    public String toString() {
        return super.toString() + " é um professor " + categoria + "e ofere de um salário mensal de " + calcularValorMensal() + " euros!";
    }

    /**
     * Calcula o salário do professor com base na sua categoria
     * @return salário mensal do professor em questão
     */
    @Override
    public double calcularValorMensal() {
        double valorMensal = 0;
        if(categoria == Categoria.ASSISTENTE){
            valorMensal = salarioBase;
        } else if (categoria == Categoria.ADJUNTO) {
            valorMensal = salarioBase + (salarioBase * percentagemAplicavelAdjuntos);
        } else {
            valorMensal = salarioBase + (salarioBase * percentagemAplicavelCoordenador);
        }
        return valorMensal;
    }
}
