package Week3_PL;

public class MainTempo {
    public static void main(String[]args){

        // a) Crie uma instância da classe Tempo com o nome t1 e que represente o tempo: 5 horas, 30 minutos e 12 segundos.

        Tempo t1 = new Tempo(5,30,12);

        // b) Mostre o tempo t1 usando o formato "hh:mm:ss AM (ou PM)".

        System.out.println(t1.toString2());

        // c) Acrescente 1 segundo ao tempo t1.

        t1.acrescentarUmSegundo();

        // d) Mostre novamente t1 usando o formato "hh:mm:ss AM (ou PM)".

        System.out.println(t1.toString2());

        // e) Crie uma outra instância da classe Tempo chamada t2 que guarde o tempo: 18 horas, 5 minutos e 20 segundos.

        Tempo t2 = new Tempo(18,5,20);

        // f) Mostre o tempo t2 usando o formato "hh:mm:ss AM (ou PM)".

        System.out.println(t2.toString2());

        // g) Verifique se o tempo t1 é maior do que o tempo t2.

        if(t1.eMaior(t2)){
            System.out.println("O tempo t1 é maior que o tempo t2");
        }else if(t2.eMaior(t1)){
            System.out.println("O tempo t2 é maior que o tempo t1");
        }else {
            System.out.println("Os tempos t1 e t2 são iguais");
        }

        // h) Verifique se o tempo t1 é maior do que o tempo 23 horas, 7 minutos e 4 segundos usando o método que recebe por parâmetro as horas, os minutos e os segundos de um tempo

        if(t1.eMaior(23,7,4)){
            System.out.println("O tempo t1 é maior que o tempo cujas as instâncias foram passadas por parâmetro");
        }else {
            System.out.println("O tempo t1 é menor que o tempo cujas as instâncias foram passadas por parâmetro");
        }

        // i) Determinar a diferença entre o tempo t1 e o tempo t2:

            // em segundos;

        System.out.println("diferença = " + t1.diferencaEntreTemposSegundos(t2));

            // em Tempo.

        Tempo diferencaTempos = t1.diferencaEntreTempos(t2);
        System.out.println(diferencaTempos.toString());
    }
}
