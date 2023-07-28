package Week6_TP_AutomovelComMatricula;

import Week6_TP.Biblioteca.Pessoa;
import Week6_TP.Biblioteca.Data;

public class MainAutomovel {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Jorge", 1234567);
        System.out.println("\n#### Listagem da Pessoa ####");
        System.out.println(p1);

        Automovel a1 = new Automovel("KIA", p1);
        System.out.println(a1);

        p1.setNome("Jorge Paixão");
        System.out.println("\n#### Atualização do proprietário ####");
        System.out.println(p1);
        System.out.println(a1);

        // 4. Nova visualização das duas instâncias.

        // a) Criação de uma matrícula 11-11-AA registada em 2015/4/4. Para tal, começa-se por criar uma instância de Data e depois a instância de Matricula.

        Data d = new Data(2015, 4, 4);
        Matricula m = new Matricula("11-11-AA", d);

        // b)  Visualização das duas instâncias criadas

        System.out.println("\n#### Listagem da Data e Matrícula ####");
        System.out.println(d);
        System.out.println(m);

        // c) Alteração do valor, na instância Data, para 2016/4/4.

        d.setData(2016, 4, 4);

        // d) Nova visualização das duas instâncias.

        System.out.println("\n#### Listagem da Data e Matrícula - Nova Data ####");
        System.out.println(d);
        System.out.println(m);

        // 7. Na classe MainAutomovel verifique a aplicação da classe Automovel:

        // a) Criação e visualização do automóvel do Jorge Paixão com a matrícula 11-11-AA, registada em 2015/4/4.
        Automovel a = new Automovel("KIA", m, p1);
        System.out.println("\n#### Listagem do Automovel ####");
        System.out.println(a);

        // b) Atualização, da instância de Matricula, com a matrícula 22-22-BB e visualização da instância matrícula e da instância automóvel.

        m.setMatricula("22-22-BB");
        System.out.println("\n#### Listagem da Matricula e Automovel - Nova Matrícula ####");
        System.out.println(m);
        System.out.println(a);

        // 10. Altere a classe Automovel de modo a permitir a clonagem das suas instâncias, através do construtor de cópia que se encontra comentado. Verifique o teste implementado para este construtor.

        System.out.println("\n#### Clone ####");
        System.out.println(new Automovel(a));
    }
}
