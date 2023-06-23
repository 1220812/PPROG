package Week2_PL;

import java.sql.SQLOutput;

public class MainData {
    public static void main(String[] args) {

        // a) Crie uma instância da classe Data com o nome data1 e que represente a data de hoje.

        Data data1 = new Data(2023, 6, 21);

        // b) Mostre data1 usando o formato por extenso.

        System.out.println(data1.toString());

        // c) Crie uma outra instância da classe Data chamada data2 que guarde a data 25 de abril de 1974.

        Data data2 = new Data(1974, 4, 25);

        // d) Mostre data2 no formato "ano/mês/dia".

        System.out.println(data2.toAnoMesDiaString());

        // e) Utilize o método de instância isMaior para confirmar que, de facto, data1 é mais recente do que data2.

        if (data1.isMaior(data2)) {
            System.out.println("A data1 é mais recente que a data2");
        } else if (data2.isMaior(data1)) {
            System.out.println("A data2 é mais recente que a data1");
        } else {
            System.out.println("A data1 e a data2 são iguais");
        }

        // f) Determine o número de dias entre data1 e data2.

        System.out.println("Entre a data1 e a data2 existem uma diferença de " + Math.abs(data1.calcularDiferenca(data2)) + " dias.");

        // g) Determine o número de dias que faltam para o Natal, usando o método que recebe, por parâmetro, o dia, o mês e o ano de uma data.

        System.out.println("Faltam " + data1.calcularDiferenca(2023, 12, 25) + " dias para o natal.");

        // h) Determine o dia da semana em que ocorreu o dia 25 de abril de 1974.

        System.out.println("O 25 de abril de 1974 ocorreu num(a) " + data2.determinarDiaDaSemana());

        // i) Verifique se o ano 1974 foi bissexto, invocando o método de classe isAnoBissexto:

        //▪ Através do objeto data2;

        if(data2.isAnoBissexto(data2.getAno())) {
            System.out.println("O ano " + data2.getAno() + " foi bissexto");
        }else{
            System.out.println("O ano " + data2.getAno() + " foi comum");
        }

        //▪ Através da classe Data.

        if (Data.isAnoBissexto(data2.getAno())) {
            System.out.println("O ano " + data2.getAno() + " foi bissexto");
        } else {
            System.out.println("O ano " + data2.getAno() + " foi comum");
        }
    }
}
