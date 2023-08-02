package Week7_TP;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestePessoa {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Pessoa p = new Pessoa();

        boolean dadosInvalidos = true;

        do {
            try {
                System.out.print("Nome:");
                String nome = ler.nextLine();
                p.setNome(nome);

                System.out.print("Nº de ID Civil:");
                int idCivil = ler.nextInt();
                ler.nextLine();
                p.setIDCivil(idCivil);

                dadosInvalidos = false;

            } catch (IllegalArgumentException e) {

                System.out.println("\nERRO: " + e.getMessage()
                        + " (" + e.getClass().getSimpleName() + ")");

            } catch (InputMismatchException e) {

                System.out.println("\nERRO: Número de ID Civil inválido !!!"
                        + " (" + e.getClass().getSimpleName() + ")");
                ler.nextLine();
            }
            System.out.println("Pessoa : " + p);
        } while (dadosInvalidos);

    }
}