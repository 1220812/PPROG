package org.example;

public class Pessoa {
    /**
     * O nome da pessoa
     */
    private String nome;
    /**
     * A idade da pessoa
     */
    private int idade;
    /**
     * O nome da pessoa por omissão
     */
    private static final String NOME_POR_OMISSAO = "Sem nome";
    /**
     * A idade da pessoa por omissão
     */
    private static final int IDADE_POR_OMISSAO = 0;
    /**
     * Construtor com nome e idade por omissão
     */
    public Pessoa(){

    }
    /**
     * Construtor com idade por omissão
     */
    public Pessoa (String nome){
        this.nome = nome;
    }
    /**
     * Construtor com nome por omissão
     */
    public Pessoa (int idade){
        this.idade = idade;
    }
    public Pessoa (int idade, String nome){
        this.idade = idade;
        this.nome = nome;
    }

    /**
     * Método de consulta do nome
     * @return nome da pessoa
     */
    public String getNome (){
        return nome;
    }

    /**
     * Método de consulta da idade
     * @return idade da pessoa
     */
    public int getIdade (){
        return idade;
    }
    /**
     * Método de modificação da idade
     */
    public void setIdade (int idade){
        this.idade = idade;
    }
    /**
     * Método de modificação do nome
     */
    public void setNome (){
        this.nome = nome;
    }
    /**
     * Método que devolve uma string legível para o utilizar contendo o nome e a idade da pessoa
     * @return Sting formatada, com o nome e idade da pessoa
     */
    public String toString(){
        return String.format("%s tem %d anos", nome,idade);
    }
}
