package Week8_PL.Empregado;

import java.util.ArrayList;

public class MainEmpregado {
    public static void main (String[]args){

        // a) Crie e visualize uma instância de Data para representar a data atual;

        Data dataAtual = new Data(2023, 8, 15);
        System.out.println("a)");
        System.out.println(dataAtual);

        // b) Crie e visualize duas instâncias de Tempo;

        Tempo tempo = new Tempo(23, 23,23);
        Tempo tempo1 = new Tempo();
        System.out.println();
        System.out.println("b)");
        System.out.println(tempo);
        System.out.println(tempo1);

        // c) Crie duas instâncias de Empregado usando para o efeito as instâncias de Data e de Tempo criadas anteriormente;

        Empregado empregado = new Empregado("João", "Figueiras", tempo, tempo1, dataAtual);
        Empregado empregado1 = new Empregado("Maria", "Soares", tempo, tempo1, dataAtual);
        System.out.println();
        System.out.println("c)");
        System.out.println(empregado);
        System.out.println(empregado1);

        // d) Verifique se os atributos do tipo Data dos empregados criados possuem referências partilhadas;

        boolean dataContratacaoShared = empregado.getDataContrato() == empregado1.getDataContrato();

        System.out.println();
        System.out.println("d)");
        System.out.println("Data Contratacao shared: " + dataContratacaoShared);

        // e) Verifique se os atributos do tipo Tempo dos empregados criados possuem referências partilhadas;

        boolean tempoInicioShared = empregado.getHoraEntrada() == empregado1.getHoraEntrada();
        boolean tempoFimShared = empregado.getHoraSaida() == empregado1.getHoraSaida();

        System.out.println("e)");
        System.out.println();
        System.out.println("Tempo Inicio shared: " + tempoInicioShared);
        System.out.println("Tempo Fim shared: " + tempoFimShared);

        // f) Altere o conteúdo do objeto Data e o conteúdo dos objetos Tempo inicialmente criados;

        dataAtual.setData(2004, 1,8);
        tempo.setTempo(15, 8,11);
        tempo1.setTempo(23,45,23);

        // g) Visualize as instâncias de Data e de Tempo, bem como as instâncias de Empregado criadas;

        System.out.println();
        System.out.println("g)");
        System.out.println(dataAtual);
        System.out.println(tempo);
        System.out.println(tempo1);
        System.out.println(empregado);
        System.out.println(empregado1);

        // h) Altere a data de contrato e as horas de entrada e de saída do segundo empregado;

        Data data = new Data(2015, 6, 7);
        Tempo horaEntrada = new Tempo(9, 0,0);
        Tempo horaSaida = new Tempo(17, 0,0);
        empregado1.setDataContrato(data);
        empregado1.setHoraSaida(horaSaida);
        empregado1.setHoraEntrada(horaEntrada);
        System.out.println();
        System.out.println("h)");
        System.out.println(empregado1);

        // i) Armazene as instâncias de Empregado criadas num contentor de objetos do tipo ArrayList;

        ArrayList<Empregado> list = new ArrayList<>();
        list.add(empregado);
        list.add(empregado1);

        // j) Liste todos os empregados;

        System.out.println();
        System.out.println("j)");
        for (Empregado empregados :
             list) {
            System.out.println(empregados);
        }

        // k) Liste o nome, o número de horas de trabalho por semana e a antiguidade de cada um dos empregados.

        System.out.println();
        System.out.println("k)");
        for (Empregado empregados:
             list) {
            System.out.println();
            System.out.printf("%s %s trabalha %d horas por semana, sendo que assinou contrato há %d dias!", empregados.getPrimeiroNome(), empregados.getUltimoNome(),empregados.calcularNumeroHorasSemanais(empregados.getHoraEntrada(), empregados.getHoraSaida())
            , empregados.determinarTempoDeContrato(empregados.getDataContrato()));
        }
    }
}
