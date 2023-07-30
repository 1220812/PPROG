package Week6_PL_Comparable;

import java.util.ArrayList;
import java.util.Collections;
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
        listarOrdemCrescente(trabs);

        //  3. Use a interface Comparable<Trabalhador> para posteriormente listar os trabalhadores por:

        Collections.sort(trabs);

        //a) Ordem crescente dos vencimentos.

        System.out.println();
        System.out.println("####Lista de trabalhadores por ordem crescente de vencimentos####");
        listarOrdemCrescente(trabs);

        //b) Ordem decrescente dos vencimentos.

        System.out.println();
        System.out.println("####Lista de trabalhadores por ordem decrescente de vencimentos####");
        listarOrdemDecrescente(trabs);

    }

    private static void listarOrdemCrescente(List<Trabalhador> trabs) {
        for (Trabalhador trab : trabs) {
            if (trab != null) {
                System.out.printf("%s, vencimento = %.2f€%n", trab.getNome(),
                        trab.calcularVencimento());
            }
        }
    }
    private static void listarOrdemDecrescente(List<Trabalhador> trabs){
        for (int i = trabs.size()-1 ; i >= 0 ; i--) {
            if(trabs.get(i) != null){
                System.out.printf("%s, vencimento = %.2f€%n", trabs.get(i).getNome(), trabs.get(i).calcularVencimento());
            }
        }
    }
}

