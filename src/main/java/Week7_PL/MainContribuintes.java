package Week7_PL;

import Week6_PL_Comparator.Trabalhador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainContribuintes {
    public static void main(String[] args) {

        // 1. Na classe principal, crie um contentor do tipo ArrayList<Contribuinte> chamado contribuintes.

        ArrayList<Contribuinte> contribuintes = new ArrayList<>();

        // 2. Adicione contribuintes ao contentor.

        contribuintes.add(new Desempregado("Lito Vidal", "Lisboa", 230, 1));
        contribuintes.add(new Reformado("Valter Cubilhas", "Olival", 600, 400));
        contribuintes.add(new Desempregado("Paulo Santos", "Braga", 150, 4));
        contribuintes.add(new TrabalhadorPorContaOutrem("Ana", "Ovar", 1800, 300, "CMM"));
        contribuintes.add(new Reformado("Jaime Magalhães", "Porto", 1500, 100));
        contribuintes.add(new TrabalhadorPorContaOutrem("Salvio", "Seixal", 8000, 1000, "SSB"));
        contribuintes.add(new TrabalhadorContaPropria("Mário", "Guarda", 1500, 300, "Eletricista"));
        contribuintes.add(new Reformado("Aníbal Silva", "Coimbra", 1000, 500));
        contribuintes.add(new TrabalhadorPorContaOutrem("João", "Lisboa", 800, 100, "CML"));
        contribuintes.add(new TrabalhadorContaPropria("Carla", "Porto", 15000, 1000, "Advogado"));
        contribuintes.add(new Desempregado("Maria Sá", "Afife", 230, 8));

        // 3. Programe uma listagem dos contribuintes do contentor.

        for (Contribuinte contribuinte :
                contribuintes) {
            System.out.println(contribuinte.toString());
        }
        System.out.println();

        // 4. Programe a eliminação do desempregado "Lito Vidal" do contentor. Para o efeito use o método remove(Object o) do contentor e, passando por parâmetro, uma nova instância equivalente à que se pretende eliminar.

        contribuintes.remove(new Desempregado("Lito Vidal", "Lisboa", 230, 1));

        // 5. Programe uma nova listagem dos contribuintes do contentor e verifique que a eliminação do desempregado do contentor não foi efetuada.

        for (Contribuinte contribuinte :
                contribuintes) {
            System.out.println(contribuinte.toString());
        }
        System.out.println();

        // 7. Invoque novamente a eliminação do desempregado e verifique que foi realizada.

        contribuintes.remove(new Desempregado("Lito Vidal", "Lisboa", 230, 1));
        for (Contribuinte contribuinte :
                contribuintes) {
            System.out.println(contribuinte.toString());
        }
        System.out.println();

        // 8. Invoque o método equals verificando a equivalência de:

        //a) Duas instâncias com características iguais.

        Desempregado d1 = new Desempregado("Lito Vidal", "Lisboa", 230, 1);
        Desempregado d2 = new Desempregado("Lito Vidal", "Lisboa", 230, 1);

        if (d1.equals(d2)) {
            System.out.println("As instâncias são iguais");
        } else {
            System.out.println("As instâcias são diferentes");
        }
        System.out.println();

        //b) Duas instâncias do mesmo tipo com características diferentes.

        Desempregado d3 = new Desempregado("Lito Vidal", "Lisboa", 230, 1);
        Desempregado d4 = new Desempregado("Ana Paula", "Porto", 210, 4);

        if (d3.equals(d4)) {
            System.out.println("As instâncias são iguais");
        } else {
            System.out.println("As instâcias são diferentes");
        }
        System.out.println();

        //c) Duas instâncias de tipos diferentes.

        Desempregado d5 = new Desempregado("Lito Vidal", "Lisboa", 230, 1);
        Reformado r1 = new Reformado("Valter Cubilhas", "Olival", 600, 400);

        if (d5.equals(r1)) {
            System.out.println("As instâncias são iguais");
        } else {
            System.out.println("As instâcias são diferentes");
        }
        System.out.println();

        // 9. Programe as seguintes listagens dos contribuintes armazenados no contentor:

        Comparator tiposContribuintes = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String tipoContribuinte1 = ((Contribuinte) o1).getClass().getSimpleName();
                String tipoContribuinte = ((Contribuinte) o2).getClass().getSimpleName();
                return tipoContribuinte1.compareTo(tipoContribuinte);
            }
        };

        Comparator nomes = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String nomeContribuinte1 = ((Contribuinte) o1).getNome();
                String nomeContribuinte = ((Contribuinte) o2).getNome();
                return nomeContribuinte1.compareTo(nomeContribuinte);
            }
        };

        //a) Ordem alfabética inversa dos tipos de contribuintes.

        System.out.println("#### Tipos de contribuintes por ordem alfabética inversa ####");

        System.out.println();

        Collections.sort(contribuintes, tiposContribuintes);
        Collections.reverse(contribuintes);

        for (Contribuinte contribuinte :
                contribuintes) {
            System.out.println(contribuinte.toString());
        }
        System.out.println();

        //b) Ordem alfabética dos tipos de contribuintes e, em cada tipo de contribuinte, os contribuintes apresentados por ordem alfabética dos seus nomes.

        System.out.println("#### Tipos de contribuintes por ordem alfabética ####");

        System.out.println();
        String currentType = null;
        List<String> namesInClass = new ArrayList<>();
        for (Contribuinte contribuinte : contribuintes) {
            String type = contribuinte.getClass().getSimpleName();
            if (!type.equals(currentType)) {
                if (currentType != null) {
                    Collections.sort(namesInClass);
                    printList(namesInClass);
                }
                System.out.println(type + ":");
                currentType = type;
                namesInClass = new ArrayList<>();
            }
            namesInClass.add(contribuinte.getNome());
        }
        if (currentType != null) {
            Collections.sort(namesInClass);
            printList(namesInClass);
        }
    }
    private static void printList(List<String> list) {
        for (String nome : list) {
            System.out.println("  " + nome);
        }
    }
}


