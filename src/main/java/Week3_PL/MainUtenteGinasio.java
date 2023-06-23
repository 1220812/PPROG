package Week3_PL;

public class MainUtenteGinasio {
    public static void main(String[] args) {

        // a) crie um conjunto de instâncias de utentes;

        UtenteGinasio utente1 = new UtenteGinasio("João", 20, 1.80, 80, "Masculino");
        UtenteGinasio utente2 = new UtenteGinasio();
        UtenteGinasio utente3 = new UtenteGinasio("Maria", 19);
        UtenteGinasio utente4 = new UtenteGinasio("Manuel", 18, 80, 1.80, "Masculino");

        // b) armazene estas instâncias num contentor do tipo array;

        UtenteGinasio[] utentes = new UtenteGinasio[5];
        utentes[0] = utente1;
        utentes[1] = utente2;
        utentes[2] = utente3;
        utentes[3] = utente4;

        //c) programe as seguintes listagens separadas, sobre o contentor para:
        //i. obter a representação textual e legível de cada utente;

        System.out.println("*****Representação dos utentes*****");
        for (int i = 0; i < utentes.length; i++) {
            if (utentes[i] != null) {
                System.out.println(utentes[i]);
            }
        }
        System.out.println();

        //ii. obter o nome, valor do IMC e grau de obesidade de cada utente;

        System.out.println("*****Representação dos nomes, IMCs e grau de obesidade de cada utente*****");
        for (int i = 0; i < utentes.length; i++) {
            if (utentes[i] != null) {
                System.out.printf("Nome= %s, IMC= %.1f - grau de obesidade: %s", utentes[i].getNome(), utentes[i].calcularIMC(utentes[i].getAltura(), utentes[i].getPeso()), utentes[i].determinarGrauObesidade(utentes[i].calcularIMC(utentes[i].getAltura(), utentes[i].getPeso())));
                System.out.println();
            }
        }
        System.out.println();

        //iii. obter o nome e o grau de obesidade de cada utente que não tenha a classificação “Saudável”.

        System.out.println("*****Representação dos nomes e grau de obesidade de cada utente com classificação Saudavel*****");
        for (int i = 0; i < utentes.length; i++) {
            if (utentes[i] != null) {
                if (utentes[i].grauObesidadeSaudavel(utentes[i])) {
                    System.out.printf("Nome: %s, grau de obesidade: %s", utentes[i].getNome(), utentes[i].determinarGrauObesidade(utentes[i].calcularIMC(utentes[i].getAltura(), utentes[i].getPeso())));
                }
            }
        }

        // d) altere o valor da idade de um utente para o valor da idade de outro;

        int idadeUtente = utente1.getIdade();
        utente2.setIdade(idadeUtente);
        System.out.println(utente2.getIdade());

        // e) invoque o método para determinar qual dois utentes, usados na alínea anterior, é o mais novo. Implemente código para apresentar uma mensagem adequada.

        int valor = utente1.determinarMaisNovo(utente2);

        if(valor > 0){
            System.out.println("O utente " + utente1 + " é o mais novo");
        }else if(valor < 0){
            System.out.println("O utente " + utente2 + " é o mais novo");
        }else {
            System.out.println("Os utentes têm a mesma idade");
        }
    }
}
