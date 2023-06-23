package Week3_PL;

public class UtenteGinasio {
    /**
     * nome do utente
     */
    private String nome;
    /**
     * genero do utente
     */
    private String genero;
    /**
     * idade do utente
     */
    private int idade;
    /**
     * altura do utente
     */
    private double altura;
    /**
     * peso do utente
     */
    private double peso;
    /**
     * nome do utente por default
     */
    private static final String NOME_POR_DEFAULT = "Sem nome";
    /**
     * genero do utente por default
     */
    private static final String GENERO_POR_DEFAULT = "Sem genero";
    /**
     * idade do utente por default
     */
    private static final int IDADE_POR_DEFAULT = 0;
    /**
     * altura do utente por default
     */
    private static final double ALTURA_POR_DEFAULT = 1.00;
    /**
     * peso do utente por default
     */
    private static final double PESO_POR_DEFAULT = 60.0;
    /**
     * Valor referencia para o calculo do grau de obesidade a partir do IMC
     */
    private static final double VALOR_REFERENCIA_IMC_MAGRO = 18;
    /**
     * Valor referencia para o calculo do grau de obesidade a partir do IMC
     */
    private static final double VALOR_REFERENCIA_IMC_SAUDAVEL = 25;
    /**
     * Contador de utentes criados
     */
    int contadorCriacoes;

    // a) construtores (pelo menos):

       // - vazio. O valor por omissão para cada atributo deve estar representado numa constante;

    /**
     * Construtor que cria uma instância de utente de ginásio com todos os paramêtros por default
     */
    public UtenteGinasio (){
        this.altura = ALTURA_POR_DEFAULT;
        this.genero = GENERO_POR_DEFAULT;
        this.idade = IDADE_POR_DEFAULT;
        this.peso = PESO_POR_DEFAULT;
        this.nome = NOME_POR_DEFAULT;
        contadorCriacoes++;
    }
       // - com dois parâmetros: nome e idade;

    /**
     * Construtor que cria uma instância de utente de ginásio com nome e idade (restantes parâmetros por deffault)
     * @param nome nome do utente de ginásio
     * @param idade idade do utente de ginásio
     */
    public UtenteGinasio(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        this.peso = PESO_POR_DEFAULT;
        this.genero = GENERO_POR_DEFAULT;
        this.altura = ALTURA_POR_DEFAULT;
        contadorCriacoes++;
    }
       // - completo;

    /**
     * Construtor que cria uma instância de utente de ginásio com nome, idade, género, altura e peso
     * @param nome nome do utente de ginásio
     * @param idade idade do utente de ginásio
     * @param peso peso do utente de ginásio
     * @param altura altura do utente de ginásio
     * @param genero género do utente de ginásio
     */
    public UtenteGinasio(String nome, int idade, double peso, double altura, String genero){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.genero = genero;
        contadorCriacoes++;
    }

    // b) métodos para aceder individualmente aos atributos de um utente;

    /**
     * Método que mostra o nome do utente
     * @return nome do utente
     */
    public String getNome() {
        return nome;
    }
    /**
     * Método que mostra a idade do utente
     * @return idade do utente
     */
    public int getIdade() {
        return idade;
    }
    /**
     * Método que mostra a altura do utente
     * @return altura do utente
     */

    public double getAltura() {
        return altura;
    }
    /**
     * Método que mostra o peso do utente
     * @return peso do utente
     */
    public double getPeso() {
        return peso;
    }
    /**
     * Método que mostra o genero do utente
     * @return genero do utente
     */
    public String getGenero() {
        return genero;
    }

    // c) métodos para alterar individualmente os atributos de um utente;

    /**
     * Método para alterar o valor da idade do utente
     * @param idade parâmetro a ser alterado
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
    /**
     * Método para alterar o nome do utente
     * @param nome parâmetro a ser alterado
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * Método para alterar o valor da altura do utente
     * @param altura parâmetro a ser alterado
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    /**
     * Método para alterar o valor do peso do utente
     * @param peso parâmetro a ser alterado
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }
    /**
     * Método para alterar o genero do utente
     * @param genero parâmetro a ser alterado
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    // d) obter a representação textual e legível de um utente;

    /**
     * String com a representação textual dos atributos do utente
     * @return string com as características do utente
     */

    @Override
    public String toString() {
        return "UtenteGinasio : \n " +
                "nome = " + nome +
                ", genero = " + genero +
                ", idade = " + idade +
                ", altura = " + altura +
                ", peso = " + peso;
    }

    // e) determinar a diferença de idades (valor relativo) entre dois utentes;
    /**
     * Metodo que retorna o valor relativo da diferença entre as idades dos utentes
     * @param utenteGinasio1 utente do ginásio cuja idade vai ser comparada
     * @return valor relativo da diferença de idades
     */
    public int calcularDiferencaIdades(UtenteGinasio utenteGinasio1){
        return this.getIdade() - utenteGinasio1.getIdade();
    }

    // f) calcular o índice de massa corporal (IMC) de um utente

    /**
     * Método que recebe a altura e o peso do utente e calcula o IMC do mesmo (peso / altura^2)
     * @param altura altura do utente
     * @param peso peso do utente
     * @return valor do IMC
     */
    public double calcularIMC (double altura, double peso){
        double IMC = peso/Math.pow(altura,2);
        return IMC;
    }

    // g) determinar o grau de obesidade de um utente

    /**
     * Método que compara o valor do IMC do utente com os valores padrões de cada grau de obesidade
     * @param IMC IMC do utente consdireado
     * @return grau de obesidade
     */

    public String determinarGrauObesidade  (double IMC){
        String grauObesidade;
        if(IMC < VALOR_REFERENCIA_IMC_MAGRO){
            grauObesidade = "Magro";
        } else if (IMC < VALOR_REFERENCIA_IMC_SAUDAVEL) {
            grauObesidade = "Saudável";
        }else{
            grauObesidade = "Obeso";
        }
        return grauObesidade;
    }

    // h) verificar se um utente tem, relativamente ao grau de obesidade, a classificação “Saudável”;

    /**
     * Metodo que verifica se um determinado utente apresenta um grau de obesidade saudavel
     * @param utenteGinasio utente considerado
     * @return verdade se for saudável, falso se não se verificar saudável
     */
    public boolean grauObesidadeSaudavel (UtenteGinasio utenteGinasio){
        boolean saudavel = false;
        if(utenteGinasio.calcularIMC(altura, peso) < VALOR_REFERENCIA_IMC_SAUDAVEL && utenteGinasio.calcularIMC(altura, peso) > VALOR_REFERENCIA_IMC_MAGRO){
            saudavel = true;
        }
        return saudavel;
    }

    // i) determinar entre dois utentes qual é o mais novo. Se ambos tiverem a mesma idade deve ser retornado um valor indicador desta situação;

    /**
     * Método que compara a idade de dois utentes passados por parâmetro e verifica qual dos dois é o mais novo
     * @param utenteGinasio1 outro utente a ser considerados
     * @return -1 se o utenteGinasio1 for mais novo, 1 se o utenteGinasio2 for mais novo, 0 se ambos tiverem a mesma idade
     */

    public int determinarMaisNovo(UtenteGinasio utenteGinasio1) {
        int idade1 = this.getIdade();
        int idade2 = utenteGinasio1.getIdade();

        if (idade1 < idade2) {
            return -1; // utenteGinasio1 é mais novo
        } else if (idade1 > idade2) {
            return 1; // utenteGinasio2 é mais novo
        } else {
            return 0; // ambos têm a mesma idade
        }
    }
}
