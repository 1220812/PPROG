package Week8_PL.Exposicao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class MainExposicao {
    public static void main(String[]args){

        // 5. Invoque as funcionalidades da classe Quadro da seguinte forma:
          // a) Crie diversas instâncias de Quadro.

        Quadro quadro = new Quadro("Mona Lisa", "Leonardo DaVinci", 1780);
        Quadro quadro1 = new Quadro("A última ceia", "Miguel Ângelo", 1600);
        Quadro quadro2 = new Quadro("Céu", "Vicent Van Gogh", 1800);
        Quadro quadro3 = new Quadro("A vida", "Bordalo Pinheiro", 1956);

          // b) Armazene essas instâncias num contentor do tipo ArrayList.

        ArrayList<Quadro> listaQuadros = new ArrayList<>();
        listaQuadros.add(quadro);
        listaQuadros.add(quadro1);
        listaQuadros.add(quadro2);
        listaQuadros.add(quadro3);

          // c) Visualize os objetos do contentor utilizando o método listar.

        System.out.println(" #### Lista de Quadros : ####");
        System.out.println();
        listagem(listaQuadros);
        System.out.println();

        // 7. Invoque as funcionalidades da classe Exposição usando o seguinte procedimento:
          //a) Crie diversas instâncias de Exposicao, usando as instâncias de Quadro criadas anteriormente. Algumas destas instâncias devem ser partilhadas por todas as exposições criadas.

        Exposicao exposicao = new Exposicao("Porto Art", listaQuadros,2015 );
        Exposicao exposicao1 = new Exposicao("Lisboa Art Festival", listaQuadros, 2018);

        List<Quadro> listaQuadros2 = new ArrayList<>();
        listaQuadros2.add(quadro);
        listaQuadros2.add(quadro2);

        Exposicao exposicao2 = new Exposicao("Porto Festival II", listaQuadros2, 2022);
        Exposicao exposicao3 = new Exposicao("Lisbon Art", listaQuadros2, 2022);

          //b) Armazene estas instâncias num contentor do tipo ArrayList.

        ArrayList<Exposicao> listaExposicoes = new ArrayList<>();
        listaExposicoes.add(exposicao);
        listaExposicoes.add(exposicao1);
        listaExposicoes.add(exposicao2);
        listaExposicoes.add(exposicao3);

          //c) Visualize os objetos deste contentor reutilizando o método listar.

        System.out.println("#### Lista Exposições : ####");
        System.out.println();
        listagem(listaExposicoes);
        System.out.println();

        // 8. Modifique o conteúdo de uma das instâncias de Quadro partilhada por todas as exposições. Para confirmar estas modificações, visualize novamente os objetos do contentor de exposições.

        quadro.setAnoCriacao(2027);

        System.out.println("#### Lista Exposições : ####");
        System.out.println();
        listagem(listaExposicoes);
        System.out.println();

        // 9. Programe uma listagem do contentor de exposições por ordem decrescente do ano da exposição.

        Collections.sort(listaExposicoes, Exposicao::compareTo);
        Collections.reverse(listaExposicoes);

        System.out.println("#### Lista Exposições por ordem decrescente de ano de exposição : ####");
        System.out.println();
        listagem(listaExposicoes);
        System.out.println();

        // 10. Invoque e verifique o resultado do método da classe Exposicao para remover um quadro.

        exposicao.removerQuadro(quadro1);

        System.out.println("#### Lista Exposições, sendo que a primeira exposição tem menos um quadro na lista : ####");
        System.out.println();
        listagem(listaExposicoes);
        System.out.println();
    }

    // 4. Nesta classe, crie o método listar para apresentar, na consola, uma listagem dos objetos do contentor recebido por parâmetro. Considere um contentor do tipo List.

    public static void listagem (List lista){
        for (Object object:
             lista) {
            if(object != null) {
                System.out.println(object);
                System.out.println();
            }
        }
    }
}
