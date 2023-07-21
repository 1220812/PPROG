package Week4_PL_Vencimentos;

public class MainVencimentos {
    public static void main(String[] Args) {
        //3. Nesta classe, crie 3 objetos, um para cada tipo de trabalhador:

        //Objeto do tipo TrabalhadorPeca, de nome Jorge Silva que produziu 53 peças do tipo 1 e 62 do tipo 2;

        TrabalhadorPeça trabalhadorPeça = new TrabalhadorPeça("Jorge Silva", 53, 62);

        //Objeto do tipo TrabalhadorComissao, de nome Susana Ferreira, com o salário base de 650,00€ e uma comissão de 4,25% sobre as vendas efetuadas que totalizaram o valor de 2731,50€;

        TrabalhadorComissao trabalhadorComissao = new TrabalhadorComissao("Susana Ferreira", 650, 2731.50f, 4.25f);

        //Objeto do tipo TrabalhadorHora, de nome Carlos Miguel, que ganha por hora 4,50€ e com um total de horas de trabalho igual a 168.

        TrabalhadorHora trabalhadorHora = new TrabalhadorHora("Carlos Miguel", 168, 4.50f);

        //4. Crie um contentor de objetos para guardar os objetos existentes. Este contentor deve ser um array do tipo Object com comprimento 10.

        Object[] objects = new Object[10];

        //5. Guarde os objetos existentes no contentor.

        objects[0] = trabalhadorPeça;
        objects[1] = trabalhadorComissao;
        objects[2] = trabalhadorHora;

        //6. Programe as seguintes listagens independentes, obtidas através do varrimento do contentor com uma instrução for tradicional:
        //Listagem das representações textuais dos trabalhadores;

        for (int i = 0; i < objects.length; i++) {
            if (objects[i] != null) {
                System.out.println(objects[i].toString());
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
            }
        }

        //Listagem das representações textuais apenas dos trabalhadores à hora;

        for (int i = 0; i < objects.length; i++) {
            if(objects[i] != null){
                if(objects[i] instanceof TrabalhadorHora){
                    System.out.println(objects[i].toString());
                    System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
                }
            }
        }

        //Listagem dos nomes dos trabalhadores existentes, acompanhadas dos respetivos vencimento (com duas casas decimais).

        for (int i = 0; i < objects.length; i++) {
            if (objects[i] != null) {
                if (objects[i] instanceof Trabalhador) {
                    double vencimento = ((Trabalhador) objects[i]).calcularVencimento();
                    System.out.printf("Trabalhador: %s, ofere, mensalmente, de %.2f euros.", ((Trabalhador) objects[i]).getNome(), vencimento);
                    System.out.println();
                }
            }
        }

        //7. Substitua o tipo Object do array pelo tipo Trabalhador (é o tipo mais genérico da hierarquia de classes).

        Trabalhador[] trabalhador = new Trabalhador[10];
        trabalhador[0] = trabalhadorPeça;
        trabalhador[1] = trabalhadorComissao;
        trabalhador[2] = trabalhadorHora;

        //8. Simplifique o código das listagens

        for (Trabalhador trabalhadores : trabalhador) {
            if (trabalhadores != null) {
                System.out.println(trabalhadores.toString());
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
            }
        }

        for (Trabalhador trabalhadores : trabalhador) {
            if(trabalhadores != null){
                if (trabalhadores instanceof TrabalhadorHora){
                    System.out.println(trabalhadores.toString());
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
                }
            }
        }

        for (Trabalhador trabalhadores : trabalhador) {
            if (trabalhadores != null){
                float vencimento = trabalhadores.calcularVencimento();
                System.out.printf("O trabalhador %s ofere de %.2f euros por mês!", trabalhadores.getNome(), vencimento);
                System.out.println();
            }
        }
    }
}
