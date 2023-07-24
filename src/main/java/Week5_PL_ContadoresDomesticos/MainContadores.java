package Week5_PL_ContadoresDomesticos;

import java.util.ArrayList;
import java.util.List;

public class MainContadores {
    public static void main(String[] args) {
        // a) Construa objetos de cada uma das classes instanciáveis e guarde-os num contentor do tipo array;

        EletricidadeTarifaBiHorario eletricidadeTarifaBiHorario = new EletricidadeTarifaBiHorario("ELECT-1", "António Luís", 100, 250);
        EletricidadeTarifaBiHorario eletricidadeTarifaBiHorario1 = new EletricidadeTarifaBiHorario("ELECT-2", "Manuel Andrade", 200, 300);
        EletricidadeTarifaBiHorario eletricidadeTarifaBiHorario2 = new EletricidadeTarifaBiHorario("ELECT-3", "Ana Teixeira", 50, 230);

        Gas contadorGas = new Gas(240, "GAS-1", "Maria Pereira");
        Gas contadorGas1 = new Gas(200, "GAS-2", "Érica Santos");
        Gas contadorGas2 = new Gas(230, "GAS-3", "Sérgio Inácio");

        EletricidadeTarifaSimples eletricidadeTarifaSimples = new EletricidadeTarifaSimples(190, "ELECT-4", "Joana Moutinho", 5.6);
        EletricidadeTarifaSimples eletricidadeTarifaSimples1 = new EletricidadeTarifaSimples(230, "ELECT-5", "Susana Lopes", 7.4);
        EletricidadeTarifaSimples eletricidadeTarifaSimples2 = new EletricidadeTarifaSimples(180, "ELECT-6", "Duarte Pinto", 5);

        // b) Liste os identificadores dos contadores, acompanhados dos respetivos nomes dos clientes, armazenados no contentor;

        List<Contadores> listaContadores = new ArrayList<>();
        listaContadores.add(eletricidadeTarifaBiHorario);
        listaContadores.add(eletricidadeTarifaBiHorario1);
        listaContadores.add(eletricidadeTarifaBiHorario2);
        listaContadores.add(eletricidadeTarifaSimples);
        listaContadores.add(eletricidadeTarifaSimples1);
        listaContadores.add(eletricidadeTarifaSimples2);
        listaContadores.add(contadorGas);
        listaContadores.add(contadorGas1);
        listaContadores.add(contadorGas2);

        System.out.println("#####Contadores####");
        System.out.println();
        int contadores = 0;

        for (Contadores contador: listaContadores) {
            contadores++;
            System.out.println(contador.toString());
        }

        // c) Mostre a quantidade de contadores de eletricidade criados;

        System.out.println();
        System.out.println("####Número de contadores criados####");
        System.out.println();
        System.out.println(contadores);

        // d) Liste os identificadores dos contadores de eletricidade com tarifário bi-horário, armazenados no contentor;

        System.out.println();
        System.out.println("####Contadores de eletricidade com tarifário bi-horário####");
        System.out.println();
        for (Contadores contador : listaContadores) {
            if(contador instanceof EletricidadeTarifaBiHorario){
                System.out.println(contador.toString());
            }
        }

        // e) Liste os identificadores dos contadores, acompanhados do respetivo custo do consumo. Para o efeito deve usar o mecanismo do polimorfismo, sem recorrer ao método reescrito toString;

        System.out.println();
        for (Contadores contador : listaContadores) {
            System.out.println("Identificador : " + contador.getIdentificacao() + ", custo do consumo = " + contador.calcularCustoConsumo() + " euros!");
        }

        // f) Mostre o maior valor consumido de gás;
        System.out.println();
        System.out.println("####Maior valor consumido de gás####");
        int maiorConsumoGas = 0;
        for (Contadores contador : listaContadores) {
            if(contador instanceof Gas){
                if (contador.getConsumoMesAtual() > maiorConsumoGas){
                    maiorConsumoGas = contador.getConsumoMesAtual();
                }
            }
        }
        System.out.println();
        System.out.println(maiorConsumoGas + " m3");

        // g) Liste os nomes dos clientes, sem repetições, que possuem contadores

        System.out.println();
        System.out.println("####Nomes dos clientes####");
        System.out.println();
        for (Contadores contador : listaContadores) {
            System.out.println("nome do cliente : " + contador.getNomeCliente());
        }
    }
}
