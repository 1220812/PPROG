package Week5_PL_Escola;

import java.util.ArrayList;
import java.util.List;

public class MainElemento {
    public static void main(String[]args){

        // a) Construa objetos de cada uma das classes instanciáveis e guarde-os num contentor do tipo array;

        Aluno aluno1 = new Aluno("Ana Lopes", 111111111, 1223145, true);
        Aluno aluno = new Aluno("Sónia Pinto", 121212121, 1220890, false);

        Professor professor = new Professor("Ana Barata", 123123123, Categoria.ADJUNTO);
        Professor professor1 = new Professor("Jorge Mendonça", 123456789, Categoria.COORDENADOR);
        Professor professor2 = new Professor("Vitor Castro", 987654321, Categoria.ASSISTENTE);

        List<Elemento> listaElementos = new ArrayList<>();
        listaElementos.add(aluno1);
        listaElementos.add(aluno);
        listaElementos.add(professor);
        listaElementos.add(professor1);
        listaElementos.add(professor2);

        // b) Liste o nome e categoria dos professores armazenado no contentor;

        System.out.println("####Professores : ####");
        System.out.println();
        for (Elemento elemento:
             listaElementos) {
            if(elemento instanceof Professor){
                System.out.println("O professor " + elemento.getNome() + " é professor-" + ((Professor) elemento).getCategoria());
            }
        }
        // c) Liste o número mecanográfico de todos os alunos que não são bolseiros;

        System.out.println();
        System.out.println("####Alunos não bolseiros : ####");
        System.out.println();
        for (Elemento elemento:
             listaElementos) {
            if(elemento instanceof Aluno){
                if(((Aluno) elemento).getBolseiro() == false){
                    System.out.println(((Aluno) elemento).getNumeroMecanografico());
                }
            }
        }

        // d) Liste os nomes dos professores e alunos, armazenados no contentor. A listagem deve incluir, para cada objeto, a designação da classe;

        System.out.println();
        System.out.println("####Alunos : ####");
        System.out.println();
        for (Elemento elemento:
             listaElementos) {
            if(elemento instanceof Aluno){
                System.out.println("Aluno de nome : " + elemento.getNome());
            }
        }

        System.out.println();
        System.out.println("####Professores : ####");
        System.out.println();
        for (Elemento elemento:
             listaElementos) {
            if(elemento instanceof Professor){
                System.out.println("Professor de nome : " + elemento.getNome());
            }
        }

        // e) Liste os nomes e valores dos salários dos professores armazenados no contentor;

        System.out.println();
        System.out.println("####Nomes e salários dos professores : ####");
        System.out.println();
        for (Elemento elemento:
             listaElementos) {
            System.out.println("Professor de nome : " + elemento.getNome() + " ofere de " + elemento.calcularValorMensal() + " euros por mês");
        }

        // f) Liste os nomes e valores das bolsas dos alunos bolseiros armazenados no contentor;

        System.out.println();
        System.out.println("####Nomes e valores das bolsas dos alunos : ####");
        System.out.println();
        for (Elemento elemento:
             listaElementos) {
            if(elemento instanceof Aluno){
                if(((Aluno) elemento).getBolseiro() == true){
                    System.out.println("Nome : " + elemento.getNome() + ", ofere de uma bolsa de " + elemento.calcularValorMensal() + " euros!");
                }
            }
        }

        // g) Mostre os valores totais dos encargos com: professores e alunos bolseiros. O total dos encargos da escola deve também ser apresentado.

        System.out.println();
        System.out.println("####Valor total dos encargos com professores : ####");
        System.out.println();

        int somaSalariosProfessores = 0;
        for (Elemento elemento:
             listaElementos) {
            if(elemento instanceof Professor){
                somaSalariosProfessores += elemento.calcularValorMensal();
            }
        }

        System.out.println(somaSalariosProfessores + " euros por mês");
        System.out.println();
        System.out.println("####Valor total dos encargos com alunos : ####");
        System.out.println();

        int somaSalariosAlunos = 0;
        for (Elemento elemento:
             listaElementos) {
            if(elemento instanceof Aluno){
                if(((Aluno) elemento).getBolseiro() == true){
                    somaSalariosAlunos += elemento.calcularValorMensal();
                }
            }
        }

        System.out.println(somaSalariosAlunos + " euros por mês");
        System.out.println();
        System.out.println("####Valor total dos encargos da escola : ####");
        System.out.println();
        System.out.println(somaSalariosAlunos + somaSalariosProfessores + " euros por mês");
    }
}
