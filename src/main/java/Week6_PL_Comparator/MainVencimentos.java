package Week6_PL_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainVencimentos{

    public static void main(String[] args) {

        TrabalhadorComissao tc = new TrabalhadorComissao("Susana Ferreira",
                500.0f, 1500.0f, 6f);
        TrabalhadorPeca tp = new TrabalhadorPeca("Jorge Silva", 20, 30);
        TrabalhadorHora th = new TrabalhadorHora("Carlos Miguel", 160, 3.5f);

        List<Trabalhador> trabs = new ArrayList<>();
        trabs.add(tc);
        trabs.add(tp);
        trabs.add(th);

        System.out.println("### Trabalhadores ###");
        listar(trabs);

        // 7. Use a interface Comparator<Trabalhador> para listar os trabalhadores por:

        Comparator vencimentos = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                float vencimentoTrab1 = ((Trabalhador) o1).calcularVencimento();
                float vencimentoTrab2 = ((Trabalhador) o2).calcularVencimento();
                if(vencimentoTrab1 < vencimentoTrab2){
                    return -1;
                } else if (vencimentoTrab2 > vencimentoTrab1) {
                    return 1;
                }else{
                    return 0;
                }
            }
        };

        Comparator nomes = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String nomeTrab1 = ((Trabalhador) o1).getNome();
                String nomeTrab2 = ((Trabalhador) o2).getNome();
                return nomeTrab1.compareTo(nomeTrab2);
            }
        };

        // a) Ordem crescente dos vencimentos.

        System.out.println();
        System.out.println("#### Trabalhadores por ordem crescente de vencimentos ####");

        Collections.sort(trabs, vencimentos);
        listar(trabs);

        // b) Ordem decrescente dos vencimentos.

        System.out.println();
        System.out.println("#### Trabalhadores por ordem decrescente de vencimentos ####");

        Collections.sort(trabs, vencimentos);
        Collections.reverse(trabs);
        listar(trabs);

        // c) Ordem alfabética dos nomes.

        System.out.println();
        System.out.println("#### Trabalhadores por ordem alfabética dos nomes ####");

        Collections.sort(trabs, nomes);
        listar(trabs);

    }

    private static void listar(List<Trabalhador> trabs) {
        for (Trabalhador trab : trabs) {
            if (trab != null) {
                System.out.printf("%s, vencimento = %.2f€%n", trab.getNome(),
                        trab.calcularVencimento());
            }
        }
    }
}

