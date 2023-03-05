package org.example;

public class AutomovelMain {
    public static void main(String[] args) {
        //a) Crie uma instância da classe Automovel, designada a1, com a marca Toyota, matrícula 11-11-AA e cilindrada 1400 cc;
        Automovel a1 = new Automovel("11-11-AA", "Toyota", 1400);

        //b) Mostre o automóvel a1 no ecrã;
        System.out.println("Automovel a1 : " + a1.toString());

        //c) Mostre apenas a matrícula do automóvel a1;
        System.out.println("Matricula de a1 : " + a1.getMatricula());

        //d) Mostre a quantidade de instâncias Automovel criadas;
        System.out.println("Quantidade de instâncias Automovel : " + a1.getTotalAutomoveis());

        //e) Crie uma nova instância da classe Automovel, designada a2, com a marca Audi e matrícula 22-22-BB;
        Automovel a2 = new Automovel("22-22-BB", "Audi");

        //f) Mostre o automóvel a2;
        System.out.println("Automovel a2 : " + a2.toString());

        //g) Modifique a cilindrada do automóvel a2 para 1800 cc;
        int cilindrada = 1800;
        a2.setCilindrada(cilindrada);

        //h) Mostre novamente o automóvel a2 no ecrã;
        System.out.println("Automovel a2 : " + a2.toString());

        //i) Mostre novamente a quantidade de instâncias Automovel criadas;
        System.out.println("Quantidade de instâncias Automvel : " + a2.getTotalAutomoveis());

        //j) Mostre a diferença de cilindrada (valor absoluto) entre os automóveis a1 e a2;
        System.out.println("Diferença de cilindrada entre a1 e a2 : " + Math.abs(a1.calcularDiferencaCilindrada(a2)));

        //k) Mostre a matrícula do automóvel que tem a maior cilindrada entre os automóveis a1 e a2;
        if(a1.isCilindradaMaior(a2)){
            System.out.println(a1.getMatricula());
        } else if (a2.isCilindradaMaior(a1)) {
            System.out.println(a2.getMatricula());
        }else{
            System.out.println("Os automóveis tem igual cilindrada");
        }

        //l) Verifique se a cilindrada do automóvel a1 é superior a 2000 cc.
        cilindrada = 2000;
        if(a1.isCilindradaMaior(cilindrada)){
            System.out.println("A cilindrada de a1 é superior a " + cilindrada);
        }else{
            System.out.println("O automóvel a1 tem cilindrada inferior ou igual a " + cilindrada);
        }
    }
}