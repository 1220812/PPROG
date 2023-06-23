package Week2_PL;

import java.util.Scanner;

public class Cumprimentar {

    // 1. Escreva um programa que pergunte o nome da pessoa e dê uma saudação usando esse nome

    /**Scanner ler = new Scanner(System.in);
     System.out.println("Olá, insira o seu nome, por favor!");
     String nome = ler.next();
     System.out.println("Olá, " + nome + " ,tenha um bom dia!");
     */

    // 2. Altere o programa para que seja criado um objeto representativo da pessoa, com apenas um atributo - o seu nome.
    // O programa deve implementar:
    //▪ Dois construtores:
    //▪ Sem parâmetros;
    //▪ Com um parâmetro para receber o nome da pessoa.
    //▪ Métodos de consulta e de modificação do nome;
    //▪ Método toString que devolva uma string com a representação interna do objeto (exemplo: "O nome é Maria").

    /**
     * Nome da pessoa a cumprimentar
      */
    private String nome;

    /**
     * Nome da pessoa por defeito
     */
    private final String NOME_POR_DEFAULT = "Sem nome";

    /**
     * Construtor vazio, considera o nome e idade da pessoa por default
     */
    public Cumprimentar(){
        this.nome = NOME_POR_DEFAULT;
        this.idade = IDADE_POR_DEFFAULT;
    }

    /**
     * Connstrutor com nome passado por parâmtro
     * @param nome nome da pessoa
     */
    public Cumprimentar(String nome){
        this.nome = nome;
    }

    /**
     * Método para mostrar o nome da pessoa
     * @return nome da pessoa
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método para alterar o nome da pessoa
     * @param nome nome da pessoa alterado
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método que devolve uma string com a representação interna do objeto
     * @return representação interna do objeto
     */
    @Override
    public String toString() {
        return nome + " tem " + idade + " anos.";
    }

    //3. Modifique novamente o programa, acrescentando o atributo idade ao objeto representativo da pessoa. O novo programa deve incluir:
      // ▪ Construtor que receba como parâmetros o nome e a idade da pessoa;
      // ▪ Métodos de consulta e de modificação da idade;
      // ▪ Método toString que devolva uma string legível para o utilizar contendo o nome e a idade da pessoa, como por exemplo: "Maria tem 14 anos.".
    /**
     * idade da pessoa
     */
    private int idade;
    /**
     * idade por deffault
     */
    private final int IDADE_POR_DEFFAULT = 0;

    /**
     * Construtor com nome e idade passado por parâmetro
     * @param nome nome da pessoa
     * @param idade idade da pessoa
     */
    public Cumprimentar(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    /**
     * Método que mostra a idade da pessoa
     * @return idade da pessoa
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Método para modificar a idade da pessoa
     * @param idade idade da pessoa modificada
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
