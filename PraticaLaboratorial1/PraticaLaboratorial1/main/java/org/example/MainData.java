package org.example;

public class MainData {
    public static void main(String[] args) {
        //a) Crie uma instância da classe Data com o nome data1 e que represente a data de hoje.
        Data data1 = new Data(2023, 03, 05);

        //b) Mostre data1 usando o formato por extenso.
        System.out.println("Data 1 por extenso : " + data1.toString());

        //c) Crie uma outra instância da classe Data chamada data2 que guarde a data 25 de abril de 1974.
        Data data2 = new Data(1974, 04, 25);

        //d) Mostre data2 no formato "ano/mês/dia".
        System.out.println("Data 2 no formato ano/mês/dia : " + data2.toAnoMesDiaString());

        //e) Utilize o método de instância isMaior para confirmar que, de facto, data1 é mais recente do que data 2.
        if (data1.isMaior(data2)) {
            System.out.println("A data1 é mais recente que a data2");
        } else if (data2.isMaior(data1)) {
            System.out.println("A data2 é mais recente que a data 1");
        } else {
            System.out.println("A data1 e a data2 são iguais");
        }

        //f) Determine o número de dias entre data1 e data2.
        System.out.println("Existem " + data1.calcularDiferenca(data2) + " dias entre a data1 e a data2");

        //g) Determine o número de dias que faltam para o Natal, usando o método que recebe, por parâmetro, o dia, o mês e o ano de uma data.
        System.out.println("Faltam " + data1.calcularDiferenca(2023, 12, 25) + " dias para o Natal");

        //h) Determine o dia da semana em que ocorreu o dia 25 de abril de 1974.
        System.out.println("O 25 de abril foi numa " + data2.determinarDiaDaSemana());

        //i) Verifique se o ano 1974 foi bissexto, invocando o método de classe isAnoBissexto:
           //Através do objeto data2 :
            int ano = data2.getAno();
            if(data2.isAnoBissexto(ano)){
                System.out.println("Ano bissexto");
            }else {
                System.out.println("O ano não é bissexto");
            }
            //Através da classe Data :
            if(data2.isAnoBissexto(1974)){
               System.out.println("Ano bissexto");
            }else {
               System.out.println("O ano não é bissexto");
        }
    }
}