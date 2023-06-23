package Week4_TP;

import java.lang.reflect.Array;
import java.util.TreeMap;

public class MainTributaveis {
    public static void main(String[] args) {

        // 2. Na classe principal, chamada MainTributaveis, crie e mostre no ecrã uma instância da classe Veiculo com matrícula 22-33-CC, encarnado e com cilindrada de 1000 cc.

        Veiculo veiculo = new Veiculo("22-33-CC", 1000, "encarnado");
        System.out.println(veiculo.toString());

        // 4. Crie e mostre no ecrã uma nova instância da classe Veiculo com matrícula 44-55-DD, azul e com cilindrada de 2500 cc. Use a interface Cores para definir a cor do novo veículo.

        Veiculo veiculo1 = new Veiculo("44-55-DD", 2500, Cores.AZUL);
        System.out.println(veiculo1.toString());

        // 7. Crie e mostre no ecrã uma nova instância da classe Veiculo com matrícula 11-22-BB, verde e com cilindrada 1400 cc. Especifique a cor do novo veículo através da classe Veiculo.

        Veiculo veiculo2 = new Veiculo("11-22-BB", 1400, Veiculo.VERDE);
        System.out.println(veiculo2.toString());

        // 11. Crie e mostre no ecrã uma instância da classe Moradia com a morada Rua do Bocage, com cor cinzenta e com área de 90 metros quadrados.

        Moradia moradia = new Moradia("Rua do bocage", 90, Cores.CINZENTO);
        System.out.println(moradia.toString());

        //12. Crie e imprima o conteúdo de uma variável capaz de guardar qualquer referência das instâncias existentes.

        Cores cores = veiculo2;
        cores = moradia;

        System.out.println(cores);

        // 14. Crie um contentor de objetos do tipo array, chamado tributaveis, para armazenar todas as instâncias existentes.

        Tributavel[] tributaveis = new Tributavel[7];

        // 15. Guarde no contentor todas as instâncias criadas

        tributaveis[0] = veiculo;
        tributaveis[1] = veiculo1;
        tributaveis[2] = veiculo2;
        tributaveis[3] = moradia;

        // 16. Mostre no ecrã o total do imposto aplicado às instâncias do contentor.

        System.out.println();
        System.out.println("*****Instâncias criadas*****");
        double totalImpostos = 0;
        for (int i = 0; i < tributaveis.length; i++) {
            if(tributaveis[i] != null) {
                mostrarImposto(tributaveis[i]);
                totalImpostos += tributaveis[i].calcularImposto();
            }
        }
        System.out.println("Total de impostos = " + totalImpostos + " euros");

    }
    // 17. Crie e invoque um método para imprimir no ecrã o imposto aplicado a um objeto recebido por parâmetro, do tipo Veiculo ou Moradia
    public static void mostrarImposto(Tributavel tributavel){
        System.out.println(tributavel.toString() + ": Imposto: " + tributavel.calcularImposto() + " euros!");
    }
}
