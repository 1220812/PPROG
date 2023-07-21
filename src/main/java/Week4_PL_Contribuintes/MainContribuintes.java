package Week4_PL_Contribuintes;

import java.lang.reflect.Array;

public class MainContribuintes {
    public static void main(String[] args) {

        // a) Criação de dois objetos de cada classe instanciável.

        Reformado reformado1 = new Reformado("João Mota", "Lisboa", 1500f, 735f);
        Reformado reformado2 = new Reformado("Manuel Inácio", "Setúbal", 935f, 1200f);

        Desempregado desempregado1 = new Desempregado("Rui Maria", "Bragança", 250f, 7);
        Desempregado desempregado2 = new Desempregado("Maria Pereira", "Vila Real", 450f, 3);

        TrabalhadorContaPropria trabalhadorContaPropria1 = new TrabalhadorContaPropria("António Vaz", "Porto", 760f, 900f, "Canalizador");
        TrabalhadorContaPropria trabalhadorContaPropria = new TrabalhadorContaPropria("Ana Silva", "Aveiro", 3000f, 0f, "Advogada");

        TrabalhadorPorContaOutrem trabalhadorPorContaOutrem1 = new TrabalhadorPorContaOutrem("Susana Peixoto", "Castelo Branco", 780f, 0f, "Enlatados, lda");
        TrabalhadorPorContaOutrem trabalhadorPorContaOutrem2 = new TrabalhadorPorContaOutrem("Fábio Brás", "Viseu", 670f, 340f, "Continente");

        // b) Criação e preenchimento um contentor do tipo array com comprimento superior ao número de objetos criados.

        Contribuinte[] contribuintes = new Contribuinte[10];
        contribuintes[0] = reformado1;
        contribuintes[1] = reformado2;
        contribuintes[2] = desempregado1;
        contribuintes[3] = desempregado2;
        contribuintes[4] = trabalhadorContaPropria1;
        contribuintes[5] = trabalhadorContaPropria;
        contribuintes[6] = trabalhadorPorContaOutrem1;
        contribuintes[7] = trabalhadorPorContaOutrem2;

        // c) Varrimento do contentor para apresentação de cada objeto e respetivo valor do imposto extraordinário.

        for (Contribuinte contribuinte:
             contribuintes) {
            if(contribuinte != null){
                System.out.println(contribuinte.toString());
            }
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        // d) Varrimento do contentor para apresentação do nome e imposto extraordinário a pagar pelos contribuintes desempregados.

        System.out.println("Desempregados:");
        System.out.println();
        for (Contribuinte contribuinte:
             contribuintes) {
            if(contribuinte !=  null && contribuinte instanceof Desempregado){
                System.out.println(contribuinte.getNome() + " irá pagar " + contribuinte.calcularValorImposto() + " euros");
            }
        }
    }
}
